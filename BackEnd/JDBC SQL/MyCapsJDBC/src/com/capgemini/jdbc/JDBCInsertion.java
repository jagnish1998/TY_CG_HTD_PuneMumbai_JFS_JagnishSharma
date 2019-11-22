package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertion 
{
	public static void main(String[] args) 
	{	
		Connection conn = null;
		Statement stmt = null;
		try 
		{

			//load the drivers 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			System.out.println("*********************************************************");

			// Get the connection 
			String dburl = "jdbc:mysql://localhost:3306/capgemini_dp?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
			System.out.println("Connection Established");
			System.out.println("***********************************************0***********");

			// Issue Sql Query
			String query ="insert into users_info values(2019009,'Peter Parker','p.parker@avengers.com','parkerpeter')";
			stmt = conn.createStatement();
			int  count = stmt.executeUpdate(query);

			//process the result
			if(count>0)
			{
				System.out.println("Data Inserted");
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
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

