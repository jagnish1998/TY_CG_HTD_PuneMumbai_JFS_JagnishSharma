package com.capgemini.medicalcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;

public class RemoveMedicine {
	public void removeMedicine(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		Set<MedicineBean> medlist = dao.getMedicine();
		if (medlist != null) {
			for (MedicineBean medicineBean : medlist) {
				System.out.println(medicineBean);
			}
		}
		System.out.println("Enter the medicine code want to Delete");
		int mCode = Integer.parseInt(scan.nextLine());
		boolean isRemoved = dao.removeMedicine(mCode);
		if (isRemoved) {
			System.out.println("Medicine Removed Sucessfully");
		} else {
			System.out.println("Wrong Medicine Code");
		}
		new AdminIndex().adminIndex(userBean);
	}
}
