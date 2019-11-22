package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.CartBean;
import com.capgemini.medicaljdbc.bean.OrderBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.CartDAO;
import com.capgemini.medicaljdbc.dao.OrderDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class PlaceOrder {
	public void placeOrder(double price, UserBean bean, List<CartBean> list) {
		// Place Order
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		MedicalValidation validation = MedicineFactory.getMedicalValidation();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Adress");
		String adress = scan.nextLine();
		System.out.println("Enter Your Cardno");
		String cardno = scan.nextLine();
		if(validation.validateCardNo(cardno)) {
			
		}else {
			System.out.println("Enter Valid Cardno");
			new PlaceOrder().placeOrder(price, bean, list);
		}
		OrderBean orderBean = new OrderBean();

		orderBean.setPrice(price);
		orderBean.setCardno(cardno);
		orderBean.setAdress(adress);
		orderBean.setUid(bean.getUserId());
		if (orderDAO.placeOrder(orderBean)) {
			System.out.println("Order is  Placed SuccessFull ");
			int orderId = orderDAO.getMax();

			System.out.println("Hello " + bean.getUserName() + " Your Order Placed SuccessFully ");
			System.out.println("Your Order No. is " + orderId);
			System.out.println("Your Total Bill is " + price);
			System.out.println("Thankyou Please Visit Again");
			new UserIndex().choice(bean);
		}

	}

}
