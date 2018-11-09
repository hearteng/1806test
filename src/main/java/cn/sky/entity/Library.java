package cn.sky.entity;

import java.io.Serializable;

public class Library implements Serializable {
	private static final long serialVersionUID = -3683830919321120319L;
	private Integer id;
	private String libraryname;
	//¹Ý³¤Ãû×Ö
	private String curator;
	private String tel;
    private String address;
    private String email;
    private String url;
    private String createDate;
    private String introduce;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibraryname() {
		return libraryname;
	}
	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}
	public String getCurator() {
		return curator;
	}
	public void setCurator(String curator) {
		this.curator = curator;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Library(Integer id, String libraryname, String curator, String tel, String address, String email, String url,
			String createDate, String introduce) {
		super();
		this.id = id;
		this.libraryname = libraryname;
		this.curator = curator;
		this.tel = tel;
		this.address = address;
		this.email = email;
		this.url = url;
		this.createDate = createDate;
		this.introduce = introduce;
	}
	public Library() {
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", libraryname=" + libraryname + ", curator=" + curator + ", tel=" + tel
				+ ", address=" + address + ", email=" + email + ", url=" + url + ", createDate=" + createDate
				+ ", introduce=" + introduce + "]";
	}
    
	
  
}
