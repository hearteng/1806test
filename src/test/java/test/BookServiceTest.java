package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.sky.entity.Book;
import cn.sky.service.BookFindService;
import cn.sky.service.BookService;

public class BookServiceTest extends BaseTestCase {

	BookService service;
	BookFindService bookfindservice;
	@Before
	public void minit(){
		service = ctx.getBean("bookService",BookService.class);
		bookfindservice = ctx.getBean("bookfindService",BookFindService.class);
	}
	@Test
	public void FindAllTest(){

		List<Book> list = service.findAllBook();
		for(Book b: list){
			System.out.println(b);
		}
		
	}
	@Test
	public void FindByType(){
		String type= "º∆À„ª˙¿‡";
		List<Book> books = bookfindservice.findByType(type);
		for(Book b: books){
			System.out.println(b);
		}
	}
	@Test
	public void FindByCase(){
		String casename = "A";
		List<Book> books = bookfindservice.findByCasename(casename);
		for(Book b: books){
			System.out.println(b);
		}
	}
}
