package cn.sky.dao;

import cn.sky.entity.Manager;

public interface ManagerDao {
   
	//管理员身份验证
	Manager checkManager(String name);
	
	//增加管理员
	int addManager(Manager manager);
	
	//修改密码
	int updateManager(Manager manager);
	
}
