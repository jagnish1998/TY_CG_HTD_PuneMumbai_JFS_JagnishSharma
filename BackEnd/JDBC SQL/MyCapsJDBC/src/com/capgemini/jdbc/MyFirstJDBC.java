package com.capgemini.jdbc;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MyFirstJDBC 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try 
		{ //Load the drivers
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded");
			System.out.println("******************************************************");

			// Get DB Connection via Driver
			String dburl = "jdbc:mysql://localhost:3306/capgemini_dp?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
			System.out.println("Connection established");
			System.out.println("**********************************************************");

			// Issue sql Query via connection
			String query ="Select * from users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// Process the result returned by sql
			while(rs.next())
			{
				System.out.println("User ID "+rs.getInt(1));
				System.out.println("User Name "+rs.getString("username"));
				System.out.println("Email " +rs.getString(3));
				System.out.println("Password " +rs.getString("password"));
				System.out.println("***********************************************************");

			}

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		// close the DB Objects
		finally 
		{
			if(conn != null)
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
			if(stmt != null)
			{
				try
				{
					stmt.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(rs != null)
			{
				try
				{
					rs.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
