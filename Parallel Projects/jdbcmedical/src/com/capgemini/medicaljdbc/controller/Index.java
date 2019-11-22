package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {

		System.out.println("*************************Welcome to Medical Store**********************************");
		System.out.println("Enter Your choice");
		System.out.println("Enter 1 to login");
		System.out.println("Enter 2 to Register");
		System.out.println("Enter 3 to view medicine");
		System.out.println("Enter 4 to Exit");
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		try {
			choice = Integer.parseInt(scan.nextLine());
		} catch (Exception e) {
			System.err.println("Please Enter Valid Input");
			new Logout().logout();
		}
		switch (choice) {
		case 1:
			new Login().loginUser();
			break;
		case 2:
			new Register().registerUser();
			break;
		case 3:
			new ViewMedicine().viewMedicine();
			break;
		case 4:
			System.exit(0);
		default:
			System.err.println("Invalid Input Please Enter Correct InPut");
			new Logout().logout();
			break;
		}
	}
}
