package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDelete {
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
			String dburl ="jdbc:mysql://localhost:3306/capgemini_dp?user=root&password=root";
			conn = DriverManager.getConnection(dburl);

			//Issue Query via Connection
			String query = "delete from users_info where userid = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter user id whose data wnart to delete ");
			pstmt.setInt(1,scan.nextInt());
			int count = pstmt.executeUpdate();

			if(count>0)
			{
				System.out.println("user Deleted");
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