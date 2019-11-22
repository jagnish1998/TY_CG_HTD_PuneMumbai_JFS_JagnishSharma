package com.caogemini.JDBCProjectPattern.factory;

import com.caogemini.JDBCProjectPattern.DAO.UserDAO;
import com.caogemini.JDBCProjectPattern.DAO.UserDAOImp;
import com.caogemini.JDBCProjectPattern.validation.UserValidation;

public class UserFactory 
{
	private UserFactory()
	{
		super();
	}

	public static UserDAO getDAOInstance()
	{
		UserDAO dao = new UserDAOImp();
		return dao;
	}
	
	public static UserValidation getUserValidationInstance()
	{
		UserValidation v1 = new UserValidation();
		return v1;
	}
}
