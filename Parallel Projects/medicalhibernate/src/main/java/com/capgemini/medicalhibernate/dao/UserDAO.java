package com.capgemini.medicalhibernate.dao;

import java.util.List;

import com.capgemini.medicalhibernate.bean.UserBean;

public interface UserDAO {

	UserBean loginUser(String email, String password);

	boolean registerUser(String userName, String email, String password);

	boolean adminRegisterUser(String userName, String email, String password, String type);

	List<UserBean> getuser();

	boolean removeUser(int uId);

	boolean changePass(UserBean bean);

}
