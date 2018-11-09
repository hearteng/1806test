package cn.sky.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sky.dao.BookDao;
import cn.sky.entity.Book;
import cn.sky.entity.BookCase;
import cn.sky.entity.BookInfo;
import cn.sky.entity.BookType;
import cn.sky.entity.Publishing;
import cn.sky.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Resource
	protected BookDao bookDao;
	public List<Book> findAllBook() {
		List<Book> list = bookDao.findAllBook();
		return list;
	}
	public List<BookType> findAllBookType() {
		List<BookType> list = bookDao.findAllBookType();
		return list;
	}
	public List<Publishing> findAllPublishing() {
		List<Publishing> list = bookDao.findAllPublishing();
		return list;
	}
	public List<BookCase> findAllBookCase() {
		List<BookCase> list = bookDao.findAllBookCase();
		return list;
	}
	public BookType findBookTypeById(int id) {
		BookType bookType = bookDao.findBookTypeById(id);
		return bookType;
	}
	public int addBookInfo(BookInfo bookInfo) {
		int  i = bookDao.addBookInfo(bookInfo);
		if(i!=1){
			throw new RuntimeException("±£´æÊ§°Ü");
		}
		return i;
	}
	public int delBookInfoById(int id) {
		int i = bookDao.delBookInfoById(id);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}
	public BookInfo findBookInfoById(int id) {
		BookInfo bookInfo = bookDao.findBookInfoById(id);
		return bookInfo;
	}
	public BookCase findBookCaseById(int id) {
		BookCase bookcase = bookDao.findBookCaseById(id);
		return bookcase;
	}
	public Publishing findPublishById(String isbn) {
		Publishing pub = bookDao.findPublishById(isbn);
		return pub;
	}
	public int updateBookInfo(BookInfo bookInfo) {
		int i = bookDao.updateBookInfo(bookInfo);
		if(i!=1){
			throw new RuntimeException("ÐÞ¸ÄÊ§°Ü");
		}
		return i;
	}
	
	
	public int delBookTypeById(int id) {
		int i = bookDao.delBookTypeById(id);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}
	public int addBookType(BookType bookType) {
		int i = bookDao.addBookType(bookType);
		if(i!=1){
			throw new RuntimeException("Ôö¼ÓÊ§°Ü");
		}
		return i;
	}
	public int updateBookType(BookType bookType) {
		int i = bookDao.updateBookType(bookType);
		if(i!=1){
			throw new RuntimeException("ÐÞ¸ÄÊ§°Ü");
		}
		return i;
	}
	public int addBookCase(BookCase bookCase) {
		int i = bookDao.addBookCase(bookCase);
		if(i!=1){
			throw new RuntimeException("Ôö¼ÓÊ§°Ü");
		}
		return i;
	}
	public int delBookCaseById(int id) {
		int i = bookDao.delBookCaseById(id);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}
	public int updateBookCase(BookCase bookCase) {
		int i = bookDao.updateBookCase(bookCase);
		if(i!=1){
			throw new RuntimeException("ÐÞ¸ÄÊ§°Ü");
		}
		return i;
	}
	public Book finBookById(int id) {
		Book book = bookDao.finBookById(id);
		return book;
	}

}
