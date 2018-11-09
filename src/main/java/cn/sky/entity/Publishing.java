package cn.sky.entity;

import java.io.Serializable;

public class Publishing implements Serializable {
	
	private static final long serialVersionUID = -8419138390841262641L;
	private String isbn;
	private String pubname;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPubname() {
		return pubname;
	}
	public void setPubname(String pubname) {
		this.pubname = pubname;
	}
	public Publishing() {
	}
	public Publishing(String isbn, String pubname) {
		super();
		this.isbn = isbn;
		this.pubname = pubname;
	}
	@Override
	public String toString() {
		return "publishing [isbn=" + isbn + ", pubname=" + pubname + "]";
	}
	
}
