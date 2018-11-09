package cn.sky.service;

import java.util.List;

import cn.sky.entity.Book;

public interface BookFindService {

	//²é
	List<Book> findByBarcode(String barcode);
	List<Book> findByType(String type);
	List<Book> findByPubname(String pubname);
	List<Book> findByBookname(String bookname);
	List<Book> findByCasename(String casename);
}
