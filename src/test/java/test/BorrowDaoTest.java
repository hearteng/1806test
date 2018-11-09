package test;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.sky.dao.BookDao;
import cn.sky.dao.BorrowDao;
import cn.sky.entity.Back;
import cn.sky.entity.Book;
import cn.sky.entity.BookType;
import cn.sky.entity.Borrow;

public class BorrowDaoTest extends BaseTestCase {

	BorrowDao dao;
	BookDao bookdao;
	@Before
	public void Binit(){
		dao = ctx.getBean("borrowDao",BorrowDao.class);
		bookdao = ctx.getBean("bookDao",BookDao.class);
	}
	
	@Test
	public void findByReaderId(){
		int readerId = 1;
		List<Borrow> list = dao.findByReaderId(readerId);
		for(Borrow b:list){
			System.out.println(b);
		}
	}
	@Test
	public void addBorrow(){
		int bookId = 5;
		Book book = bookdao.finBookById(bookId);
		BookType bookType = bookdao.findBookTypeById(Integer.parseInt(book.getId()));
		int days = bookType.getDays();
		int readerId=7;
		Date borrowTime = new Date(new java.util.Date().getTime());
		System.out.println("borrowTime:"+borrowTime);
		Calendar calendar =new GregorianCalendar();  
		calendar.setTime(borrowTime);  
		calendar.add(Calendar.DATE, days);  
		java.util.Date utilDate = (java.util.Date)calendar.getTime(); 
		Date backTime = new Date(utilDate.getTime());
		System.out.println("backTime:"+backTime);
		String operator = "sky";
		Borrow borrow = new Borrow(readerId, bookId, borrowTime, backTime, operator);
		int i = dao.addBorrow(borrow);
		System.out.println(i);
	}
	@Test
	public void updateBorrow(){
		int bookId = 6;
		int readerId=7;
		int ifback = 1;
		Borrow borrow = new Borrow(readerId, bookId, null, null, null, ifback);
		int i = dao.updateBorrow(borrow);
		System.out.println(i);
	}
	
	@Test
	public void findMapByReaderId(){
		int readerId=7;
		List<Map<Integer,Integer>> list = dao.findMapByReaderId(readerId);
		Integer id = null;
		Integer bookId =null;
		for(Map<Integer,Integer> map:list){
			System.out.println("map:"+map);
//			  for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//				   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//				   System.out.println("1:"+entry.getValue());
//				   System.out.println("2:"+entry.getValue());
//				  }
			  for (Object key : map.keySet()) {
				   if("id".equals(key)){
					   id = new Integer(String.valueOf(map.get(key)));
				   }
				   if("bookid".equals(key)){
					   bookId=  map.get(key);
				   }
				  }
			  System.out.println("id:"+id);
			  System.out.println("bookId:"+bookId);
		}
	}
	@Test
	public void addBack(){
		Date backTime = new Date(new java.util.Date().getTime());
		Back back = new Back(34343,3434,backTime,"ssss");
		int i = dao.addBack(back);
		System.out.println(i);
	}

}
