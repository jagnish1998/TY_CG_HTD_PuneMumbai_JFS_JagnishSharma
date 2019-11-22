package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertionUser
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner scan  =  new Scanner(System.in);
		try 
		{   // load the driver 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			//get the DB connection
			String dburl =  "jdbc:mysql://localhost:3306/capgemini_dp?user=root&password=root";
			conn =	DriverManager.getConnection(dburl);
			System.out.println("Connection established");

			//Issue SQL Query
			String query = "insert into users_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter user ID");
			pstmt.setInt(1,Integer.parseInt(scan.nextLine()));
			System.out.println("Enter user Name");
			pstmt.setString(2,scan.nextLine());
			System.out.println("Enter USer Email");
			pstmt.setString(3,scan.nextLine());
			System.out.println("Enter user Password");
			pstmt.setString(4,scan.nextLine());

			int count = pstmt.executeUpdate();

			//Process Query

			if(count>0)
			{
				System.out.println("Data Inserted");
			}
			else
			{
				System.out.println("Somthing get Wrong");
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
				try
				{
					conn.close();
				}
				catch (SQLException e) 
				{
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
