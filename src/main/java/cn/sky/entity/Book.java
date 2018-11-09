package cn.sky.entity;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 3961218822947143720L;
	//ID
	private String id;
	//条形码
	private String barcode;
	//书名
	private String bookname;
    //书的出版社名字
    private String pubname;
    //货架名
    private String casename;
    //书的类型
    private String type;
    
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
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
	public String getCasename() {
		return casename;
	}
	public void setCasename(String casename) {
		this.casename = casename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Book() {
	}

	public Book(String id, String barcode, String bookname, String pubname, String casename, String type) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.bookname = bookname;
		this.pubname = pubname;
		this.casename = casename;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", barcode=" + barcode + ", bookname=" + bookname + ", pubname=" + pubname
				+ ", casename=" + casename + ", type=" + type + "]";
	}
	
	
    
}
