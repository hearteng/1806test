package test;

import org.junit.Before;
import org.junit.Test;

import cn.sky.dao.ManagerDao;
import cn.sky.entity.Manager;

public class ManagerDaoTest extends BaseTestCase{
	
	ManagerDao dao;
	@Before
	public void Minit(){
		dao = ctx.getBean("managerDao",ManagerDao.class);
	}
	
	@Test
	public void checkManagerTest(){
		String name = "sky";
		Manager manager = dao.checkManager(name);
		System.out.println(manager);
		
	}
	
	@Test
	public void addManagerTest(){
		String name = "yyy";
		String pwd = "123456";
		Manager manager = new Manager(name,pwd);
		int i = dao.addManager(manager);
		System.out.println(i);
	}
	@Test
	public void test(){
		String str = "j_sky";
		String[] s = str.split("_");
		System.out.println(s[0]);
		System.out.println(s[1]);
	}

}
