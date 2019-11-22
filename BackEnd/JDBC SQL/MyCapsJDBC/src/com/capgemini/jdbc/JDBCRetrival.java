package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCRetrival {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt  = null;
		Scanner scan = new Scanner(System.in);
		ResultSet rs = null;
		try {	
			
			// Load the class
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			System.out.println("******************************************************************");
			
			// Get the DB Connection
			String dburl = "jdbc:mysql://localhost:3306/capgemini_dp?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
			System.out.println("Connection Established");
			System.out.println("******************************************************************");
			
			//Issue the sql query
			String query ="select * from users_info where userid  = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the User ID..");
			pstmt.setInt(1,scan.nextInt());
			rs = pstmt.executeQuery(); 
			
			// Process Results
			if(rs.next())
			{
				System.out.println("User ID: "+rs.getInt(1));
				System.out.println("UserName :"+rs.getString(2));
				System.out.println("user Email:"+ rs.getString(3));
				System.out.println("User Password"+rs.getString(4));
			}
			else
			{
				System.out.println("Somthing went wronga");
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
