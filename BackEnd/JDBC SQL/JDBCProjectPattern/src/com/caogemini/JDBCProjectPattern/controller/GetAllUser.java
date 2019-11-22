package com.caogemini.JDBCProjectPattern.controller;

import java.util.Iterator;
import java.util.List;

import com.caogemini.JDBCProjectPattern.DAO.UserDAO;
import com.caogemini.JDBCProjectPattern.bean.Bean;
import com.caogemini.JDBCProjectPattern.factory.UserFactory;
import com.caogemini.JDBCProjectPattern.validation.UserValidation;

public class GetAllUser
{
	public static void main(String[] args) 
	{
		UserDAO ud = UserFactory.getDAOInstance();
		UserValidation uv = UserFactory.getUserValidationInstance();
		List<Bean> l = ud.getAllUser();
		if(l != null)
		{
			Iterator<Bean> i = l.iterator();
			while (i.hasNext())
			{
				System.out.println(i.next());
			} 
		}
		else 
		{
			System.out.println("Somthing went wrong");
		}
	}
}
