package com.capgemini.corejava.CFS;

public class SwitchExample 
{
	public static void main(String[] args) 
	{
		int dayNum = 4;
		switch (dayNum) 
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
		}
		switch (dayNum) 
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekdays");
			break;
		case 6:
		case 7:
			System.out.println("weekEnd");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}
}
