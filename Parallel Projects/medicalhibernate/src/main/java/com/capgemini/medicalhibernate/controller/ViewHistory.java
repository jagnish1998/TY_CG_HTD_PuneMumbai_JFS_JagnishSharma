package com.capgemini.medicalhibernate.controller;

import java.util.List;

import com.capgemini.medicalhibernate.bean.OrderBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.OrderDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class ViewHistory {

	public void viewHistory(UserBean bean) {
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		List<OrderBean> list = orderDAO.getAll(bean.getUserId());
		if (!list.isEmpty()) {
			for (OrderBean orderBean : list) {
				System.out.println("Your Order No. is " + orderBean.getOrderId());
				System.out.println("Your Bill No. is " + orderBean.getPrice());
				System.out.println("Your Id . is " + orderBean.getUid());
				System.out.println("Your Adress. is " + orderBean.getAdress());
				System.out.println("-------------------------------------------------------");
			}
		} else {
			System.out.println("You have No Previous Order");
		}
		new UserIndex().choice(bean);
	}
}
