package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class AddMedicine {

	public void addMedicine(UserBean userBean) {

		MedicineBean medBean = new MedicineBean();
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Medicine Name");
		String medicine_name = sc.nextLine();
		System.out.println("Enter Medicine Price ");
		double price = Double.parseDouble(sc.nextLine());
		System.out.println("Enter product_catgegory ");
		String product_category = sc.nextLine();
		medBean.setMedicine_name(medicine_name);
		medBean.setPrice(price);
		medBean.setProduct_category(product_category);
		boolean added  = dao.addMedicine(medBean);
		if (added) {
			System.out.println("Medicine Added  Successfully");
		} else {
			System.out.println("Somthing wents Wrong");
		}
		new AdminIndex().choice(userBean);
	}
}
