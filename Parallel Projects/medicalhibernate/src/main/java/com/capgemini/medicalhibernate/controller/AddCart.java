package com.capgemini.medicalhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.CartBean;
import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.CartDAO;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class AddCart {

	public void addCart(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		System.out.println("Enter Medicine Id to Add to cart");
		int mid = Integer.parseInt(scan.nextLine());
		int isPresent = 0;
		List<MedicineBean> list = dao.getMedicine();
		for (MedicineBean medicineBean : list) {
			if (mid == medicineBean.getMedicine_code()) {
				isPresent++;
				CartBean cart = new CartBean();
				cart.setMid(mid);
				cart.setUid(bean.getUserId());
				cart.setMedName(medicineBean.getMedicine_name());
				cart.setPrice(medicineBean.getPrice());
				CartDAO cartDAO = MedicineFactory.getCartDAO();
				if (cartDAO.addTOCart(cart)) {
					System.out.println("Medicine Added Sucessfully");
				} else {
					System.out.println("Unable to add medicine");
				}
				break;
			}
		}
		if (isPresent == 0) {
			System.out.println("Invalid Medicine Id ");
		}
		new UserIndex().choice(bean);
	}
}
