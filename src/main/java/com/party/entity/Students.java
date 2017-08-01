package com.party.entity;

public class Students {
	private String stu_id;
	private String stu_name;
	private String stu_Passwd;
	private String stu_class;
	private String statu;
	private String period;
	public Students(String stu_id, String stu_name, String stu_Passwd, String stu_class, String statu, String period) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_Passwd = stu_Passwd;
		this.stu_class = stu_class;
		this.statu = statu;
		this.period = period;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_Passwd() {
		return stu_Passwd;
	}
	public void setStu_Passwd(String stu_Passwd) {
		this.stu_Passwd = stu_Passwd;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
	

}
