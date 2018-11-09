package cn.sky.entity;

import java.io.Serializable;

public class Reader implements Serializable {

	private static final long serialVersionUID = 114443434884155808L;
	private Integer id;
	private String name;
	private String sex;
    private String barcode;
    //工作
    private String vocation;
    private String birthday;
    //证件类别
    private String paperType;
    private String paperNo;
    private String tel;
    private String email;
    private String createDate;
    private String operator;
    //评论
    private String remark;
    //读者类别Id
    private int typeid;
    //数量
    private int number;
    //读者类别
    private String type;
    
    
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Reader() {
	}
	
	public Reader(String name, String sex, String barcode, String vocation, String birthday, String paperType,
			String paperNo, String tel, String email, String createDate, String operator, String remark, int typeid) {
		super();
		this.name = name;
		this.sex = sex;
		this.barcode = barcode;
		this.vocation = vocation;
		this.birthday = birthday;
		this.paperType = paperType;
		this.paperNo = paperNo;
		this.tel = tel;
		this.email = email;
		this.createDate = createDate;
		this.operator = operator;
		this.remark = remark;
		this.typeid = typeid;
	}
	public Reader(Integer id, String name, String sex, String barcode, String vocation, String birthday,
			String paperType, String paperNo, String tel, String email, String createDate, String operator,
			String remark, int typeid) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.barcode = barcode;
		this.vocation = vocation;
		this.birthday = birthday;
		this.paperType = paperType;
		this.paperNo = paperNo;
		this.tel = tel;
		this.email = email;
		this.createDate = createDate;
		this.operator = operator;
		this.remark = remark;
		this.typeid = typeid;
	}
	
	public Reader(Integer id, String name, String sex, String barcode, String vocation, String birthday,
			String paperType, String paperNo, String tel, String email, String createDate, String operator,
			String remark, int typeid, String type) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.barcode = barcode;
		this.vocation = vocation;
		this.birthday = birthday;
		this.paperType = paperType;
		this.paperNo = paperNo;
		this.tel = tel;
		this.email = email;
		this.createDate = createDate;
		this.operator = operator;
		this.remark = remark;
		this.typeid = typeid;
		this.type = type;
	}

	public Reader(Integer id, String name, String sex, String barcode, String vocation, String birthday,
			String paperType, String paperNo, String tel, String email, String createDate, String operator,
			String remark, int typeid, int number, String type) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.barcode = barcode;
		this.vocation = vocation;
		this.birthday = birthday;
		this.paperType = paperType;
		this.paperNo = paperNo;
		this.tel = tel;
		this.email = email;
		this.createDate = createDate;
		this.operator = operator;
		this.remark = remark;
		this.typeid = typeid;
		this.number = number;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Reader [id=" + id + ", name=" + name + ", sex=" + sex + ", barcode=" + barcode + ", vocation="
				+ vocation + ", birthday=" + birthday + ", paperType=" + paperType + ", paperNo=" + paperNo + ", tel="
				+ tel + ", email=" + email + ", createDate=" + createDate + ", operator=" + operator + ", remark="
				+ remark + ", typeid=" + typeid + ", type=" + type + "]";
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getVocation() {
		return vocation;
	}
	public void setVocation(String vocation) {
		this.vocation = vocation;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
    
    
}
