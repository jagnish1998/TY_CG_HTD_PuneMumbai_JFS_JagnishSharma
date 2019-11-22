package com.capgemini.exceptionhandling.first;

public class TestB 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("main Started");
			System.out.println(4 / 0);
			System.out.println("hello");
			System.out.println("bye");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Dont divide with zero");
		}
		System.out.println("main Ended");
	}
}
