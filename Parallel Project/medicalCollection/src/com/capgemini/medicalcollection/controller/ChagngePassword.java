package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.UserDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class ChagngePassword {
	public void changePassword(UserBean userBean) {
		UserDAO dao = MedicineFactory.getUserDAO();
		System.out.println("Enter Your New password");
		Scanner scan = new Scanner(System.in);
		MedicalValidation validation = MedicineFactory.getMedicalValidation();

		String pass;
		while (true) {
			System.out.println("Enter Your new Login Password");
			String ch = scan.nextLine();
			if (validation.validUserPassword(ch)) {
				pass = ch;
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		if (dao.changePassword(userBean, pass)) {
			System.out.println("Password Changes Successfully");
			if (userBean.getUserType().equals("admin")) {
				new AdminIndex().adminIndex(userBean);
			} else {
				new UserIndex().userIndex(userBean);
			}
		} else {
			System.out.println("Unable To change password");
			new AdminIndex().adminIndex(userBean);
		}
	}
}
