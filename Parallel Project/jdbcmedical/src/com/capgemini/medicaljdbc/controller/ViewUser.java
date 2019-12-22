package com.capgemini.medicaljdbc.controller;

import java.util.List;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.UserDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;

public class ViewUser {
	public void viewUser(UserBean bean) {
		UserDAO dao =null;
		try {
			dao =  MedicineFactory.getMedicalDAO();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		List<UserBean> list =null;
		try {
			list  = dao.getuser();	
		}catch (Exception e) {
			e.getMessage();
		}
		if (list != null) {
			for (UserBean userBean : list) {

				System.out.println(" Id is " + userBean.getUserId());
				System.out.println(" Name  is " + userBean.getUserName());
				System.out.println(" Email is " + userBean.getUserEmail());
				System.out.println(" Password is " + userBean.getUserPassword());
				System.out.println("-------------------------------------------------------------------------------");
			}
		}
		new AdminIndex().choice(bean);
	}
	public void viewUser() {
		UserDAO dao = MedicineFactory.getMedicalDAO();
		List<UserBean> list =null;
		try {
			list  = dao.getuser();	
		}catch (Exception e) {
			e.getMessage();
		}
		if (list != null) {
			for (UserBean userBean : list) {

				System.out.println(" Id is " + userBean.getUserId());
				System.out.println(" Name  is " + userBean.getUserName());
				System.out.println(" Email is " + userBean.getUserEmail());
				System.out.println(" Password is " + userBean.getUserPassword());
				System.out.println("-------------------------------------------------------------------------------");
			}
		}
	}

}
