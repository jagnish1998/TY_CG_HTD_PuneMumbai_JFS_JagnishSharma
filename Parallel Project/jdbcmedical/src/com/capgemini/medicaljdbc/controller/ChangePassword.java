package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.UserDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class ChangePassword {
	public void changePassword(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		UserDAO dao = MedicineFactory.getMedicalDAO();
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
		
		bean.setUserPassword(pass);
		boolean ischanged = false;
		
		try {
			ischanged = dao.changePass(bean);
		} catch (Exception e) {
			System.err.println("Unable To Change Password");
		}
		
		if (ischanged) {
			System.out.println("Password changes sucessfully");
		} else {
			System.out.println("Somthing went wrong");
		}
		if (bean.getUserType().equals("admin")) {
			new AdminIndex().choice(bean);
		} else {
			new UserIndex().choice(bean);
		}
	}
}
