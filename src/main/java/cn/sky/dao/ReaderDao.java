package cn.sky.dao;

import java.util.List;

import cn.sky.entity.Reader;
import cn.sky.entity.ReaderType;

public interface ReaderDao {

	List<Reader> findAllReader();
	List<ReaderType> findAllReaderType();
	
	Reader findById(int id);
	Reader findByBarcode(String barcode);
	
	ReaderType findReaderTypeById(int id);
	
	int deleteReaderById(int id);
	int addReader(Reader reader);
	int updateReader(Reader reader);
	
	//读者类型的增删改
	int addReaderType(ReaderType readerType);
	int updateReaderType(ReaderType readerType);
	int delReaderTypeById(int id);
}
