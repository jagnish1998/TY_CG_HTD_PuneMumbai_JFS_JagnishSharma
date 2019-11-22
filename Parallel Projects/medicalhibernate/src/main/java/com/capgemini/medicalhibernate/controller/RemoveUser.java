package com.capgemini.medicalhibernate.controller;

import java.util.Scanner;

import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.factory.MedicineFactory;

public class RemoveUser {

	public void removeUser(UserBean bean) {
		Scanner scan = new Scanner(System.in);
		new ViewUser().viewUser();
		System.out.println("Enter UserId you want to delete ");
		int uId = Integer.parseInt(scan.nextLine());
		
		UserDAO dao = MedicineFactory.getMedicalDAO();
		boolean isRemoved = dao.removeUser(uId);
		if(isRemoved) {
			System.out.println("User Removed Sucessfully");
			new AdminIndex().choice(bean);
		}
		else {
			System.out.println("Somthing went Wrong");
			new AdminIndex().choice(bean);
		}

	}

}
