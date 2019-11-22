package com.capgemini.exceptionhandling.first;

public class pen 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		try 
		{
			System.out.println(10 / 2);
		} 
		catch (Exception e)
		{
			System.out.println("Dont divide with zero");
		}
		System.out.println("Main Ended");

	}
}
