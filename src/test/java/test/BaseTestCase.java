package test;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试数据库连接 
 */
public class BaseTestCase {

	ClassPathXmlApplicationContext ctx;
	//初始化Spring容器
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext(
				"conf/spring-mybatis.xml","conf/spring-service.xml");
	}
}
