package cn.sky.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class BorrowActivty implements Serializable {

	private static final long serialVersionUID = -1061399679828089008L;
	//读者Id
	private int readerId;
	//读者名字
	private String readerName;
	//所借书的id
	private List<Integer> bookId;
	//所借书的名字
	private List<String> booknames;
	//借阅时间List<Map<书名,所借时间>>
	private List<Map<String,String>> borrowList;
	//应还时间
	private List<Map<String,String>>  backList;
	//操作员
	private String operator;
	//归还状态 0:归还   1:借出
	private int ifback;
	//书所在的货架
	private String bookcase;
	//书的类别
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
