package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class RemoveUser {

	public void removeUser(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicalValidation medicalValidation = MedicineFactory.getMEdicalValidation();
		new ViewUser().viewUser();
		int uId = 0;
		while (true) {
			System.out.println("Enter UserId you want to delete ");
			String ch = scan.nextLine();
			if (medicalValidation.validateNo(ch)) {
				uId = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
			}
		}
		UserDAO dao = MedicineFactory.getMedicalDAO();
		boolean isRemoved = false;
		try{
			isRemoved =dao.removeUser(uId);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			new RemoveUser().removeUser(bean);
		}
		if (isRemoved) {
			System.out.println("User Removed Sucessfully");
			new AdminIndex().choice(bean);
		} else {
			System.out.println("Somthing went Wrong");
			new AdminIndex().choice(bean);
		}

	}

}
