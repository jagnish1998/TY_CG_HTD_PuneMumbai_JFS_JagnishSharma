package com.capgeminin.jdbc.controller;

import java.util.Scanner;

import com.capgeminin.jdbc.Factory.UserFactory;
import com.capgeminin.jdbc.beans.Userbean;
import com.capgeminin.jdbc.dao.UserDAO;

public class GetInfo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserDAO dao = UserFactory.getInstance();
		System.out.println("Enter the user id");
		Userbean user = dao.getInfo(scan.nextInt());
		if (user != null) 
		{
			System.out.println(user);
		}
		else {
			System.out.println("Something went Wrong");
		}

	}
}
