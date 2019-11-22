package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class ChangePassword {

	public void changePassword(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		UserDAO dao = MedicineFactory.getMedicalDAO();
		
		System.out.println("Enter Your new Login Password");
		String pass = scan.nextLine();
		bean.setUserPassword(pass);
		boolean ischanged = dao.changePass(bean);
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
