package test;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * �������ݿ����� 
 */
public class BaseTestCase {

	ClassPathXmlApplicationContext ctx;
	//��ʼ��Spring����
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext(
				"conf/spring-mybatis.xml","conf/spring-service.xml");
	}
}
