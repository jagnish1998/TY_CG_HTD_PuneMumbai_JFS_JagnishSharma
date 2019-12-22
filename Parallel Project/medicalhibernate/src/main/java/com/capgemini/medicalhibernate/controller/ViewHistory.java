package com.capgemini.medicalhibernate.controller;

import java.util.List;

import com.capgemini.medicalhibernate.bean.OrderBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.OrderDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class ViewHistory {

	public void viewHistory(UserBean bean) {
		OrderDAO orderDAO = MedicineFactory.getOrderDao();
		List<OrderBean> list = null;
		try {
			list = orderDAO.getAll(bean.getUserId());
		} catch (Exception e) {
			System.err.println(e.getMessage());
			new UserIndex().choice(bean);
		}
		if (!list.isEmpty()) {
			System.out.printf("%10s %20s %20s %20s", "Order Id", "Medicine Name", "MedicinePrice", "Address");
			for (OrderBean orderBean : list) {
				System.out.println("\n----------------------------------------------------------------------");
				System.out.printf("%10s %20s %20f %20s ", orderBean.getOrderId(), orderBean.getmedName(),
						orderBean.getPrice(), orderBean.getAdress());
				System.out.println();
			}
		} else {
			System.out.println("You have no Previous Order");
		}
		new UserIndex().choice(bean);
	}
}
