package cn.sky.dao;

import cn.sky.entity.Manager;

public interface ManagerDao {
   
	//����Ա�����֤
	Manager checkManager(String name);
	
	//���ӹ���Ա
	int addManager(Manager manager);
	
	//�޸�����
	int updateManager(Manager manager);
	
}
