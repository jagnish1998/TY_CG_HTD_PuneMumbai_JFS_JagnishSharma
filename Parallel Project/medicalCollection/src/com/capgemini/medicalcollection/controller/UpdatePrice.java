package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class UpdatePrice {
	public void updatePrice(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		int mCode;
		while (true) {
			System.out.println("Enter Medicine Code you want to update ");
			String ch = scan.nextLine();
			if (medicalValidation.validateNo(ch)) {
				mCode = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		double price;
		while (true) {
			System.out.println("Enter new Price to Update");
			String ch = scan.nextLine();
			if (medicalValidation.validatePrice(ch)) {
				price = Double.parseDouble(ch);
				break;
			} else {
				System.err.println("Enter Valid Price");
			}
		}
		if (dao.updateMedicine(mCode, price)) {
			System.out.println("Medicine updated Successfully");
		}
		new AdminIndex().adminIndex(userBean);
	}
}
