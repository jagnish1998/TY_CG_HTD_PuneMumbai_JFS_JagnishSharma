package com.capgemini.medicaljdbc.controller;

import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.UserDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class RemoveUser {
	public void removeUser(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
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

		try {
			isRemoved = dao.removeUser(uId);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (isRemoved) {
			System.out.println("User Removed Sucessfully");
			new AdminIndex().choice(bean);
		} else {
			System.err.println("No User Found of userId " + uId);
			new RemoveUser().removeUser(bean);
		}
	}
}
