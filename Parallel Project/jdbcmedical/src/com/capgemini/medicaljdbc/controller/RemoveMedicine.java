package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.MedicineBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class RemoveMedicine {

	public void removeMedicine(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
		List<MedicineBean> list = null;
		try {
			list = dao.viewmedicine();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (list != null) {
			for (MedicineBean medicineBean : list) {
				System.out.println("Medicine Name is"+medicineBean.getMedicineName());
				System.out.println("Medicine Id is"+medicineBean.getMedicineCode());
				System.out.println("Medicine Price is"+medicineBean.getPrice());
				System.out.println("Medicine Category is"+medicineBean.getProductCategory());
			}
			
			int mCode = 0;
			while (true) {
				System.out.println("Enter the medicine code want to Delete");
				String ch = scan.nextLine();
				if (medicalValidation.validateNo(ch)) {
					mCode = Integer.parseInt(ch);
					break;
				} else {
					System.err.println("Enter Valid Input");
				}
			}
			boolean isRemoved = false;
			try {
				isRemoved = dao.removeMedicine(mCode);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			if (isRemoved) {
				System.out.println("Medicine Removed Sucessfully");
			} else {
				System.out.println("Wrong Medicine Code");
			}
			new AdminIndex().choice(bean);
		} else {
			System.out.println("No Medicine Present TO Remove");
			new AdminIndex().choice(bean);
		}
	}
}
