package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.CartDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;


public class Removecart {

	public void removeMedicine(UserBean bean) {
		CartDAO cDao = MedicineFactory.getCartDAO();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter CartId ");
		int cartId = Integer.parseInt(scan.nextLine());
		boolean isRemoved = cDao.removecart(cartId);
		if (isRemoved) {
			System.out.println("Item Removed SuccessFul");
		} else {
			System.out.println("Please Enter Correct CartID");
		}
		new UserIndex().choice(bean);
	}

}
