package cn.sky.entity;

import java.io.Serializable;
import java.sql.Date;

public class Borrow implements Serializable{

	private static final long serialVersionUID = -5831109572502193321L;
	private Integer readerId;
	private Integer bookId;
	private Date borrowTime;
	private Date backTime;
	private String operator;
	private int ifback;
	
	public Borrow() {
	}

	public Borrow(Integer readerId, Integer bookId, Date borrowTime, Date backTime, String operator, int ifback) {
		super();
		this.readerId = readerId;
		this.bookId = bookId;
		this.borrowTime = borrowTime;
		this.backTime = backTime;
		this.operator = operator;
		this.ifback = ifback;
	}

	
	public Borrow(Integer readerId, Integer bookId, Date borrowTime, Date backTime, String operator) {
		super();
		this.readerId = readerId;
		this.bookId = bookId;
		this.borrowTime = borrowTime;
		this.backTime = backTime;
		this.operator = operator;
	}

	public Integer getReaderId() {
		return readerId;
	}

	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
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

	@Override
	public String toString() {
		return "Borrow [readerId=" + readerId + ", bookId=" + bookId + ", borrowTime=" + borrowTime + ", backTime="
				+ backTime + ", operator=" + operator + ", ifback=" + ifback + "]";
	}
	
	
}
