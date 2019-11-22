package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;

public class UpdateMedicine {
	MedicineDAO medicalDAO = MedicineFactory.getMedicineDAO();

	public void updateMedicine(UserBean bean) {

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to update name");
		System.out.println("press 2 to update price");
		System.out.println("press 3 to update description");
		int choice = 0;
		
		
		try {
			choice = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Enter Valid Input");
			new UpdateMedicine().updateMedicine(bean);
		}

		
		System.out.println("Enter the mid:");
		int mid = 0;
		
		
		try {
			mid = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Enter Valid Mid");
			new UpdateMedicine().updateMedicine(bean);
		}

		switch (choice) {
		
		
		case 1:
			System.out.println("Enter the name:");
			String name = sc.next();
			if (medicalDAO.updateMedicine(mid, name)) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct userId");
			}
			break;
		
		
		case 2:
			System.out.println("Enter the price:");
			double price = 0;
			
			try {
				price = Double.parseDouble(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Enter Valid price");
				new UpdateMedicine().updateMedicine(bean);
			}
			
			if (medicalDAO.updateMedicine(mid, price)) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct userId");
			}
			break;
		
		
		case 3:
			System.out.println("Enter the catgeory:");
			String catgeory = sc.nextLine();
			if (medicalDAO.updateMedicinedescription(mid, catgeory)) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct userId");
			}
			break;
		
		
		default:
			System.out.println("please enter valid options!!!");
		}
		new AdminIndex().choice(bean);
	}
}
