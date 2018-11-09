package cn.sky.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sky.dao.BookDao;
import cn.sky.entity.Book;
import cn.sky.service.BookFindService;

@Service("bookfindService")
public class BookFindServiceImpl implements BookFindService{

	@Resource
	private BookDao bookDao;

	public List<Book> findByType(String type) {
		List<Book> books = null;
		if(type.trim()!=""||type!=null){
			books = bookDao.findByType(type.trim());
		}
		return books;
	}

	public List<Book> findByPubname(String pubname) {
		List<Book> books = null;
		if(pubname.trim() != "" || pubname != null){
			books = bookDao.findByPubname(pubname.trim());
		}
		return books;
	}

	public List<Book> findByBookname(String bookname) {
		List<Book> books = null;
		if(bookname.trim() != "" || bookname != null){
			books = bookDao.findByBookname(bookname.trim());
		}
		return books;
	}

	public List<Book> findByCasename(String casename) {
		List<Book> books = null;
		if(casename.trim() != "" || casename != null){
			books = bookDao.findByCasename(casename.trim());
		}
		return books;
	}

	public List<Book> findByBarcode(String barcode) {
		List<Book> books = null;
		if(barcode.trim() != "" || barcode != null){
			books = bookDao.findByBarcode(barcode.trim());
		}
		return books;
	}
	
}
