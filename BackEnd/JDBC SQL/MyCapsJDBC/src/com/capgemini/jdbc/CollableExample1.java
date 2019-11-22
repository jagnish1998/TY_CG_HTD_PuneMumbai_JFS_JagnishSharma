package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CollableExample1 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try 
		{
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Deiver Loaded ");
			System.out.println("**********************************************************");

			// get connection
			
			String dburl = "jdbc:mysql://localhost:3306/capgemini_dp";
			System.out.println("Enter the user name and password");
			String user  = scan.nextLine();
			String pass = scan.nextLine();
			conn = DriverManager.getConnection(dburl,user,pass);
			System.out.println("Connectionm established");
			System.out.println("************************************************************");

			//Issue Sql Query
			String query = "call getAllInfo()";
			cstmt  = conn.prepareCall(query);
			boolean b = cstmt.execute();

			if(b)
			{
				rs = cstmt.getResultSet();
				while(rs.next())
				{
					System.out.println("user ID   is "+rs.getInt(1));
					System.out.println("user Name  is "+rs.getString(2));
					System.out.println("user Email is "+rs.getString(3));
					System.out.println("user Password is "+rs.getString(4));
					System.out.println("******************************************************");
				}
			}
			else
			{
				int count = cstmt.getUpdateCount();
				if(count>0)
				{
					System.out.println("Operation Sucessful");
				}
				else
				{
					System.err.println("operation Failed");
				}
			}
		}		catch (Exception e) 
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
			if(cstmt !=  null)
			{
				try 
				{
					cstmt.close();
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
			scan.close();
		}

	}
}
