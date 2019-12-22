package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class UserIndex {

	public void choice(UserBean bean) {
		MedicalValidation medicalValidation = MedicineFactory.getMEdicalValidation();
		System.out.println("Enter Your Choice ");
		System.out.println("Press 1 for View Medicine");
		System.out.println("Press 2 for Message");
		System.out.println("Press 3 for Change Password");
		System.out.println("Press 4 for Logout");
		System.out.println("Press 5 to View Cart");
		System.out.println("Press 6 to View OrderHistory");
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			String id = scan.nextLine();
			if (medicalValidation.validateNo(id)) {
				choice = Integer.parseInt(id);
				break;
			} else {
				System.err.println("Enter Valid Input");
				System.out.println("Enter your Choice");
			}
		}
		switch (choice) {
		case 1:
			new ViewMedicine().viewMedicine(bean);
			break;
		case 2:
			new MessageController().usermessage(bean);
			break;
		case 3:
			new ChangePassword().changePassword(bean);
			break;
		case 4:
			System.out.println("Thankyou Please Visit Again");
			new Logout().logout();
			break;
		case 5:
			new ViewCart().options(bean);
			break;
		case 6:
			new ViewHistory().viewHistory(bean);
			break;
		default:
			System.err.println("Invalid InPut Please Enter Correct InPut");
			break;
		}
	}
}
