package com.capgemini.medicalcollection.database;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.capgemini.medicalcollection.bean.UserBean;

public class UserDataBase {
	static Set<UserBean> userBeans = new LinkedHashSet<UserBean>();

	static {
		UserBean b1 = new UserBean(101, "Jagnish Sharma", "jagnish", "admin", "jagnish@gmail.com");
		UserBean b2 = new UserBean(102, "Uday Shroff", "uday1234", "user", "uday@gmail.com");
		UserBean b3 = new UserBean(103, "Mohit Sharma", "mohit1234","user", "mohit@gmail.com");
		UserBean b4 = new UserBean(104, "admin admin", "admin1234","admin", "admin@gmail.com");
		UserBean b5 = new UserBean(105, "userA userA", "userA1234","user", "usera@gmail.com");
		userBeans.add(b1);
		userBeans.add(b2);
		userBeans.add(b3);
		userBeans.add(b4);
		userBeans.add(b5);
	}

	public Set<UserBean> getUser() {
		return userBeans;
	}
}
