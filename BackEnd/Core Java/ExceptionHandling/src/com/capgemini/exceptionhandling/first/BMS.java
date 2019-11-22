package com.capgemini.exceptionhandling.first;

public class BMS 
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");
		PVR p1 = new PVR();
		try
		{
			p1.confirm();
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception caught at confirm of  PVR");
		}
		System.out.println("Main Ended");
	}
}
