package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class Register {

	public void registerUser() {
		// MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		UserDAO dao = MedicineFactory.getMedicalDAO();
		System.out.println("Enter User Name");
		Scanner scanner = new Scanner(System.in);
		String UserName = scanner.nextLine();
		System.out.println("");

		System.out.println("Enter User Email");
		String email = scanner.nextLine();
		System.out.println("Enter use Password");
		String password = scanner.nextLine();

		boolean added = dao.registerUser(UserName, email, password);
		if (added) {
			System.out.println("User is registerd Successfully");
			new Login().loginUser();
		} else {
			System.out.println("Somthing wents Wrong");
		}

	}

	public void adminRegister(UserBean bean) {

		UserDAO dao = MedicineFactory.getMedicalDAO();
		System.out.println("Enter User Name");
		Scanner scanner = new Scanner(System.in);
		String UserName = scanner.nextLine();
		System.out.println("Enter User Email");
		String email = scanner.nextLine();
		System.out.println("Enter use Password");
		String password = scanner.nextLine();

		System.out.println("Enter use type ");
		System.out.println("Press 1 for Admin");
		System.out.println("Press 2 for Normal User");
		int choice = Integer.parseInt(scanner.nextLine());
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

		boolean added = dao.adminRegisterUser(UserName, email, password, type);
		if (added) {
			System.out.println("User is registerd Successfully");
			new AdminIndex().choice(bean);
		} else {
			System.out.println("Somthing wents Wrong");
		}
		new AdminIndex().choice(bean);
	}

}
