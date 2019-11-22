package com.capgemini.login.factory;

import com.capgemini.login.dao.UserDAO;
import com.capgemini.login.dao.UserDAOJDBCimpl;

public class UserFactory
{
	private UserFactory() 
	{

	}
	public static UserDAO getInstance() 
	{
		UserDAO dao = new UserDAOJDBCimpl();
		return dao;
	}

}
