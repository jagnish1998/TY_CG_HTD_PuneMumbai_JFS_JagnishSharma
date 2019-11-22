package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.OrderBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.dao.OrderDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class PlaceOrder {
	public void placeOrder(UserBean userBean, double price) {
		Scanner scan = new Scanner(System.in);
		OrderDAO dao = MedicineFactory.getOrderDAO();
		CartDAO cdao = MedicineFactory.getCartDAO();
		System.out.println("Enter Your Adress");
		String add = scan.nextLine();
		System.out.println("Enter Card no.");
		String cardNo = scan.nextLine();
		if (cardNo.length() == 16) {
			OrderBean orderBean = new OrderBean();
			orderBean.setAdress(add);
			orderBean.setCardno(cardNo);
			orderBean.setPrice(price);
			orderBean.setUid(userBean.getUserId());
			if (dao.placeOrder(orderBean)) {
				System.out.println("Order Placed SuccessFully");
				cdao.removeAllCart(userBean.getUserId());
				new UserIndex().userIndex(userBean);
			} else {
				System.out.println("Unable to place Order");
				new UserIndex().userIndex(userBean);
			}
		} else {
			System.out.println("Enter Correct Card no.");
			new PlaceOrder().placeOrder(userBean, price);
		}
	}
}
