package com.capgemini.medicalhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class ViewMedicine {

	public void viewMedicine() {
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		List<MedicineBean> list = null;
		try {
			list = dao.getMedicine();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (list != null && !list.isEmpty()) {
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
			List<MedicineBean> list = null;
			try {
				list = dao.getMedicine();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				new UserIndex().choice(bean);
			}
			if (list != null && !list.isEmpty()) {
				for (MedicineBean medicineBean : list) {
					System.out.println(medicineBean);
				}
				new AdminIndex().choice(bean);
			} else {
				System.out.println("Somthing went Wrong");
			}
			new AdminIndex().choice(bean);
		} else {
			MedicalValidation medicalValidation = MedicineFactory.getMEdicalValidation();
			if (bean.getUserType().equals("user")) {
				MedicineDAO dao = MedicineFactory.getMedicineDAO();
				List<MedicineBean> list = null;
				try {
					list = dao.getMedicine();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				if (list != null && !list.isEmpty()) {
					for (MedicineBean medicineBean : list) {
						System.out.println(medicineBean);
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
					default:
						System.out.println("Enter Valid Input");
						new ViewMedicine().viewMedicine(bean);
					}
				} else {
					System.out.println("Somthing went Wrong");
				}
			}
			new UserIndex().choice(bean);
		}
	}
}
