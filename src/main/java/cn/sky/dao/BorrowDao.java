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
	
	//书借出的增改
	int addBorrow(Borrow borrow);
	int updateBorrow(Borrow borrow);//修改ifback 归还
	
	//书还回的增
	int addBack(Back back);
	
}
