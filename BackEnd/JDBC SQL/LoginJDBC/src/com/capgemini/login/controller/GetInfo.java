package com.capgemini.login.controller;

import java.util.Scanner;

import com.capgemini.login.bean.UserBean;
import com.capgemini.login.dao.UserDAO;
import com.capgemini.login.factory.UserFactory;


public class GetInfo 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the user id");
		int userid = scan.nextInt();
		System.out.println("Enter the password");
		String password = scan.nextLine();
		UserBean user = dao.getInfo(userid,password);
		
		if (user != null) 
		{
			System.out.println(user);
		}
		else {
			System.out.println("Somthing wents Wrong");
		}
	}
}
