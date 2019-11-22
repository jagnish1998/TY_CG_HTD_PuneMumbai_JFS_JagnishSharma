package com.caogemini.JDBCProjectPattern.controller;

import java.util.Scanner;

import com.caogemini.JDBCProjectPattern.DAO.UserDAO;
import com.caogemini.JDBCProjectPattern.bean.Bean;
import com.caogemini.JDBCProjectPattern.factory.UserFactory;
import com.caogemini.JDBCProjectPattern.validation.UserValidation;


public class InsertUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bean user = new Bean();
		UserValidation uv = UserFactory.getUserValidationInstance();
		UserDAO us = UserFactory.getDAOInstance();

		System.out.println("enter userid...");
		String userid = sc.nextLine();
		if (uv.validateUserId(userid)) {
			user.setUserid(Integer.parseInt(userid));
		} else {
			System.out.println("enter valid userid...");
			System.exit(0);
		}

		System.out.println("enter username...");
		String username = sc.nextLine();

		if (uv.validateUserName(username)) {
			user.setUsername(username);
		} else {
			System.out.println("enter valid username...");
			System.exit(0);
		}

		System.out.println("enter email...");
		String email = sc.nextLine();
		if (uv.validUserEmail(email)) {
			user.setEmail(email);
		} else {
			System.out.println("enter valid email...");
			System.exit(0);
		}

		System.out.println("enter password");
		String password = sc.nextLine();
		if (uv.validUserPassword(password)) {
			user.setPassword(password);
		} else {
			System.out.println("enter valid password...");
			System.exit(0);
		}

		boolean b = us.insertUser(user);
		if (b) 
		{
			System.out.println("User Inserted...");
		}
		else 
		{
			System.out.println("Something Went Wrong...");
		}
		sc.close();

	}
}
