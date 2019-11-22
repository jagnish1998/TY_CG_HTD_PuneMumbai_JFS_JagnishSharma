package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.UserDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class UserController {

	public void loginUser() {
		UserDAO dao = MedicineFactory.getUserDAO();
		System.out.println("---------------- Welocme To Login Page --------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email");
		String email = scan.nextLine();
		System.out.println("Enter password");
		String password = scan.nextLine();
		UserBean userBean = dao.login(email, password);
		if (userBean != null) {
			System.out.println("Login SuccessFull");
			if (userBean.getUserType().equals("admin")) {
				new AdminIndex().adminIndex(userBean);
			} else {
				new UserIndex().userIndex(userBean);
			}
		} else {
			System.out.println("Invalid UserId and Password");
			new Logout().logout();
		}
	}
}
