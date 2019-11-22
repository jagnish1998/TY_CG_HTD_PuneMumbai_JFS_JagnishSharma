package com.capgemini.exceptionhandling.first;

public class PVR 
{
	void confirm()
	{
		System.out.println("Confirm Started");
		try  
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception caught at confirm of  PVR");
			throw e; 
		}
		finally
		{
			System.out.println("Confirm Ended");
		}
	}
}
