package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class Logout {
	public void logout() {
		System.out.println("*************************Welcome to Medical Store**********************************");
		System.out.println("Enter Your choice");
		System.out.println("Enter 1 to login");
		System.out.println("Enter 2 to Register");
		System.out.println("Enter 3 to view medicine");
		System.out.println("Enter 4 to Exit");
		Scanner scan = new Scanner(System.in);
		MedicalValidation validation = MedicineFactory.getMedicalValidation();
		int choice = 0;
		while (true) {
			String ch = scan.nextLine();
			if (validation.validateNo(ch)) {
				choice = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
				System.out.println("Enter Yout Choice");
			}
		}
		switch (choice) {
		case 1:
			new UserController().loginUser();
			break;
		case 2:
			new RegisterUser().userRegister();
			break;
		case 3:
			new ViewMedicine().viewMedicine();
			break;
		case 4:
			System.exit(0);
		default:
			System.err.println("Invalid Input Please Enter Correct InPut");
			break;
		}

	}
}
