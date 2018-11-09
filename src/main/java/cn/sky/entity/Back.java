package cn.sky.entity;

import java.io.Serializable;
import java.sql.Date;

public class Back implements Serializable{
	

	private static final long serialVersionUID = 1298206492816741532L;
	private Integer readerId;
	private Integer bookId;
	private Date backTime;
	private String operator;
	
	@Override
	public String toString() {
		return "Back [readerid=" + readerId + ", bookid=" + bookId + ", backTime=" + backTime + ", operator=" + operator
				+ "]";
	}

	public Integer getReaderid() {
		return readerId;
	}

	public void setReaderid(Integer readerId) {
		this.readerId = readerId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookid(Integer bookId) {
		this.bookId = bookId;
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

	public Back() {
	}

	public Back(Integer readerId, Integer bookId, Date backTime, String operator) {
		super();
		this.readerId = readerId;
		this.bookId = bookId;
		this.backTime = backTime;
		this.operator = operator;
	}
	

}
