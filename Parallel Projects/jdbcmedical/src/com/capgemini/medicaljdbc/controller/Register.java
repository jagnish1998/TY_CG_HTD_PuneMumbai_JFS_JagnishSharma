package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.UserDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class Register {
	public void registerUser() {
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		UserDAO dao = MedicineFactory.getMedicalDAO();
		String userName = null;
		String email = null;
		String password = null;
		System.out.println("Enter User Name");
		Scanner scanner = new Scanner(System.in);

		// Validate UserName

		userName = scanner.nextLine();
		if (medicalValidation.validateUserName(userName)) {

		} else {
			System.err.println("Please Enter Valid UserName");
			new Register().registerUser();
		}

		System.out.println("Enter User Email");

		// Validate UserEmail
		email = scanner.nextLine();
		if (medicalValidation.validUserEmail(email)) {

		} else {
			System.err.println("Please Enter Valid Email");
			new Register().registerUser();
		}

		System.out.println("Enter user Password");

		// Validate password
		password = scanner.nextLine();
		if (medicalValidation.validUserPassword(password)) {

		} else {
			System.err.println("Please Enter Valid Password");
			new Register().registerUser();
		}

		boolean added = dao.registerUser(userName, email, password);
		if (added) {
			System.out.println("User is registerd Successfully");
			new Login().loginUser();
		} else {
			System.out.println("Somthing wents Wrong");
			new Register().registerUser();
		}
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

		userName = scanner.nextLine();
		if (medicalValidation.validateUserName(userName)) {

		} else {
			System.err.println("Please Enter Valid UserName");
			new Register().adminRegister(bean);
		}

		System.out.println("Enter User Email");

		// Validate UserEmail
		email = scanner.nextLine();
		if (medicalValidation.validUserEmail(email)) {

		} else {
			System.err.println("Please Enter Valid Email");
			new Register().adminRegister(bean);
		}

		System.out.println("Enter user Password");

		// Validate password
		password = scanner.nextLine();
		if (medicalValidation.validUserPassword(password)) {

		} else {
			System.err.println("Please Enter Valid Password");
			new Register().adminRegister(bean);
		}

		System.out.println("Enter use type ");
		System.out.println("Press 1 for Admin");
		System.out.println("Press 2 for Normal User");
		int choice = 0;
		try {
			choice = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("Please Enter Valid Input");
			new Register().adminRegister(bean);
		}
		String type = null;
		switch (choice) {
		case 1:
			type = "admin";
			break;
		case 2:
			type = "user";
			break;
		default:
			System.out.println("Please Enter the Write choice ");
			System.exit(0);
		}

		boolean added = dao.adminRegisterUser(userName, email, password, type);
		if (added) {
			System.out.println("User is registerd Successfully");
			new AdminIndex().choice(bean);
		} 
		new AdminIndex().choice(bean);
	}
}
