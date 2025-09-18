package com.attendance1.bean;

public class addstudent {
	
	public addstudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int rollno;
	private String name;
	private String email;
	private int mobile;

	public addstudent(int rollno, String name, String email, int mobile) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
