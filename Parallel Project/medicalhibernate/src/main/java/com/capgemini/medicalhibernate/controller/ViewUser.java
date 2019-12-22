package com.capgemini.medicalhibernate.controller;

import java.util.List;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class ViewUser {

	public void viewUser(UserBean bean) {
		UserDAO dao = MedicineFactory.getMedicalDAO();

		List<UserBean> list = null;
		try {
			list = dao.getuser();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if (list != null && !list.isEmpty()) {
			for (UserBean userBean : list) {
				System.out.println(userBean);
			}
		}
		new AdminIndex().choice(bean);
	}

	public void viewUser() {
		UserDAO dao = MedicineFactory.getMedicalDAO();
		List<UserBean> list = null;
		try {
			list = dao.getuser();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if (list != null && !list.isEmpty()) {
			for (UserBean userBean : list) {
				System.out.println(userBean);
			}
		}
	}
}
