package cn.sky.service;

import java.util.List;

import cn.sky.entity.BookCheck;
import cn.sky.entity.Borrow;
import cn.sky.entity.BorrowForm;

public interface BorrowService {
	
	Borrow findBorrowById(int id);

	List<BorrowForm> findBorrowForm(int readerid);
	
	//����������
	int addBorrow(Borrow borrow);
	int updateBorrow(Borrow borrow);//�޸�ifback �黹
	
	//������� barcode ��ѯ���bookCheck
	List<BookCheck> findBookCheckByBarcode(String barcode);
	//������� bookname ��ѯ���bookCheck
	List<BookCheck> findBookCheckByBookname(String bookname);
	
	//����
	int BorrowActivity(int readerId,int bookId,String operator);
	
	//����
	int BackActivity(int readerId,int bookId,String operator);
}
