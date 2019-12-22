package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.UserDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class Register {
	public void registerUser() {
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		Scanner scanner = new Scanner(System.in);
		UserDAO dao = MedicineFactory.getMedicalDAO();
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
				System.err.println("UserName Must be In FirstName and LastName");
				System.out.println();
			}
		}

		// Validate UserEmail
		while (true) {
			System.out.println("Enter  Email");
			email = scanner.nextLine();
			if (medicalValidation.validUserEmail(email)) {
				break;
			} else {
				System.err.println("Email is Not Valid");
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
		boolean added = false;

		try {
			added = dao.registerUser(userName, email, password);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (added) {
			System.out.println("User is registerd Successfully");
			new Login().loginUser();
		}
		new Logout().logout();
	}

	public void adminRegister(UserBean bean) {

		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		UserDAO dao = MedicineFactory.getMedicalDAO();
		String userName = null;
		String email = null;
		String password = null;
		System.out.println("Enter User Name");
		Scanner scanner = new Scanner(System.in);

		// Validate UserName
		while (true) {
			userName = scanner.nextLine();
			if (medicalValidation.validateUserName(userName)) {
				break;
			} else {
				System.err.println("Enter Valid UserName");
				System.out.println("UserName Must be In FirstName and LastName");
			}
		}
		System.out.println("Enter User Email");
		// Validate UserEmail
		while (true) {
			email = scanner.nextLine();
			if (medicalValidation.validUserEmail(email)) {
				break;
			} else {
				System.err.println("Enter Valid Email");
				System.out.println("Email is not valid");
			}
		}
		System.out.println("Enter user Password");

		// Validate password
		while (true) {
			password = scanner.nextLine();
			if (medicalValidation.validUserPassword(password)) {
				break;
			} else {
				System.err.println("Password must be in 4 to 8");
				System.out.println("Enter Your Password");
			}
		}
		String type = null;
		boolean cnd = true;
		while (cnd) {
			System.out.println("Enter use type ");
			System.out.println("Press 1 for Admin");
			System.out.println("Press 2 for Normal User");
			int choice = 0;
			while (true) {
				String ch = scanner.nextLine();
				if (medicalValidation.validateNo(ch)) {
					choice = Integer.parseInt(ch);
					break;
				} else {
					System.err.println("Enter Valid Input");
					System.out.println("Enter Your Choice");
				}
			}
		
			switch (choice) {
			case 1:
				type = "admin";
				cnd = false;
				break;
			case 2:
				type = "user";
				cnd = false;
				break;
			default:
				System.err.println("Please Enter the Write choice ");
				cnd = true;
				break;
			}
		}
		boolean added = false;

		try {
			added = dao.adminRegisterUser(userName, email, password, type);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if (added) {
			System.out.println("User is registerd Successfully");
		}
		new AdminIndex().choice(bean);
	}
}
