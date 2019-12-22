package com.capgemini.medicalcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.medicalcollection.bean.CartBean;
import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class AddToCart {
	public void addTOCart(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		CartDAO cdao = MedicineFactory.getCartDAO();
		MedicineDAO mdao = MedicineFactory.getMedicineDAO();
		MedicalValidation validation = MedicineFactory.getMedicalValidation();

		Set<MedicineBean> medlist = mdao.getMedicine();
		if (medlist != null && !medlist.isEmpty()) {
			for (MedicineBean medicineBean : medlist) {
				System.out.println(medicineBean);
			}
		} else {
			System.out.println("Somthing went Wrong");
		}

		int mid = 0;
		while (true) {
			System.out.println("Enter Medicine Id to Add to cart");
			String ch = scan.nextLine();
			if (validation.validateNo(ch)) {
				mid = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		int count = 0;
		double price = 0;
		String medname = null;
		for (MedicineBean medicineBean : medlist) {
			if (medicineBean.getmedicineCode() == mid) {
				price = medicineBean.getPrice();
				medname = medicineBean.getmedicineName();
				count++;
				break;
			}
		}

		if (count != 0) {
			CartBean cartBean = new CartBean(0, mid, userBean.getUserId(), medname, price);
			if (cdao.addToAdd(cartBean)) {
				System.out.println("Medicine Added SuccessFully");
				new UserIndex().userIndex(userBean);
			} 
		} else {
			System.out.println("Please Enter Correct Medicine");
			new UserIndex().userIndex(userBean);
		}
	}
}
