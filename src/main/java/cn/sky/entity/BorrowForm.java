package cn.sky.entity;

import java.io.Serializable;
import java.sql.Date;

public class BorrowForm implements Serializable{

	private static final long serialVersionUID = -8718327030793598200L;
	//所借书的名字
	private String bookname;
	//所借书的Id
	private Integer bookid;
	//借阅时间
	private Date borrowTime;
	//应还时间
	private Date backTime;
	//出版社
	private String pubname;
	//书所在的货架
	private String bookcase;
	//书的类别
	private String booktype;
	
	
	
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Date getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}
	public Date getBackTime() {
		return backTime;
	}
	public void setBackTime(Date backTime) {
		this.backTime = backTime;
	}
	public String getPubname() {
		return pubname;
	}
	public void setPubname(String pubname) {
		this.pubname = pubname;
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
	public BorrowForm() {
		
	}
	public BorrowForm(String bookname, Date borrowTime, Date backTime, String pubname, String bookcase,
			String booktype) {
		super();
		this.bookname = bookname;
		this.borrowTime = borrowTime;
		this.backTime = backTime;
		this.pubname = pubname;
		this.bookcase = bookcase;
		this.booktype = booktype;
	}
	public BorrowForm(String bookname, Integer bookid, Date borrowTime, Date backTime, String pubname, String bookcase,
			String booktype) {
		super();
		this.bookname = bookname;
		this.bookid = bookid;
		this.borrowTime = borrowTime;
		this.backTime = backTime;
		this.pubname = pubname;
		this.bookcase = bookcase;
		this.booktype = booktype;
	}
	@Override
	public String toString() {
		return "BorrowForm [bookname=" + bookname + ", bookid=" + bookid + ", borrowTime=" + borrowTime + ", backTime="
				+ backTime + ", pubname=" + pubname + ", bookcase=" + bookcase + ", booktype=" + booktype + "]";
	}
	
	

}
