package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.MedicineBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class ViewMedicine {
	public void getAllMedicine() {

		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		List<MedicineBean> list = null;
		try {
			list = dao.viewmedicine();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		if (list != null) {
			for (MedicineBean medicineBean : list) {
				System.out.println("Medicine Name " + medicineBean.getMedicineName());
				System.out.println("Medicine Id " + medicineBean.getMedicineCode());
				System.out.println("Medicine Price " + medicineBean.getPrice());
				System.out.println("Medicine Category " + medicineBean.getProductCategory());
				System.out.println("--------------------------------------------------------------------------");
	
			}
		} else {
			System.out.println("Somthing went Wrong");
		}
		new Logout().logout();
	}

	public void viewMedicine(UserBean bean) {
		if (bean.getUserType().equals("admin")) {
			MedicineDAO dao = MedicineFactory.getMedicineDAO();
			List<MedicineBean> list = null;
			try {
				list = dao.viewmedicine();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			if (list != null && !list.isEmpty()) {
				for (MedicineBean medicineBean : list) {
					System.out.println("Medicine Name " + medicineBean.getMedicineName());
					System.out.println("Medicine Id " + medicineBean.getMedicineCode());
					System.out.println("Medicine Price " + medicineBean.getPrice());
					System.out.println("Medicine Category " + medicineBean.getProductCategory());
					System.out.println("--------------------------------------------------------------------------");
				}
				new AdminIndex().choice(bean);
			} else {
				System.out.println("Somthing went Wrong");
			}
			new AdminIndex().choice(bean);
		} else {
			if (bean.getUserType().equals("user")) {
				MedicineDAO dao = MedicineFactory.getMedicineDAO();
				MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
				List<MedicineBean> list = null;
				try {
					list = dao.viewmedicine();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				if (list != null && !list.isEmpty()) {
					for (MedicineBean medicineBean : list) {
						System.out.println("Medicine Name " + medicineBean.getMedicineName());
						System.out.println("Medicine Id " + medicineBean.getMedicineCode());
						System.out.println("Medicine Price " + medicineBean.getPrice());
						System.out.println("Medicine Category " + medicineBean.getProductCategory());
						System.out
								.println("--------------------------------------------------------------------------");
					}
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter 1 to Add Item to cart");
					System.out.println("Enter 2 to Logout");
					int choice = 0;
					while (true) {
						String ch = scan.nextLine();
						if (medicalValidation.validateNo(ch)) {
							choice = Integer.parseInt(ch);
							break;
						} else {
							System.err.println("Enter Valid Input");
							System.out.println("Enter your choice");
						}
					}
					switch (choice) {
					case 1:
						new AddCart().addCart(bean);
						break;
					case 2:
						new Logout().logout();
						break;
					case 3:
						new UserIndex().choice(bean);
						break;
					default:
						System.out.println("Enter Valid Input");
					}
				} else {
					System.out.println("Somthing went Wrong");
				}
			}
			new UserIndex().choice(bean);
		}

	}
}
