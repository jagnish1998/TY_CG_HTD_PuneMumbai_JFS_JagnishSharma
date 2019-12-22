package com.capgemini.medicalhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.CartBean;
import com.capgemini.medicalhibernate.bean.OrderBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.CartDAO;
import com.capgemini.medicalhibernate.dao.OrderDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class PlaceOrder {

	public void placeOrder(double price, UserBean bean, List<CartBean> cartist) {
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		CartDAO cartDAO = MedicineFactory.getCartDAO();
		MedicalValidation validation = MedicineFactory.getMEdicalValidation();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Adress");
		String adress = scan.nextLine();
		
		String cardno ;
		while (true) {
			System.out.println("Enter Your Cardno");
			String ch = scan.nextLine();
			if (validation.validateCardNo(ch)) {
				cardno = ch;
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

		OrderBean orderBean = new OrderBean();

		orderBean.setAdress(adress);
		orderBean.setUid(bean.getUserId());
		System.out.println("Order is Getting Placed");
		for (CartBean cartBean : cartist) {
			orderBean.setmedName(cartBean.getMedName());
			orderBean.setPrice(cartBean.getPrice());
			boolean isAdded = false;
			try {
				isAdded = orderDAO.placeOrder(orderBean);
			}catch (Exception e) {
				System.err.println(e.getMessage());
				new PlaceOrder().placeOrder(price, bean, cartist);
			}
			if (isAdded) {
				try {
				cartDAO.removecart(cartBean.getCartId());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Order Placed SuccessFully");
	}
}
