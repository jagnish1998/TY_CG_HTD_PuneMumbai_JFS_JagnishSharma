package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.OrderBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.OrderDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;

public class ViewHistory {
	public void viewHistory(UserBean bean) {
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		List<OrderBean> list = orderDAO.getAll(bean.getUserId());
		if (!list.isEmpty()) {
			for (OrderBean orderBean : list) {
				System.out.println("Your Order No. is "+orderBean.getOrderId());
				System.out.println("Your total Bill is "+orderBean.getPrice());
				System.out.println("Your card No."+orderBean.getCardno());
				System.out.println("Your Address is "+orderBean.getAdress());
				System.out.println("----------------------------------------------------------------------");
			}
		} else {
			System.out.println("You have no Previous Order");
		}
		new UserIndex().choice(bean);
	}
}
