package com.capgemini.medicalspringrest.dao;

import java.util.List;

import com.capgemini.medicalspringrest.bean.UserBean;

public interface UserDAO {

	UserBean getUser(int userId);
	public boolean addUser(UserBean bean);
	public List<UserBean> getAllUser();
	public boolean removeUser(int userId);
	public boolean updateUser(UserBean userBean);
	public UserBean userLogin(String email,String password);
}
