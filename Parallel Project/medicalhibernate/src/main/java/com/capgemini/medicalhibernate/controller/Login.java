package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class Login {

	public void loginUser() {
		UserDAO dao = MedicineFactory.getMedicalDAO();
		MedicalValidation medicalValidation = MedicineFactory.getMEdicalValidation();

		MedicalValidation validation = MedicineFactory.getMEdicalValidation();
		System.out.println("---------------- Welocme To Login Page --------------------------");
		Scanner scan = new Scanner(System.in);
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
		UserBean bean = null;
		try{
			bean = dao.loginUser(email, password);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			new Logout().logout();
		}
		if (bean != null) {
			System.out.println("Login SucessFull");
			System.out.println("Welcome " + bean.getUserName());
			if (bean.getUserType().equals("admin")) {
				new AdminIndex().choice(bean);
			} else if (bean.getUserType().equals("user")) {
				new UserIndex().choice(bean);
			} else {
				System.out.println("Invalid ");
			}
		} else {
			System.out.println("Invalid UserName And Password");
			new Logout().logout();
		}
	}
}
