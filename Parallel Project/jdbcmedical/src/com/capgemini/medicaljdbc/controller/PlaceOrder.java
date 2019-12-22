package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.capgemini.medicaljdbc.bean.CartBean;
import com.capgemini.medicaljdbc.bean.OrderBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.CartDAO;
import com.capgemini.medicaljdbc.dao.OrderDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class PlaceOrder {
	public void placeOrder(UserBean bean, List<CartBean> list) {
		// Place Order
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		MedicalValidation validation = MedicineFactory.getMedicalValidation();
		CartDAO cartDao = MedicineFactory.getCartDAO();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Adress");
		String adress = scan.nextLine();
		String cardno;
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

		int cvv;
		while (true) {
			System.out.println("Enter Your Cvv no");
			String ch = scan.nextLine();
			if (validation.validateCvvNo(ch)) {
				cardno = ch;
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}

		OrderBean orderBean = new OrderBean();
		orderBean.setAdress(adress);
		orderBean.setUid(bean.getUserId());
		for (CartBean cartBean : list) {
			orderBean.setMedName(cartBean.getMedName());
			orderBean.setPrice(cartBean.getPrice());
			boolean isPlaced = false;
			try {
				isPlaced = orderDAO.placeOrder(orderBean);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			if (isPlaced) {
				boolean isRemoved = false;
				try {
					isRemoved = cartDao.removecart(cartBean.getCartId());
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				if(isRemoved) {
					System.out.println("Order Placed SuccessFully");
				}else {
					System.out.println("Unable TO Place order");
				}
			}
		}
		new UserIndex().choice(bean);
	}
}
