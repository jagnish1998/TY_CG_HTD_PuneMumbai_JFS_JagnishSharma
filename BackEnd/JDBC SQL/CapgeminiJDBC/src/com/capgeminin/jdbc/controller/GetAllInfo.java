package com.capgeminin.jdbc.controller;

import java.util.List;

import com.capgeminin.jdbc.Factory.UserFactory;
import com.capgeminin.jdbc.beans.Userbean;
import com.capgeminin.jdbc.dao.UserDAO;

public class GetAllInfo {
	public static void main(String[] args) 
	{
		UserDAO dao = UserFactory.getInstance();		
		List<Userbean> userList = dao.getAllInfo();
		if (userList != null) 
		{
			for (Userbean user : userList)
			{
				System.out.println(user);
			}
		} else
		{
			System.out.println("Somthing wents Wrong");
		}

	}
}
