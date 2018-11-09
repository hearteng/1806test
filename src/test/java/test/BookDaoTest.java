package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.sky.dao.BookDao;
import cn.sky.entity.Book;
import cn.sky.entity.BookCase;
import cn.sky.entity.BookInfo;
import cn.sky.entity.BookType;
import cn.sky.entity.Publishing;

public class BookDaoTest extends BaseTestCase {
	BookDao dao;
	@Before
	public void Binit(){
		dao = ctx.getBean("bookDao",BookDao.class);
	}
	
	@Test
	public void FindAll(){
		List<Book> list = dao.findAllBook();
		for(Book b : list){
			System.out.println(b);
		}
	}
	@Test
	public void FindTypeList(){
		List<BookType> list = dao.findAllBookType();
		for(BookType b:list){
			System.out.println(b);
		}
	}
	@Test
	public void FindPubList(){
		List<Publishing> list = dao.findAllPublishing();
		for(Publishing p:list){
			System.out.println(p);
		}
	}
	@Test
	public void FindTypeById(){
		int id = 1;
		BookType bookType = dao.findBookTypeById(id);
		System.out.println(bookType);
	}
	@Test
	public void AddBookInfo(){
		String barcode = "134143";
		String bookName = "adf";
		int typeId = 2;
		String author = "afda";
		String translator ="dfaf";
		String isbn = "3";
		float price = Float.parseFloat("45.5");
		int page = 555;
		int bookcase = 3;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String inTime = sdf.format(new Date());
		String operator = "sky";
		BookInfo bookInfo = new BookInfo(barcode, bookName, typeId, author, translator, isbn, price, page, bookcase, inTime, operator);
		int i = dao.addBookInfo(bookInfo);
		System.out.println(i);
	}
	
	@Test
	public void FindBookInfoById(){
		int id = 6;
		BookInfo bookInfo = dao.findBookInfoById(id);
		System.out.println(bookInfo);
		
	}
	@Test
	public void FindBookById(){
		int id = 6;
		Book book = dao.finBookById(id);
		System.out.println(book);
	}
	
	@Test
	public void FindBookCase(){
		int id = 3;
		BookCase bookcase = dao.findBookCaseById(id);
		System.out.println(bookcase);
	}
	
	@Test
	public void FindPublishById(){
		String id ="7-302";
		Publishing p = dao.findPublishById(id);
		System.out.println(p);
	}
	
	@Test
	public void updateBookInfo(){
		String barcode = "134143";
		String bookName = "adf";
		int typeId = 2;
		String author = "afda";
		String translator ="dfaf";
		String isbn = "3";
		float price = Float.parseFloat("45.5");
		int page = 555;
		int bookcase = 3;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String inTime = sdf.format(new Date());
		String operator = "sky";
		int id = 7;
		BookInfo bookInfo = new BookInfo(barcode, bookName, typeId, author, translator, isbn, price, page, bookcase, inTime, operator,id);		
		int i = dao.updateBookInfo(bookInfo);
		System.out.println(i);
	}
	
	@Test
	public void addBookType(){
		String typeName = "小说类";
		int days = 35;
		BookType bookType = new BookType(typeName,days);
		int i = dao.addBookType(bookType);
		System.out.println(i);
	}
	@Test
	public void updateBookType(){
		String typeName = "小说类";
		int days = 37;
		int id = 6;
		BookType bookType = new BookType(id,typeName,days);
		int i = dao.updateBookType(bookType);
		System.out.println(i);
	}
	
	@Test
	public void FindByBarcode(){
		String barcode= "9787302047230";
		List<Book> books  = dao.findByBarcode(barcode);
		for(Book b: books){
			System.out.println(b);
		}
	}
	@Test
	public void FindByType(){
		String type= "计算机类";
		List<Book> books = dao.findByType(type);
		for(Book b: books){
			System.out.println(b);
		}
	}
	@Test
	public void FindByPubname(){
		String pub= "电子工业出版社";
		List<Book> books = dao.findByPubname(pub);
		for(Book b: books){
			System.out.println(b);
		}
	}
	@Test
	public void FindByBookname(){
		String bookname= "Java学习指南";
		List<Book> books = dao.findByBookname(bookname);
		for(Book b: books){
			System.out.println(b);
		}
	}
	@Test
	public void FindByCasename(){
		String casename= "A";
		List<Book> books = dao.findByCasename(casename);
		for(Book b: books){
			System.out.println(b);
		}
	}
}
