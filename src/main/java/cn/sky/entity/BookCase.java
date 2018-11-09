package cn.sky.entity;

import java.io.Serializable;

public class BookCase implements Serializable  {
	private static final long serialVersionUID = -8680588489028453789L;
	private Integer id;
    private String name;
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
	@Override
	public String toString() {
		return "BookCase [id=" + id + ", name=" + name + "]";
	}
	public BookCase(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public BookCase( String name) {
		super();
		this.name = name;
	}
	public BookCase() {
	}
        
    
   

}
