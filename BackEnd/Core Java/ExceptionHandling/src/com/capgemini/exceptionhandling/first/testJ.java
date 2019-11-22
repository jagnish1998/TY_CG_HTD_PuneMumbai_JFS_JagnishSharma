package com.capgemini.exceptionhandling.first;

public class testJ 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		String k = null;
		int[] a = new int[3];
		try 
		{
			System.out.println(10 / 0);		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException |NullPointerException  e) {
			e.printStackTrace();
		}
		System.out.println("Main Ended");
	}
}
