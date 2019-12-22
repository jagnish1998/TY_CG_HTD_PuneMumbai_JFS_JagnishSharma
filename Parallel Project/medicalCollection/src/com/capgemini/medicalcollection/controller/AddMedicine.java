package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class AddMedicine {
	public void addMedicine(UserBean bean1) {

		MedicineBean bean = new MedicineBean();
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation validation = MedicineFactory.getMedicalValidation();
		Scanner sc = new Scanner(System.in);
		String medicineName;
		while (true) {
			System.out.println("Enter medicine Name");
			medicineName = sc.nextLine();
			if (validation.validateMedicineCategory(medicineName)) {
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}

		double price = 0;
		while (true) {
			System.out.println("Enter Medicine Price ");
			String ch = sc.nextLine();
			if (validation.validatePrice(ch)) {
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
			if (validation.validateMedicineCategory(productCategory)) {
				break;
			} else {
				System.err.println("Enter Valid Category");
			}
		}
		bean.setmedicineName(medicineName);
		bean.setPrice(price);
		bean.setproductCategory(productCategory);
		boolean isAdded = dao.addMedicine(bean);
		if (isAdded) {
			System.out.println("Medicine is registerd Successfully");
		}
		new AdminIndex().adminIndex(bean1);
	}
}
