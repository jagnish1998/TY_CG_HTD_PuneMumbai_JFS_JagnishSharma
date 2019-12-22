package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.CartBean;
import com.capgemini.medicaljdbc.bean.MedicineBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.CartDAO;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class AddCart {
	public void addCart(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation validation = MedicineFactory.getMedicalValidation();
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
		int isPresent = 0;
		List<MedicineBean> list = null;
		try {
			list = dao.viewmedicine();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		for (MedicineBean medicineBean : list) {
			if (mid == medicineBean.getMedicineCode()) {
				isPresent++;
				CartBean cart = new CartBean();
				cart.setMid(mid);
				cart.setUid(bean.getUserId());
				cart.setMedName(medicineBean.getMedicineName());
				cart.setPrice(medicineBean.getPrice());
				CartDAO cartDAO = MedicineFactory.getCartDAO();
				boolean isAdded = false;
				
				try {
					isAdded = cartDAO.addTOCart(cart);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				
				if (isAdded) {
					System.out.println("Medicine Added Sucessfully");
				} else {
					System.out.println("Unable to add medicine to cart");
				}
				break;
			}
		}
		if (isPresent == 0) {
			System.out.println("Invalid MedicineId");
			addCart(bean);
		}
		new UserIndex().choice(bean);
	}
}
