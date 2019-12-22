package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.UserDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class RegisterUser {
	MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();

	public void userRegister() {
		System.out.println(
				"---------------------------------------Welcome to user Registation Page---------------------------------");
		UserDAO dao = MedicineFactory.getUserDAO();
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
			String userName = null;
		String email = null;
		String password = null;

		// Validate UserName
		while (true) {
			System.out.println("Enter Your UserName");
			userName = scanner.nextLine();
			if (medicalValidation.validateUserName(userName)) {
				break;
			} else {
				System.err.println("Enter Valid UserName");
			}
		}

		// Validate UserEmail
		while (true) {
			System.out.println("Enter User Email");
			email = scanner.nextLine();
			if (medicalValidation.validUserEmail(email)) {
				break;
			} else {
				System.err.println("Enter Valid Email");
			}
		}

		// Validate password

		while (true) {
			System.out.println("Enter Your Password");
			password = scanner.nextLine();
			if (medicalValidation.validUserPassword(password)) {
				break;
			} else {
				System.err.println("Password must be between 4 to 8");
			}
		}

		if (dao.userRegister(email, password, userName)) {
			System.out.println("User Registered Successfully");
			new UserController().loginUser();
		}
	}

	public void adminRegister(UserBean userBean) {
		System.out.println(
				"---------------------------------------Welcome to admin Registation Page---------------------------------");
		UserDAO dao = MedicineFactory.getUserDAO();
		String userName = null;
		String email = null;
		String password = null;
		Scanner scanner = new Scanner(System.in);

		// Validate UserName
		while (true) {
			System.out.println("Enter  UserName");
			userName = scanner.nextLine();
			if (medicalValidation.validateUserName(userName)) {
				break;
			} else {
				System.err.println("Enter Valid UserName");

			}
		}
		// Validate UserEmail
		while (true) {
			email = scanner.nextLine();
			System.out.println("Enter Your Email");
			if (medicalValidation.validUserEmail(email)) {
				break;
			} else {
				System.err.println("Enter Valid Email");

			}
		}

		// Validate password
		while (true) {
			System.out.println("Enter Your Password");
			password = scanner.nextLine();
			if (medicalValidation.validUserPassword(password)) {
				break;
			} else {
				System.err.println("Password must be in 4 to 8");

			}
		}

		if (dao.adminRegister(email, password, userName)) {
			System.out.println("User Registered Successfully");
			new AdminIndex().adminIndex(userBean);
		}
	}
}
