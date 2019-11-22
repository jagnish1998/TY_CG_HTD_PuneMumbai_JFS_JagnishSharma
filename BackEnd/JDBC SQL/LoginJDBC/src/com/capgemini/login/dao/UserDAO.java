package com.capgemini.login.dao;

import com.capgemini.login.bean.UserBean;

public interface UserDAO
{
	public UserBean getInfo(int userid , String password);
	
}
