package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.OrderBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.CartDAO;
import com.capgemini.medicalhibernate.dao.OrderDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class PlaceOrder {

	public void placeOrder(double price, UserBean bean) {
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		CartDAO cartDAO = MedicineFactory.getCartDAO();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Adress");
		String adress = scan.nextLine();
		System.out.println("Enter Your Cardno");
		String cardno = scan.nextLine();
		OrderBean orderBean = new OrderBean();
		if (cardno.length() == 16) {
			orderBean.setPrice(price);
			orderBean.setAdress(adress);
			orderBean.setCardNo(cardno);
			orderBean.setUid(bean.getUserId());
			if (orderDAO.placeOrder(orderBean)) {
				System.out.println("Order is getting Placed ");
				cartDAO.removeAllcart(bean.getUserId());
				System.out.println("***********************Order Placed SuccessFul******************");
			}else {
				System.out.println("Somthing Wrong");
			}
		}
		new UserIndex().choice(bean);
	}
}
