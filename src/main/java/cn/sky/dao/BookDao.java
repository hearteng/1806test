package cn.sky.dao;

import java.util.List;

import cn.sky.entity.Book;
import cn.sky.entity.BookCase;
import cn.sky.entity.BookInfo;
import cn.sky.entity.BookType;
import cn.sky.entity.Publishing;

public interface BookDao {

	List<Book> findAllBook();
	List<BookType> findAllBookType();
	List<Publishing> findAllPublishing();
	List<BookCase> findAllBookCase();
	
	Book finBookById(int id);
	BookType findBookTypeById(int id);
	BookInfo findBookInfoById(int id);
	BookCase findBookCaseById(int id);
	Publishing findPublishById(String isbn);
	
	
	//图书的增删修改
	int addBookInfo(BookInfo bookInfo);
	int delBookInfoById(int id);
	int updateBookInfo(BookInfo bookInfo);
	
	//图书类型的增删修改
	int addBookType(BookType bookType);
	int delBookTypeById(int id);
	int updateBookType(BookType bookType);
	
	//书架的增删修改
	int addBookCase(BookCase bookCase);
	int delBookCaseById(int id);
	int updateBookCase(BookCase bookCase);
	
	
	//查
	List<Book> findByBarcode(String barcode);
	List<Book> findByType(String type);
	List<Book> findByPubname(String pubname);
	List<Book> findByBookname(String bookname);
	List<Book> findByCasename(String casename);

}
