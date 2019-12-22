package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class AddMedicine {

	public void addMedicine(UserBean userBean) {

		MedicineBean medBean = new MedicineBean();
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation validation = MedicineFactory.getMEdicalValidation();

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
		
		medBean.setmedicineName(medicineName);
		medBean.setPrice(price);
		medBean.setproductCategory(productCategory);
		boolean added = false;
		try {
		added= dao.addMedicine(medBean);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			new AdminIndex().choice(userBean);
		}
		if (added) {
			System.out.println("Medicine Added  Successfully");
		} else {
			System.out.println("Somthing wents Wrong");
		}
		new AdminIndex().choice(userBean);
	}
}
