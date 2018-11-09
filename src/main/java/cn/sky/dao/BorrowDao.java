package cn.sky.dao;

import java.util.List;
import java.util.Map;

import cn.sky.entity.Back;
import cn.sky.entity.Borrow;

public interface BorrowDao {

	Borrow findBorrowById(int id);
	
	List<Borrow> findByReaderId(int readerid);
	List<Borrow> findBorrowByReaderId(int readerid);
	
	List<Map<Integer,Integer>> findMapByReaderId(int readerid);
	
	//����������
	int addBorrow(Borrow borrow);
	int updateBorrow(Borrow borrow);//�޸�ifback �黹
	
	//�黹�ص���
	int addBack(Back back);
	
}
