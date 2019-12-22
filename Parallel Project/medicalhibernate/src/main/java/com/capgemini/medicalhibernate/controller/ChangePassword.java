package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class ChangePassword {

	public void changePassword(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		UserDAO dao = MedicineFactory.getMedicalDAO();
		MedicalValidation validation = MedicineFactory.getMEdicalValidation();

		
		String pass;
		while (true) {
			System.out.println("Enter Your new Login Password");
			String ch = scan.nextLine();
			if (validation.validUserPassword(ch)) {
				pass =ch;
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}		
		bean.setUserPassword(pass);
		boolean ischanged = false;
		try {
				ischanged = dao.changePass(bean);
				new ChangePassword().changePassword(bean);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if(ischanged) {
			System.out.println("Password changes sucessfully");
		}
		else {
			System.out.println("Somthing went wrong");
		}
		if(bean.getUserType().equals("admin")) {
			new AdminIndex().choice(bean);
		}
		else {
			new UserIndex().choice(bean);
		}
	}

}
