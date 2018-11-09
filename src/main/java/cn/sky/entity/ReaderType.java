package cn.sky.entity;

import java.io.Serializable;

public class ReaderType implements Serializable {
	
	private static final long serialVersionUID = 4794873158793332433L;
	private Integer id;
    private String name;
    private int number;
	public ReaderType() {
	}
	public ReaderType(Integer id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	
	public ReaderType(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "ReaderType [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
    
    

}
