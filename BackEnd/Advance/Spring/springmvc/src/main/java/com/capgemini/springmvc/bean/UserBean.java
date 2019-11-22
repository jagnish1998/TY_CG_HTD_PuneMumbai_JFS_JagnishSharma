package com.capgemini.springmvc.bean;

import java.sql.Date;

public class UserBean {
	private String empId;
	private String pass;
	private Date dob;
	
	//Getter And Setter
	
	
	public String getEmpId() {
		return empId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
