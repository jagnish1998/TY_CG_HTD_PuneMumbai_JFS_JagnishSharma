package com.caogemini.JDBCProjectPattern.controller;

import java.util.Scanner;

import com.caogemini.JDBCProjectPattern.DAO.UserDAO;
import com.caogemini.JDBCProjectPattern.factory.UserFactory;
import com.caogemini.JDBCProjectPattern.validation.UserValidation;

public class DeleteUser
{
	public static void main(String[] args) 
	{Scanner scan = new Scanner(System.in);
		UserDAO ud = UserFactory.getDAOInstance();
		UserValidation uv = UserFactory.getUserValidationInstance();
		System.out.println("Enter the UserID");
		String userid = scan.nextLine();
		Boolean b = uv.validateUserId(userid);
		if(b)
		{
			System.out.println("Enter the password");
			String password = scan.nextLine();
			Boolean v =uv.validUserPassword(password);
			if(v)
			{
				if(ud.deleteUser(Integer.parseInt(userid), password))
				{
					System.out.println("User Deleted");
				}
				else
				{
					System.out.println("Somthing went wrong");
				}
			}
			else
			{
				System.out.println("Enter the valid passord");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Enter the valid user");
			System.exit(0);
		}
		
	}
}
