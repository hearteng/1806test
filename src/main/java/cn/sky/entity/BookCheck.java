package cn.sky.entity;

import java.io.Serializable;

public class BookCheck implements Serializable{

	private static final long serialVersionUID = -1719299134940267014L;
	private int bookId;
	private String bookname;
	private String pubname;
	private String bookcase;
	private String booktype;
	private int days;
	private String bookstatus;
	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	@Override
	public String toString() {
		return "BookCheck [bookId=" + bookId + ", bookname=" + bookname + ", pubname=" + pubname + ", bookcase="
				+ bookcase + ", booktype=" + booktype + ", days=" + days + ", bookstatus=" + bookstatus + "]";
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}


	public BookCheck(int bookId, String bookname, String pubname, String bookcase, String booktype, int days,
			String bookstatus) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.pubname = pubname;
		this.bookcase = bookcase;
		this.booktype = booktype;
		this.days = days;
		this.bookstatus = bookstatus;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
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

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getBookstatus() {
		return bookstatus;
	}

	public void setBookstatus(String bookstatus) {
		this.bookstatus = bookstatus;
	}

	public BookCheck() {
	}

}
