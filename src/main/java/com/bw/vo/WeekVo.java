package com.bw.vo;

import com.bw.entity.Week;

public class WeekVo extends Week{

	private String types;
	private String pinpais;
	private double p1;
	private double p2;
	private String names;
	private Integer pageNum;
	
	public WeekVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeekVo(String types, String pinpais, double p1, double p2, String names, Integer pageNum) {
		super();
		this.types = types;
		this.pinpais = pinpais;
		this.p1 = p1;
		this.p2 = p2;
		this.names = names;
		this.pageNum = pageNum;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getPinpais() {
		return pinpais;
	}
	public void setPinpais(String pinpais) {
		this.pinpais = pinpais;
	}
	public double getP1() {
		return p1;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public double getP2() {
		return p2;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	@Override
	public String toString() {
		return "WeekVo [types=" + types + ", pinpais=" + pinpais + ", p1=" + p1 + ", p2=" + p2 + ", names=" + names
				+ ", pageNum=" + pageNum + "]";
	}

	
	
	
	
}
