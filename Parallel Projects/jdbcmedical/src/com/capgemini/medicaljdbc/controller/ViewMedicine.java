package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.MedicineBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;

public class ViewMedicine {
	public void viewMedicine() {
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		List<MedicineBean> list = dao.viewmedicine();
		if (list != null) {
			for (MedicineBean medicineBean : list) {
				System.out.println(medicineBean);
			}
		} else {
			System.out.println("Somthing went Wrong");
		}
		new Logout().logout();
	}

	public void viewMedicine(UserBean bean) {
		if (bean.getUserType().equals("admin")) {
			MedicineDAO dao = MedicineFactory.getMedicineDAO();
			List<MedicineBean> list = dao.viewmedicine();
			if (list != null && !list.isEmpty()) {
				for (MedicineBean medicineBean : list) {
					System.out.println("Medicine Name " + medicineBean.getMedicine_name());
					System.out.println("Medicine Id " + medicineBean.getMedicine_code());
					System.out.println("Medicine Price " + medicineBean.getPrice());
					System.out.println("Medicine Category " + medicineBean.getProduct_category());
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
				List<MedicineBean> list = dao.viewmedicine();
				if (list != null && !list.isEmpty()) {
					for (MedicineBean medicineBean : list) {
						System.out.println("Medicine Name " + medicineBean.getMedicine_name());
						System.out.println("Medicine Id " + medicineBean.getMedicine_code());
						System.out.println("Medicine Price " + medicineBean.getPrice());
						System.out.println("Medicine Category " + medicineBean.getProduct_category());
						System.out
								.println("--------------------------------------------------------------------------");
					}
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter 1 to Add Item to cart");
					System.out.println("Enter 2 to Logout");
					int choice = 0;
					try {
						choice = Integer.parseInt(scan.nextLine());
					} catch (Exception e) {
						System.out.println("Enter Valid Input");
						new ViewMedicine().viewMedicine(bean);
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
