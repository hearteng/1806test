package cn.sky.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class BorrowActivty implements Serializable {

	private static final long serialVersionUID = -1061399679828089008L;
	//����Id
	private int readerId;
	//��������
	private String readerName;
	//�������id
	private List<Integer> bookId;
	//�����������
	private List<String> booknames;
	//����ʱ��List<Map<����,����ʱ��>>
	private List<Map<String,String>> borrowList;
	//Ӧ��ʱ��
	private List<Map<String,String>>  backList;
	//����Ա
	private String operator;
	//�黹״̬ 0:�黹   1:���
	private int ifback;
	//�����ڵĻ���
	private String bookcase;
	//������
	private String booktype;
	
	
	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public List<Integer> getBookId() {
		return bookId;
	}

	public void setBookId(List<Integer> bookId) {
		this.bookId = bookId;
	}

	public List<String> getBooknames() {
		return booknames;
	}

	public void setBooknames(List<String> booknames) {
		this.booknames = booknames;
	}

	public List<Map<String, String>> getBorrowList() {
		return borrowList;
	}

	public void setBorrowList(List<Map<String, String>> borrowList) {
		this.borrowList = borrowList;
	}

	public List<Map<String, String>> getBackList() {
		return backList;
	}

	public void setBackList(List<Map<String, String>> backList) {
		this.backList = backList;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getIfback() {
		return ifback;
	}

	public void setIfback(int ifback) {
		this.ifback = ifback;
	}

	public String getBookcase() {
		return bookcase;
	}

	public void setBookcase(String bookcase) {
		this.bookcase = bookcase;
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}


	public BorrowActivty(int readerId, String readerName, List<Integer> bookId, List<String> booknames,
			List<Map<String, String>> borrowList, List<Map<String, String>> backList, String operator, int ifback,
			String bookcase, String booktype) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.bookId = bookId;
		this.booknames = booknames;
		this.borrowList = borrowList;
		this.backList = backList;
		this.operator = operator;
		this.ifback = ifback;
		this.bookcase = bookcase;
		this.booktype = booktype;
	}

	public BorrowActivty() {
	}

	@Override
	public String toString() {
		return "Borrow [readerId=" + readerId + ", readerName=" + readerName + ", bookId=" + bookId + ", booknames="
				+ booknames + ", borrowList=" + borrowList + ", backList=" + backList + ", operator=" + operator
				+ ", ifback=" + ifback + ", bookcase=" + bookcase + ", booktype=" + booktype + "]";
	}

}
