package com.capgemini.exceptionhandling.first;

public class ArrayOutOFBondExample
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		int[] a = new int[4];
		try 
		{
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dont cross aRRAY bOUNDRY");
		}
		System.out.println("main ended");
	}
}
