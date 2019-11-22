package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolveJDBCRetrival 
{
	public static void main(String[] args)
	{
		FileReader fr = null;
		Properties prop = null;
		try {
			
			fr = new  FileReader("db.properties");
			prop = new Properties();
			prop.load(fr);

			// load the driver 
			Class.forName(prop.getProperty("DriverClass"));
			System.out.println("DriverLoaded");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dburl"),prop.getProperty("user"),prop.getProperty("password"));
				Statement  stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query")))
		{
			while(rs.next())
			{
				System.out.println("ID is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Email is "+rs.getString(3));
				System.out.println("---------------------------------------------------------------");
			}	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
