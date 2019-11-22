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

		System.out.println("Enter Your new Login Password");
		String pass = scan.nextLine();
		;
		if (validation.validUserPassword(pass)) {

		} else {
			System.out.println("Enter Valid Password");
			new ChangePassword().changePassword(bean);
		}
		bean.setUserPassword(pass);
		boolean ischanged = dao.changePass(bean);
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
