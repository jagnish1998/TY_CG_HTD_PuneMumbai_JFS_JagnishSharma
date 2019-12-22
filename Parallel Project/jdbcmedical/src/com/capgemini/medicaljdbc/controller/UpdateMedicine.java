package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class UpdateMedicine {
	MedicineDAO medicalDAO = MedicineFactory.getMedicineDAO();

	public void updateMedicine(UserBean bean) {

		Scanner sc = new Scanner(System.in);
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		System.out.println("press 1 to update name");
		System.out.println("press 2 to update price");
		System.out.println("press 3 to update description");
		int choice = 0;

		while (true) {
			String ch = sc.nextLine();
			if (medicalValidation.validateNo(ch)) {
				choice = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
				System.out.println("Enter Your Choice");
			}
		}

		int mid = 0;
		while (true) {
			System.out.println("Enter the mid:");
			String id = sc.nextLine();
			if (medicalValidation.validateNo(id)) {
				mid = Integer.parseInt(id);
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}

		boolean isUpdated = false;
		switch (choice) {

		case 1:
			String name = null;
			while (true) {
				System.out.println("Enter the name:");
				name = sc.nextLine();
				if (medicalValidation.validateMedicineCategory(name)) {
					break;
				} else {
					System.err.println("Enter Valid Medicine Name ");
				}
			}

			try {
				isUpdated = medicalDAO.updateMedicine(mid, name);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			if (isUpdated) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct userId");
			}
			break;

		case 2:
			double price = 0;
			while (true) {
				System.out.println("Enter the price:");
				String ch = sc.nextLine();
				if (medicalValidation.validatePrice(ch)) {
					price = Double.parseDouble(ch);
					break;
				} else {
					System.err.println("Enter Valid Input");
				}
			}

			try {
				isUpdated = medicalDAO.updateMedicine(mid, price);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			if (isUpdated) {
				System.out.println("Medicine name Update Sucessfully");
			} else {
				System.out.println("Enter Correct userId");
			}
			break;

		case 3:
			String category;
			while (true) {
				System.out.println("Enter the Category");
				String ch = sc.nextLine();
				if (medicalValidation.validateMedicineCategory((ch))) {
					category = ch;
					break;
				} else {
					System.err.println("Enter Valid Input");
				}
			}
			
			try {
				isUpdated = medicalDAO.updateMedicinedescription(mid, category);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			
			if (isUpdated) {
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
