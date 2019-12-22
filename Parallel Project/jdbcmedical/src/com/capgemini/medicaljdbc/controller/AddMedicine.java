package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.MedicineBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class AddMedicine {
	public void addMedicine(UserBean bean1) {

		MedicineBean bean = new MedicineBean();
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation validaton = MedicineFactory.getMedicalValidation();

		Scanner sc = new Scanner(System.in);
		String medicineName;
		while (true) {
			System.out.println("Enter medicine Name");
			medicineName = sc.nextLine();
			if (validaton.validateMedicineCategory(medicineName)) {
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		
		
		double price = 0;
		while (true) {
			System.out.println("Enter Medicine Price ");
			String ch = sc.nextLine();
			if (validaton.validatePrice(ch)) {
				price = Double.parseDouble(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		
		String productCategory;
		while (true) {
			System.out.println("Enter product_catgegory ");
			productCategory = sc.nextLine();
			if (validaton.validateMedicineCategory(productCategory)) {
				break;
			} else {
				System.err.println("Enter Valid Category");
			}
		}
		bean.setMedicineName(medicineName);
		bean.setPrice(price);
		bean.setProductCategory(productCategory);
		boolean added = false;
		try {
			added = dao.addMedicine(bean);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		if (added) {
			System.out.println("Medicine Added  Successfully");
		} else {
			System.out.println("Somthing wents Wrong");
		}
		new AdminIndex().choice(bean1);
	}
}
