package com.capgemini.medicalhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class RemoveMedicine {

	public void removeMedicine(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicineDAO dao = MedicineFactory.getMedicineDAO();
		MedicalValidation medicalValidation = MedicineFactory.getMEdicalValidation();

		// Getting Medicine List And Check whether The Medicine Exist or Not
		
		List<MedicineBean> list = null;
		try{
			list =dao.getMedicine();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if (list != null) {
			for (MedicineBean medicineBean : list) {
				System.out.println(medicineBean);
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
			try{
				isRemoved =dao.removeMedicine(mCode);
			}catch (Exception e) {
				System.err.println(e.getMessage());
				new RemoveMedicine().removeMedicine(bean);
			}
			if (isRemoved) {
				System.out.println("Medicine Removed Sucessfully");
			} else {
				System.out.println("Wrong Medicine Code");
			}
			new AdminIndex().choice(bean);
		}
	}

}
