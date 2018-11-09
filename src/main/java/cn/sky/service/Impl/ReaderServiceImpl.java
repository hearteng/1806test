package cn.sky.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sky.dao.ReaderDao;
import cn.sky.entity.Reader;
import cn.sky.entity.ReaderType;
import cn.sky.service.NameException;
import cn.sky.service.ReaderService;
@Service("readerService")
public class ReaderServiceImpl implements ReaderService {

	@Resource
	private ReaderDao readerDao;
	
	public List<Reader> findAllReader() {
		List<Reader> readers = readerDao.findAllReader();
		return readers;
	}

	public Reader findById(int id) {
		return readerDao.findById(id);
	}

	public int deleteReaderById(int id) {
		int i = readerDao.deleteReaderById(id);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}

	public int addReader(Reader reader) {
		int i = readerDao.addReader(reader);
		if(i!=1){
			throw new RuntimeException("±£´æÊ§°Ü");
		}
		return i;
	}

	public int updateReader(Reader reader) {
		int i = readerDao.updateReader(reader);
		if(i!=1){
			throw new RuntimeException("ÐÞ¸ÄÊ§°Ü");
		}
		return i;
	}

	public List<ReaderType> findAllReaderType() {
		List<ReaderType> readerTypes = readerDao.findAllReaderType();
		return readerTypes;
	}

	public int delReaderTypeById(int id) {
		int i = readerDao.delReaderTypeById(id);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}

	public int addReaderType(ReaderType readerType) {
		int i = readerDao.addReaderType(readerType);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}

	public int updateReaderType(ReaderType readerType) {
		int i = readerDao.updateReaderType(readerType);
		if(i!=1){
			throw new RuntimeException("É¾³ýÊ§°Ü");
		}
		return i;
	}

	public ReaderType findReaderTypeById(int id) {
		ReaderType readerType = readerDao.findReaderTypeById(id);
		return readerType;
	}

	public Reader findByBarcode(String barcode) {
		Reader reader = readerDao.findByBarcode(barcode);
		if(reader==null){
			throw new NameException("ÓÃ»§²»´æÔÚ");
		}
		return reader;
	}

}
