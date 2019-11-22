package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class UpdateMedicine {

	MedicineDAO medicalDAO = MedicineFactory.getMedicineDAO();

	public void updateMedicine(UserBean bean) {

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to update name");
		System.out.println("press 2 to update price");
		System.out.println("press 3 to update description");
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:
			System.out.println("Enter the mid:");
			int mid = sc.nextInt();
			System.out.println("Enter the name:");
			String name = sc.next();
			if (medicalDAO.updateMedicineName(mid, name)) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct MedicineId");
			}
			break;
		case 2:
			System.out.println("Enter the mid:");
			int id = sc.nextInt();
			System.out.println("Enter the price:");
			double price = sc.nextDouble();
			if (medicalDAO.updateMedicinePrice(id, price)) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct MedicineId");
			}
			break;
		case 3:
			System.out.println("Enter the mid:");
			int medId = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the catgeory:");
			String catgeory = sc.nextLine();
			if (medicalDAO.updateMedicineCategory(medId, catgeory)) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct MedicineId");
			}
			break;
		default:
			System.out.println("please enter valid options!!!");
		}
		new AdminIndex().choice(bean);
	}
}
