package com.capgemini.medicalcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.medicalcollection.bean.CartBean;
import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class AddToCart {
	public void addTOCart(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		CartDAO cdao = MedicineFactory.getCartDAO();
		MedicineDAO mdao = MedicineFactory.getMedicineDAO();
		Set<MedicineBean> medlist = mdao.getMedicine();
		if (medlist != null) {
			for (MedicineBean medicineBean : medlist) {
				System.out.println(medicineBean);
			}
		} else {
			System.out.println("Somthing went Wrong");
		}
		System.out.println("Enter MedId to add to cart");
		int mid = Integer.parseInt(scan.next());
		int count = 0;
		for (MedicineBean medicineBean : medlist) {
			if (medicineBean.getMedicine_code() == mid) {
				count++;
				break;
			}
		}
		
		if (count != 0) {
			CartBean cartBean = new CartBean(0, mid, userBean.getUserId());
			if (cdao.addToAdd(cartBean)) {
				System.out.println("Medicine Added SuccessFully");
				new UserIndex().userIndex(userBean);
			}else {
				System.out.println("Somthing went Wrong");
			}
		} else {
			System.out.println("Please Enter Correct Medicine");
			new UserIndex().userIndex(userBean);
		}

	}
}
