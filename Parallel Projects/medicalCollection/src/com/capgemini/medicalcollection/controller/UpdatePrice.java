package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class UpdatePrice {
	public void updatePrice(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		System.out.println("Enter MedId Want To Update");
		int mCode = Integer.parseInt(scan.nextLine());
		System.out.println("Enter new Price to Update");
		double price = scan.nextDouble();
		if(dao.updateMedicine(mCode, price)) {
			System.out.println("Medicine updated Successfully");
		}
		new AdminIndex().adminIndex(userBean);
	}
}
