package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.sky.dao.ReaderDao;
import cn.sky.entity.Reader;
import cn.sky.entity.ReaderType;

public class ReaderDaoTest extends BaseTestCase{
	
	ReaderDao dao;
	@Before
	public void Minit(){
		dao = ctx.getBean("readerDao",ReaderDao.class);
	}
	
	@Test
	public void findAll(){
		List<Reader> list = dao.findAllReader();
		for(Reader r : list){
			System.out.println(r);
		}
	}
	@Test
	public void findAllType(){
		List<ReaderType> list = dao.findAllReaderType();
		for(ReaderType rt:list){
			System.out.println(rt);
		}
	}
	
	@Test
	public void findById(){
		Reader reader = dao.findById(1);
		System.out.println(reader);
	}
	
	@Test
	public void addReader(){
		int id = 4;
		String name = "ysk";
		String sex = "M";
		String barcode = "4545646";
		String vocation="打酱油";
		String birthday = "1992-04-13";
		String paperType="身份证";
		String paperNo = "456454564564";
		String tel = "45645646";
		String email = "493550652@qq.com";
		String createDate = "2017-04-13";
		String operator = "sky";
		String remark = "是一个好人";
		int typeid = 1;
		Reader reader = new Reader(id,name,sex,barcode,vocation,birthday,paperType,paperNo,tel,email,createDate,operator,remark,typeid);
		int i = dao.addReader(reader);
		System.out.println(i);
	}
	@Test
	public void updateReader(){
		int id = 4;
		String name = "ysk2";
		String sex = "M";
		String barcode = "123123321";
		String vocation="打酱油";
		String birthday = "1992-04-13";
		String paperType="身份证";
		String paperNo = "456454564564";
		String tel = "45645646";
		String email = "493550652@qq.com";
		String createDate = "2017-04-13";
		String operator = "sky";
		String remark = "是一个好人";
		int typeid = 1;
		Reader reader = new Reader(id,name,sex,barcode,vocation,birthday,paperType,paperNo,tel,email,createDate,operator,remark,typeid);
		int i = dao.updateReader(reader);
		System.out.println(i);
	}
	@Test
	public void findReaderByBarcode(){
		String barcode = "123123321";
		Reader reader = dao.findByBarcode(barcode);
		System.out.println(reader);
	}

}
