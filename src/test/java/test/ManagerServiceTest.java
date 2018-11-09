package test;

import org.junit.Before;
import org.junit.Test;

import cn.sky.entity.Manager;
import cn.sky.service.ManagerService;

public class ManagerServiceTest extends BaseTestCase {

	ManagerService mservice;
	@Before
	public void minit(){
		mservice = ctx.getBean("managerService",ManagerService.class);
	}
	@Test
	public void LoginTest(){
		String name = "sky";
		String password = "123";
		Manager manager = mservice.login(name, password);
		System.out.println(manager);
		
	}
}
