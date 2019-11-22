package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCRetrivalAll {
	public static void main(String[] args) {
		Connection conn = null;
		FileReader reader = null;
		Properties prop = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//Load the driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		
		try 
		{
			reader = new FileReader("C:\\Users\\Jgnissh pc\\Desktop\\db.properties");
			prop = new Properties();
			prop.load(reader);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try 
		{
			
			// Get the Connection
			String dburl = prop.getProperty("dburl");
			conn = DriverManager.getConnection(dburl, prop.getProperty("user"),prop.getProperty("password"));
			System.out.println("******************************* Connection Establish **************");
			
			
			//Issue Query
			String query = "Select * from users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("******************************* Query Issued **************");
			
			//Process Result
			
			while(rs.next())
			{
				System.out.println("ID is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Email is "+rs.getString(3));
				System.out.println("Password is "+rs.getString(4));
				System.out.println("---------------------------------------------------------------");
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
			if(stmt !=  null)
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
				try {
					rs.close();
				} catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
}
