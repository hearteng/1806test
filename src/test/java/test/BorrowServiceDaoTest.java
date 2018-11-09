package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.sky.entity.BookCheck;
import cn.sky.entity.BorrowForm;
import cn.sky.entity.Reader;
import cn.sky.service.BorrowService;
import cn.sky.service.ReaderService;

public class BorrowServiceDaoTest extends BaseTestCase {

	BorrowService borrowservice;
	ReaderService readerservice;
	@Before
	public void Binit(){
		borrowservice = ctx.getBean("borrowService",BorrowService.class);
		readerservice = ctx.getBean("readerService",ReaderService.class);
	}
	
	@Test
	public void findBorrowForm(){
		String barcode = "a";
		Reader reader = readerservice.findByBarcode(barcode);
		Integer readerid = reader.getId();
		List<BorrowForm> borrowForms = borrowservice.findBorrowForm(readerid);
		for(BorrowForm b:borrowForms){
			System.out.println(b);
		}
	}
	@Test
	public void findBookCheckByBookname(){
		String bookname = "C#ѧϰ";
		List<BookCheck> bookChecks = borrowservice.findBookCheckByBookname(bookname);
		System.out.println(bookChecks);
	}
	@Test 
	public void findBookCheckBybookbarcod(){
		String barcode="666";
		List<BookCheck> bookChecks = borrowservice.findBookCheckByBarcode(barcode);
		System.out.println(bookChecks);
	}
	@Test
	public void BorrowActivity(){
		int readerId = 3;
		int bookId = 8;
		String operator="yuy";
		int i = borrowservice.BorrowActivity(readerId, bookId, operator);
		System.out.println(i);
	}
		
}
