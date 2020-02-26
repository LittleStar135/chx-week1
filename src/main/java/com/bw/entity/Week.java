package com.bw.entity;

public class Week {

	private Integer id;
	private String name;
	private String ename;
	private String pinpai;
	private String type;
	private double dx;
	private double price;
	private Integer count;
	private String total;
	private String img;
	public Week() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Week(Integer id, String name, String ename, String pinpai, String type, double dx, double price,
			Integer count, String total, String img) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.pinpai = pinpai;
		this.type = type;
		this.dx = dx;
		this.price = price;
		this.count = count;
		this.total = total;
		this.img = img;
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
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getDx() {
		return dx;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Week [id=" + id + ", name=" + name + ", ename=" + ename + ", pinpai=" + pinpai + ", type=" + type
				+ ", dx=" + dx + ", price=" + price + ", count=" + count + ", total=" + total + ", img=" + img + "]";
	}
	
	
	
	
	
}
