package cn.sky.entity;

import java.io.Serializable;

public class Manager implements Serializable {
	
	private static final long serialVersionUID = -1228829873368965298L;
	private Integer id;  //����ԱID��
    private String name="";   //����Ա����
    private String pwd="";  //����Ա����
	public Manager() {
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	public Manager(Integer id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public Manager(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
    
   
}
