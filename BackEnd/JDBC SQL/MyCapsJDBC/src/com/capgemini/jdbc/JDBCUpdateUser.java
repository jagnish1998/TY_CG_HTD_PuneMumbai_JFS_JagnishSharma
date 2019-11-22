package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdateUser 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		try
		{
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			System.out.println("*********************************************************");

			//Sql Connection
			String dburl ="jdbc:mysql://localhost:3306/capgemini_dp";
			System.out.println("Enter username and password");
			String user = scan.nextLine();
			String pass = scan.nextLine();
			conn = DriverManager.getConnection(dburl,user,pass);

			//Issue Query via Connection
			String query = "update users_info set username = ? where userid = ? AND password = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the new username");
			pstmt.setString(1,scan.nextLine());
	
			System.out.println("enter user id whose data want  to update ");
			pstmt.setInt(2,Integer.parseInt(scan.nextLine()));
		
			System.out.println("Enter user password");
			pstmt.setString(3,scan.nextLine());
		
			int count = pstmt.executeUpdate();

			if(count>0)
			{
				System.out.println("user updated");
			}
			else
			{
				System.err.println("Somthing went wrong");
			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(conn !=  null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt !=  null)
			{
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			scan.close();
		}

	}
}
