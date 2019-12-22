package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.CartDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class Removecart {

	public void removeMedicine(UserBean bean) {
		CartDAO cDao = MedicineFactory.getCartDAO();
		MedicalValidation medicalValidation = MedicineFactory.getMEdicalValidation();
		Scanner scan = new Scanner(System.in);
		int cartId = 0;
		while (true) {
			System.out.println("Enter Cart Id");
			String ch = scan.nextLine();
			if (medicalValidation.validateNo(ch)) {
				cartId = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		boolean isRemoved = false;
		try {
		isRemoved = cDao.removecart(cartId);
		new Removecart().removeMedicine(bean);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if (isRemoved) {
			System.out.println("Item Removed SuccessFul");
		} else {
			System.out.println("Please Enter Correct CartID");
		}
		new UserIndex().choice(bean);
	}

}
