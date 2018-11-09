package cn.sky.entity;

import java.io.Serializable;

public class BookInfo implements Serializable{
	private static final long serialVersionUID = -6477077594740216842L;
	//���������
	private String barcode;
	//����
	private String bookName;
	//������ID
	private int typeId;
	//�������
    private String author;
    //��ķ�������
    private String translator;
    //��ĳ�����id
    private String isbn;

    //��ļ۸�
    private Float price;
    //���ҳ��
    private int page;
    //�����ڵĻ���id
    private int bookcase;
    //¼��ʱ��
    private String inTime;
    //����Ա
    private String operator;
    //�Ƿ�del 0:û���  1:���
    private int del;
    //���ID
    private Integer id;
    
    
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getBookcase() {
		return bookcase;
	}
	public void setBookcase(int bookcase) {
		this.bookcase = bookcase;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BookInfo [barcode=" + barcode + ", bookName=" + bookName + ", typeId=" + typeId + ", author=" + author
				+ ", translator=" + translator + ", isbn=" + isbn + ", price=" + price + ", page=" + page
				+ ", bookcase=" + bookcase + ", inTime=" + inTime + ", operator=" + operator + ", del=" + del + ", id="
				+ id + "]";
	}
	public BookInfo() {
	}
	public BookInfo(String barcode, String bookName, int typeId, String author, String translator, String isbn,
			Float price, int page, int bookcase, String inTime, String operator, int del, Integer id) {
		super();
		this.barcode = barcode;
		this.bookName = bookName;
		this.typeId = typeId;
		this.author = author;
		this.translator = translator;
		this.isbn = isbn;
		this.price = price;
		this.page = page;
		this.bookcase = bookcase;
		this.inTime = inTime;
		this.operator = operator;
		this.del = del;
		this.id = id;
	}
	public BookInfo(String barcode, String bookName, int typeId, String author, String translator, String isbn,
			Float price, int page, int bookcase, String inTime, String operator) {
		super();
		this.barcode = barcode;
		this.bookName = bookName;
		this.typeId = typeId;
		this.author = author;
		this.translator = translator;
		this.isbn = isbn;
		this.price = price;
		this.page = page;
		this.bookcase = bookcase;
		this.inTime = inTime;
		this.operator = operator;
	}
	public BookInfo(String barcode, String bookName, int typeId, String author, String translator, String isbn,
			Float price, int page, int bookcase, String inTime, String operator, Integer id) {
		super();
		this.barcode = barcode;
		this.bookName = bookName;
		this.typeId = typeId;
		this.author = author;
		this.translator = translator;
		this.isbn = isbn;
		this.price = price;
		this.page = page;
		this.bookcase = bookcase;
		this.inTime = inTime;
		this.operator = operator;
		this.id = id;
	}
	
    
    
}
