package cn.sky.service.Impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sky.dao.ManagerDao;
import cn.sky.entity.Manager;
import cn.sky.service.ManagerExistException;
import cn.sky.service.ManagerService;
import cn.sky.service.NameException;
import cn.sky.service.PasswordException;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	@Resource
	private ManagerDao managerDao;
	
	public Manager login(String name, String password) throws NameException, PasswordException {

		if(name==null ||name.trim().isEmpty()){
			throw new NameException("用户名不能空");
		}
		if(password==null || password.trim().isEmpty()){
			throw new PasswordException("密码不能空");
		}
		
		Manager manager = managerDao.checkManager(name);
		if(manager==null){
			throw new NameException("用户不存在");
		}
		if(manager.getPwd().equals(password)){
			return manager;
		}
		throw new PasswordException("密码错误");
	}

	public Manager addManager(String name, String password)
			throws ManagerExistException{
		Manager manager = managerDao.checkManager(name);
		//检查用户是否已经注册?!
		if(manager!=null){
			throw new ManagerExistException("已经注册");
		}
		manager = new Manager(name,password);
		int i = managerDao.addManager(manager);
		if(i!=1){
			throw new RuntimeException("保存失败");
		}
		return manager;
	}

	public int updateManager(Manager manager) {
		int i = managerDao.updateManager(manager);
		if(i!=1){
			throw new RuntimeException("修改失败");
		}
		return i;
	}


}
