package com.capgemini.medicalcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.medicalcollection.bean.CartBean;
import com.capgemini.medicalcollection.bean.OrderBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.dao.OrderDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class PlaceOrder {
	public void placeOrder(UserBean userBean, Set<CartBean> cartList) {
		Scanner scan = new Scanner(System.in);
		OrderDAO odao = MedicineFactory.getOrderDAO();
		CartDAO cdao = MedicineFactory.getCartDAO();
		MedicalValidation validation = MedicineFactory.getMedicalValidation();
		System.out.println("Enter Your Adress");
		String add = scan.nextLine();

		String cardno;
		while (true) {
			System.out.println("Enter Your Cardno");
			cardno = scan.nextLine();
			if (validation.validateCardNo(cardno)) {
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}

		String cvv;
		while (true) {
			System.out.println("Enter Your Cvv no");
			cvv = scan.nextLine();
			if (validation.validateCvvNo(cvv)) {
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}

		for (CartBean cartBean : cartList) {
			OrderBean orderBean = new OrderBean();
			orderBean.setAdress(add);
			orderBean.setUid(userBean.getUserId());
			orderBean.setmedName(cartBean.getMedName());
			System.out.println(cartBean.getMedName());
			orderBean.setPrice(cartBean.getPrice());
			if (odao.placeOrder(orderBean)) {
				cdao.removecart(cartBean.getCartId());
			}
		}
		System.out.println("Order Placed SuccessFully");
		new UserIndex().userIndex(userBean);
	}
}