package cn.sky.service;

import cn.sky.entity.Manager;
public interface ManagerService {
	Manager login(String name,String password) throws NameException,PasswordException;
	Manager addManager(String name,String password)throws ManagerExistException;
	//ĞŞ¸ÄÃÜÂë
	int updateManager(Manager manager);
}