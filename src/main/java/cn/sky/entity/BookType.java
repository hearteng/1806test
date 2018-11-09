package cn.sky.entity;

import java.io.Serializable;

public class BookType implements Serializable {
	
	private static final long serialVersionUID = -9113003157730545689L;
	private Integer id;
    private String typeName;
    private int days;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public BookType() {
	}
	public BookType(Integer id, String typeName, int days) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.days = days;
	}
	
	public BookType(String typeName, int days) {
		super();
		this.typeName = typeName;
		this.days = days;
	}
	@Override
	public String toString() {
		return "BookType [id=" + id + ", typeName=" + typeName + ", days=" + days + "]";
	}

    
}
