package com.capgemini.exceptionhandling.first;

import java.io.IOException;
import java.sql.SQLException;

public class TestGMain 
{
	public static void main(String[] args) 
	{
		TestG t1 = new TestG();
		try 
		{
			t1.bottle();
		}
		catch 
		(ClassNotFoundException | IOException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
