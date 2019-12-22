package com.capgemini.medicalcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class RemoveMedicine {
	public void removeMedicine(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		Set<MedicineBean> medlist = dao.getMedicine();
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();

		if (medlist != null) {
			for (MedicineBean medicineBean : medlist) {
				System.out.println(medicineBean);
			}
		}
		int mCode;
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
		boolean isRemoved = dao.removeMedicine(mCode);
		if (isRemoved) {
			System.out.println("Medicine Removed Sucessfully");
		} else {
			System.out.println("Wrong Medicine Code");
		}
		new AdminIndex().adminIndex(userBean);
	}
}
