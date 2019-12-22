package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.UserDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class UserController {

	public void loginUser() {
		UserDAO dao = MedicineFactory.getUserDAO();
		System.out.println("---------------- Welocme To Login Page --------------------------");
		Scanner scan = new Scanner(System.in);
		MedicalValidation  medicalValidation = MedicineFactory.getMedicalValidation();
		String email;
		while (true) {
			System.out.println("Enter email");
			email = scan.nextLine();
			if (medicalValidation.validUserEmail(email)) {
				break;
			} else {
				System.err.println("Enter Valid Email");
			}
		}
		String password;
		while (true) {
			System.out.println("Enter password");
			password = scan.nextLine();
			if (medicalValidation.validUserPassword(password)) {
				break;
			} else {
				System.err.println("Enter Valid Password");
			}
		}

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
