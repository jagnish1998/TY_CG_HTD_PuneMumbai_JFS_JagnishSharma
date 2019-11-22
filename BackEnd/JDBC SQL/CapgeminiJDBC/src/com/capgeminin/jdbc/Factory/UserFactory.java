package com.capgeminin.jdbc.Factory;

import com.capgeminin.jdbc.dao.UserDAO;
import com.capgeminin.jdbc.dao.UserDAOJDBCimpl;

public class UserFactory 
{
	private UserFactory()
	{

	}

	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOJDBCimpl();
		return dao;
	}

}
