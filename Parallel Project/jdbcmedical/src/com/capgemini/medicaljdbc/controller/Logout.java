package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

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
			new Login().loginUser();
			break;
		case 2:
			new Register().registerUser();
			break;
		case 3:
			new ViewMedicine().getAllMedicine();
			break;
		case 4:
			System.exit(0);
		default:
			System.err.println("Invalid InPut Please Enter Correct InPut");
			new Logout().logout();
			break;
		}
	}
}
