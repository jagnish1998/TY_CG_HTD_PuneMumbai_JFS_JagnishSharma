package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class RemoveCart {
	public void removeCart(UserBean bean) {
		CartDAO cDao = MedicineFactory.getCartDAO();
		Scanner scan = new Scanner(System.in);
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
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
		boolean isRemoved = cDao.removecart(cartId);
		if (isRemoved) {
			System.out.println("Item Removed SuccessFul");
		} else {
			System.out.println("Please Enter Correct CartID");
		}
		new UserIndex().userIndex(bean);
	}
}
