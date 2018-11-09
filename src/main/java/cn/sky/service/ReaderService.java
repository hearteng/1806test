package cn.sky.service;

import java.util.List;

import cn.sky.entity.Reader;
import cn.sky.entity.ReaderType;

public interface ReaderService {

	List<Reader> findAllReader();
	List<ReaderType> findAllReaderType();
	
	Reader findById(int id);
	ReaderType findReaderTypeById(int id);
	Reader findByBarcode(String barcode)throws BarcodeException;
	
	int deleteReaderById(int id);
	int addReader(Reader reader);
	int updateReader(Reader reader);
	//读者类型的增删改
	int addReaderType(ReaderType readerType);
	int updateReaderType(ReaderType readerType);
	int delReaderTypeById(int id);
}
