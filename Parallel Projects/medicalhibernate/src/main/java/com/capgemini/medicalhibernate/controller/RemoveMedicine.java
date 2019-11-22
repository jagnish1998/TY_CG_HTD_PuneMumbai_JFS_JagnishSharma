package com.capgemini.medicalhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class RemoveMedicine {

	public void removeMedicine(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		List<MedicineBean> list = dao.getMedicine();
		if (list != null) {
			for (MedicineBean medicineBean : list) {
				System.out.println(medicineBean);
			}
			System.out.println("Enter the medicine code want to Delete");
			int mCode = Integer.parseInt(scan.nextLine());
			boolean isRemoved = dao.removeMedicine(mCode);
			if(isRemoved) {
				System.out.println("Medicine Removed Sucessfully");
			}
			else {
				System.out.println("Wrong Medicine Code");
			}
			new AdminIndex().choice(bean);
		}
	}

}
