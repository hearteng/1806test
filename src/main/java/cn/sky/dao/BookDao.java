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
	
	
	//ͼ�����ɾ�޸�
	int addBookInfo(BookInfo bookInfo);
	int delBookInfoById(int id);
	int updateBookInfo(BookInfo bookInfo);
	
	//ͼ�����͵���ɾ�޸�
	int addBookType(BookType bookType);
	int delBookTypeById(int id);
	int updateBookType(BookType bookType);
	
	//��ܵ���ɾ�޸�
	int addBookCase(BookCase bookCase);
	int delBookCaseById(int id);
	int updateBookCase(BookCase bookCase);
	
	
	//��
	List<Book> findByBarcode(String barcode);
	List<Book> findByType(String type);
	List<Book> findByPubname(String pubname);
	List<Book> findByBookname(String bookname);
	List<Book> findByCasename(String casename);

}
