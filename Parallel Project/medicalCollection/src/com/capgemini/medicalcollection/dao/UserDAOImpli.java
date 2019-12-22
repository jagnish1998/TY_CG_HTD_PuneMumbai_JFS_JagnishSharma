package com.capgemini.medicalcollection.dao;

import java.util.List;
import java.util.Set;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.controller.RegisterUser;
import com.capgemini.medicalcollection.database.UserDataBase;

public class UserDAOImpli implements UserDAO {

	UserBean bean;
	UserDataBase dataBase = new UserDataBase();
	Set<UserBean> userBeans = dataBase.getUser();

	@Override
	public UserBean login(String email, String password) {
		for (UserBean userBean : userBeans) {
			if (userBean.getUserEmail().equalsIgnoreCase(email) && userBean.getUserPassword().equals(password)) {
				bean = userBean;
				break;
			}
		}
		return bean;
	}

	@Override
	public boolean userRegister(String email, String password, String name) {
		String userType = "user";
		int check = 0;
		int userid = userBeans.size() + 101;
		UserBean b = new UserBean(userid, name, password, userType, email);
		boolean isAdded = false;
		for (UserBean userBean : userBeans) {
			if (b.getUserEmail().equals(userBean.getUserEmail())) {
				check++;
			}
		}
		if (check == 0) {
			userBeans.add(b);
			isAdded = true;
		} else {
			System.out.println("User Already Exist");
			new RegisterUser().userRegister();
		}
		return isAdded;
	}

	@Override
	public boolean adminRegister(String email, String password, String name) {
		String userType = "admin";
		int userid = userBeans.size() + 101;
		int check = 0;
		UserBean b = new UserBean(userid, name, password, userType, email);
		boolean isAdded = false;
		for (UserBean userBean : userBeans) {
			if (b.getUserEmail().equals(userBean.getUserEmail())) {
				check++;
			}
		}
		if (check == 0) {
			userBeans.add(b);
			isAdded = true;
		} else {
			System.out.println("User Already Exist");
			new RegisterUser().adminRegister(b);
		}

		return isAdded;
	}

	@Override
	public Set<UserBean> getUsers() {
		return dataBase.getUser();
	}

	public boolean removeUser(int uid) {
		boolean isDeleted = false;
		for (UserBean bean : userBeans) {
			if (bean.getUserId() == uid) {
				userBeans.remove(bean);
				isDeleted = true;
				break;
			} else {
				isDeleted = false;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean changePassword(UserBean bean, String pass) {
		boolean isChanged = false;
		for (UserBean userBean : userBeans) {
			if (userBean.getUserEmail().equals(bean.getUserEmail())) {
				userBean.setUserPassword(pass);
				isChanged = true;
			}
		}
		return isChanged;
	}

}