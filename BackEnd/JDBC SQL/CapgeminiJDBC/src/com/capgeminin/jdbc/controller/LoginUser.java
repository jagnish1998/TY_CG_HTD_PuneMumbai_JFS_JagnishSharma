package com.capgeminin.jdbc.controller;

import java.util.Scanner;

import com.capgeminin.jdbc.Factory.UserFactory;
import com.capgeminin.jdbc.beans.Userbean;
import com.capgeminin.jdbc.dao.UserDAO;

public class LoginUser 
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		
		System.out.println("Enter the user id");
		
		int userid = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the password");
		
		String password = scan.nextLine();
		
		Userbean user = dao.login(userid, password);
		if (user != null) 
		{
			System.out.println(user);
		} else
		{
			System.out.println("Somthing wents Wrong");
		}

	}
}
