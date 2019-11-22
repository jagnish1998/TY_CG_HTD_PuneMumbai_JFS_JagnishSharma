package com.capgemini.exceptionhandling.first;

public class IRCTC {
	void confirm()
	{
		System.out.println("Confirm Started");
		try 
		{
			System.out.println(10/0);
		}
		catch (Exception e) 
		{
			System.out.println("Exception occur at Book()");
		}
		System.out.println(("Confirm Ended"));
	}
	
}
