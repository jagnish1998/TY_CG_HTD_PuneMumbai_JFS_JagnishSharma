package com.caogemini.JDBCProjectPattern.DAO;

import java.util.ArrayList;
import java.util.List;

import com.caogemini.JDBCProjectPattern.bean.Bean;

public interface UserDAO
{
	Bean getInfo(int i);
	boolean insertUser(Bean user);
	List<Bean> getAllUser();
	boolean deleteUser(int userid,String password);
}
