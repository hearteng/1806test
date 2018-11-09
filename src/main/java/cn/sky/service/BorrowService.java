package cn.sky.service;

import java.util.List;

import cn.sky.entity.BookCheck;
import cn.sky.entity.Borrow;
import cn.sky.entity.BorrowForm;

public interface BorrowService {
	
	Borrow findBorrowById(int id);

	List<BorrowForm> findBorrowForm(int readerid);
	
	//书借出的增改
	int addBorrow(Borrow borrow);
	int updateBorrow(Borrow borrow);//修改ifback 归还
	
	//根据书的 barcode 查询书的bookCheck
	List<BookCheck> findBookCheckByBarcode(String barcode);
	//根据书的 bookname 查询书的bookCheck
	List<BookCheck> findBookCheckByBookname(String bookname);
	
	//借书活动
	int BorrowActivity(int readerId,int bookId,String operator);
	
	//还书活动
	int BackActivity(int readerId,int bookId,String operator);
}
