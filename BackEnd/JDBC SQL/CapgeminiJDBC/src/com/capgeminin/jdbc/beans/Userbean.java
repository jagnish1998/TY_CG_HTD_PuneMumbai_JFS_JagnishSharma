package com.capgeminin.jdbc.beans;

public class Userbean {
	private Integer userid;
	private String username;
	private String email;
	private String password;
	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString()
	{
		return "Userbean [userid=" + userid + ", username=" + username + ", email=" + email+ "]";
	}
	
	

}
