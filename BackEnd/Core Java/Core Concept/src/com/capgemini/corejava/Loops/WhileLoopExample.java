package com.capgemini.corejava.Loops;

public class WhileLoopExample 
{
	public static void main(String[] args) 
	{
		int i =5;
		/*
		 * while(true)
		 *  { 
		 *  System.out.println(i); 
		 *  i++; 
		 *  }
		 */
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("Code outside while loop");
	}
}
