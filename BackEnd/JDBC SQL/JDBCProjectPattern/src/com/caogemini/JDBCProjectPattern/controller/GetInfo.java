package com.caogemini.JDBCProjectPattern.controller;


import java.util.Scanner;

import com.caogemini.JDBCProjectPattern.DAO.UserDAO;
import com.caogemini.JDBCProjectPattern.bean.Bean;
import com.caogemini.JDBCProjectPattern.factory.UserFactory;
import com.caogemini.JDBCProjectPattern.validation.UserValidation;

public class GetInfo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserDAO uDao = UserFactory.getDAOInstance();
		UserValidation uValidation = UserFactory.getUserValidationInstance();
		System.out.println("Enter the user id ");
		String userid = scan.nextLine();
		boolean b = uValidation.validateUserId(userid);
		if (b) {
			Bean user = uDao.getInfo(Integer.parseInt(userid));
			if (user != null) {
				System.out.println(user);
			} else {
				System.out.println("Something Went Wrong....");
			}
		} else {
			System.out.println("Enter Valid Id....");
		}
		scan.close();
	}
}
