package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class RemoveCart {
	public void removeCart(UserBean bean) {
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
		new UserIndex().userIndex(bean);
	}
}
