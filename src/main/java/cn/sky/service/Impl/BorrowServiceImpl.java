package cn.sky.service.Impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sky.dao.BookDao;
import cn.sky.dao.BorrowDao;
import cn.sky.entity.Back;
import cn.sky.entity.Book;
import cn.sky.entity.BookCheck;
import cn.sky.entity.BookInfo;
import cn.sky.entity.BookType;
import cn.sky.entity.Borrow;
import cn.sky.entity.BorrowForm;
import cn.sky.service.BorrowService;

@Service("borrowService")
public class BorrowServiceImpl implements BorrowService {

	@Resource
	private BorrowDao borrowDao;
	
	@Resource
	private BookDao bookDao;
	
	public List<Borrow> findByReaderId(int readerid) {
		List<Borrow> borrows = borrowDao.findByReaderId(readerid);
		return borrows;
	}

	public int addBorrow(Borrow borrow) {
		int i = borrowDao.addBorrow(borrow);
		if(i==0){
			throw new RuntimeException("增加失败");
		}
		return i;
	}

	public int updateBorrow(Borrow borrow) {
		
		int i = borrowDao.updateBorrow(borrow);
		if(i==0){
			throw new RuntimeException("修改失败");
		}
		return i;
	}

	public Borrow findBorrowById(int id) {
		Borrow borrow = borrowDao.findBorrowById(id);
		return borrow;
	}

	public List<BorrowForm> findBorrowForm(int readerid) {
		List<BorrowForm> borrowForms = new ArrayList<BorrowForm>();
		
		
		//根据readerid 找到 id bookid 的Map
		Integer id = null;
		Integer bookId =null;
		List<Map<Integer,Integer>> list = borrowDao.findMapByReaderId(readerid);
		for(Map<Integer,Integer> map:list){
			  for (Object key : map.keySet()) {
				   if("id".equals(key)){
					   id = new Integer(String.valueOf(map.get(key)));
				   }
				   if("bookid".equals(key)){
					   bookId=  map.get(key);
				   }
			  }
			  BorrowForm borrowForm = new BorrowForm();
				  //根据id找到借出时间 和 应还时间
				  borrowForm.setBorrowTime(borrowDao.findBorrowById(id).getBorrowTime());
				  borrowForm.setBackTime(borrowDao.findBorrowById(id).getBackTime());
				  
				  //根据bookId找到bookname,pubname,booktype,bookcase
				  borrowForm.setBookid(bookId);
				  borrowForm.setBookname(bookDao.finBookById(bookId).getBookname());
				  borrowForm.setPubname(bookDao.finBookById(bookId).getPubname());
				  borrowForm.setBookcase(bookDao.finBookById(bookId).getCasename());
				  borrowForm.setBooktype(bookDao.finBookById(bookId).getType());
		     borrowForms.add(borrowForm);
	     }
		return borrowForms;
	}
	
	
	
	//根据书的 barcode 查询书的bookCheck
	public List<BookCheck> findBookCheckByBarcode(String barcode) {
		List<BookCheck> bookChecks = new ArrayList<BookCheck>();
		BookCheck bookCheck = new BookCheck();
		List<Book> books = bookDao.findByBarcode(barcode);
		for(Book book:books){
			bookCheck.setBookname(book.getBookname());
			bookCheck.setBookcase(book.getCasename());
			bookCheck.setPubname(book.getPubname());
			bookCheck.setBooktype(book.getType());
			BookInfo bookInfo = bookDao.findBookInfoById(Integer.parseInt(book.getId()));
			BookType bookType = bookDao.findBookTypeById(bookInfo.getTypeId());
			bookCheck.setDays(bookType.getDays());
			bookCheck.setBookId(bookInfo.getId());
			if(bookInfo.getDel()==1){
				bookCheck.setBookstatus("1");
			}
			if(bookInfo.getDel()==0){
				bookCheck.setBookstatus("0");
			}
			bookChecks.add(bookCheck);
		}
		if(bookChecks.isEmpty()){
			throw new RuntimeException("根据图书条码查不到此书");
		}
		return bookChecks;
	}
	
	//根据书的 bookname 查询书的bookCheck
	public List<BookCheck> findBookCheckByBookname(String bookname) {
		List<BookCheck> bookChecks = new ArrayList<BookCheck>();
		BookCheck bookCheck = new BookCheck();
		List<Book> books = bookDao.findByBookname(bookname);
		for(Book book:books){
			bookCheck.setBookname(book.getBookname());
			bookCheck.setBookcase(book.getCasename());
			bookCheck.setPubname(book.getPubname());
			bookCheck.setBooktype(book.getType());
			BookInfo bookInfo = bookDao.findBookInfoById(Integer.parseInt(book.getId()));
			BookType bookType = bookDao.findBookTypeById(bookInfo.getTypeId());
			bookCheck.setDays(bookType.getDays());
			bookCheck.setBookId(bookInfo.getId());
			if(bookInfo.getDel()==1){
				bookCheck.setBookstatus("1");
			}
			if(bookInfo.getDel()==0){
				bookCheck.setBookstatus("0");
			}
			bookChecks.add(bookCheck);
		}
		if(bookChecks.isEmpty()){
			throw new RuntimeException("根据图书名称查不到此书");
		}
		return bookChecks;
	}

	public int BorrowActivity(int readerId, int bookId, String operator) {
		//1.修改tb_bookinfo del状态
		BookInfo bookInfo = bookDao.findBookInfoById(bookId);
		bookInfo.setDel(1);
		int i = bookDao.updateBookInfo(bookInfo);
		if(i!=1){
			throw new RuntimeException("bookinfo操作失败");
		}
		
		//2.增加tb_borrow  
		BookType bookType = bookDao.findBookTypeById(bookInfo.getTypeId());
		int days = bookType.getDays();
		
		Date borrowTime = new Date(new java.util.Date().getTime());
		Calendar calendar =new GregorianCalendar();  
		calendar.setTime(borrowTime);  
		calendar.add(Calendar.DATE, days);  
		java.util.Date utilDate = (java.util.Date)calendar.getTime(); 
		Date backTime = new Date(utilDate.getTime());
		
		Borrow borrow = new Borrow(readerId, bookId, borrowTime, backTime, operator);
		int j = borrowDao.addBorrow(borrow);
		if(j!=1){
			throw new RuntimeException("tb_borrow操作失败");
		}
		int n = i+j;
		if(n!=2){
			throw new RuntimeException("操作失败");
		}
		return n;
	}

	public int BackActivity(int readerId, int bookId, String operator) {
		//1.写入tb_giveback
		Date backTime = new Date(new java.util.Date().getTime());
		Back back = new Back(readerId,bookId,backTime,operator);
		int i = borrowDao.addBack(back);
		if(i!=1){
			throw new RuntimeException("tb_giveback操作失败");
		}
		
		//2.修改tb_borrow ifback为0
		int k = 0;
		List<Borrow> borrows = borrowDao.findBorrowByReaderId(readerId);
		for(Borrow borrow:borrows){
			if(borrow.getBookId()==bookId){
				borrow.setIfback(1);
				k = borrowDao.updateBorrow(borrow);
			}
		}
		
		//3.修改tb_bookinfo del为0
		BookInfo bookInfo = bookDao.findBookInfoById(bookId);
		bookInfo.setDel(0);
		int j = bookDao.updateBookInfo(bookInfo);
		if(j!=1){
			throw new RuntimeException("tb_bookinfo操作失败");
		}
		return i+j+k;
	}

}
