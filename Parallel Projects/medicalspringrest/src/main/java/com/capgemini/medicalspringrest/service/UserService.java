package com.capgemini.medicalspringrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.medicalspringrest.bean.UserBean;

@Service
public interface UserService {

	UserBean getUser(int userId);
	public boolean addUser(UserBean bean);
	public List<UserBean> getAllUser();
	public boolean removeUser(int userId);
	public boolean updateUser(UserBean userBean);
	public UserBean userLogin(String email,String password);
	
}
