package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;


public class AddMedicine {
public void addMedicine(UserBean bean1) {
		
		MedicineBean bean = new MedicineBean();
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Medicine Name");
		String medicine_name = sc.nextLine();
		System.out.println("Enter Medicine Price ");
		double price = Double.parseDouble(sc.nextLine());
		System.out.println("Enter product_catgegory ");
		String product_category = sc.nextLine();
		bean.setMedicine_name(medicine_name);
		bean.setPrice(price);
		bean.setProduct_category(product_category);
		boolean isAdded  = dao.addMedicine(bean);
		if (isAdded) {
			System.out.println("Medicine is registerd Successfully");
		} 
		new AdminIndex().adminIndex(bean1);
	}
}
