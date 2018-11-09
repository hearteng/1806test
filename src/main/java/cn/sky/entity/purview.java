package cn.sky.entity;

public class purview {

	private Integer id=new Integer(-1);//管理员ID
    private int sysset=0;  //系统设置权限
    private int readerset=0;   //读者管理权限
    private int bookset=0;   //图书管理权限
    private int borrowback=0;   //图书借还权限
    private int sysquery=0;    //系统查询权限
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getSysset() {
		return sysset;
	}
	public void setSysset(int sysset) {
		this.sysset = sysset;
	}
	public int getReaderset() {
		return readerset;
	}
	public void setReaderset(int readerset) {
		this.readerset = readerset;
	}
	public int getBookset() {
		return bookset;
	}
	public void setBookset(int bookset) {
		this.bookset = bookset;
	}
	public int getBorrowback() {
		return borrowback;
	}
	public void setBorrowback(int borrowback) {
		this.borrowback = borrowback;
	}
	public int getSysquery() {
		return sysquery;
	}
	public void setSysquery(int sysquery) {
		this.sysquery = sysquery;
	}
	public purview() {
	}
	public purview(Integer id, int sysset, int readerset, int bookset, int borrowback, int sysquery) {
		super();
		this.id = id;
		this.sysset = sysset;
		this.readerset = readerset;
		this.bookset = bookset;
		this.borrowback = borrowback;
		this.sysquery = sysquery;
	}
	@Override
	public String toString() {
		return "purview [id=" + id + ", sysset=" + sysset + ", readerset=" + readerset + ", bookset=" + bookset
				+ ", borrowback=" + borrowback + ", sysquery=" + sysquery + "]";
	}
    
}
