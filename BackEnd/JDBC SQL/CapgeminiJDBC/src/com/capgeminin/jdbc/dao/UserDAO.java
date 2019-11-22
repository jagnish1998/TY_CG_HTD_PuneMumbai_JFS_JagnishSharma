package com.capgeminin.jdbc.dao;

import java.util.List;

import com.capgeminin.jdbc.beans.Userbean;

public interface UserDAO 
{
	public List<Userbean> getAllInfo(); 
	public Userbean getInfo(int userid);
	public Userbean login(int userid , String password);

	
	
}
