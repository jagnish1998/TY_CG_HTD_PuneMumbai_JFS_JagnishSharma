package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.UserDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class RemoveUser {
	public void removeUser(UserBean userBean) {
		Scanner scan = new Scanner(System.in);
		MedicalValidation medicalValidation = MedicineFactory.getMedicalValidation();
	
		new Viewuser().viewUser();
		int uId;
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
		UserDAO dao = MedicineFactory.getUserDAO();
		boolean isDeleted = dao.removeUser(uId);
		if(isDeleted) {
			System.out.println("User Deleted SuccessFully");
			new AdminIndex().adminIndex(userBean);
		}else {
			System.out.println("Enter Valid UserId");
		}
	}
}
