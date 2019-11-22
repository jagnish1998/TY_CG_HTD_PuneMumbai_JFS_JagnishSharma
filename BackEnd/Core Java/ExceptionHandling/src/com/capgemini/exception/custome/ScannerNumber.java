package com.capgemini.exception.custome;

import java.util.Scanner;

public class ScannerNumber {
	public static void main(String[] args) 
	{
		try(Scanner scan = new Scanner(System.in))
		{
			System.out.println("Enter the no.");
			int a = scan.nextInt();
			System.out.println("Age is "+a);
		}
	}
}
