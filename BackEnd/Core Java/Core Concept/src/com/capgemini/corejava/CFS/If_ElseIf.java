package com.capgemini.corejava.CFS;

public class If_ElseIf 
{
	public static void main(String[] args) 
	{
		int marks =45;
		if(marks>=75)
		{
			System.out.println("Grade A++");
		}
		else if(marks < 75 && marks>50)
		{
			System.out.println("Grade A");
		}
		else if(marks <=50 && marks>=25)
		{
			System.out.println("Grade b");
		}
		else if(marks <25 && marks >=10)
		{
			System.out.println("Grade c");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
