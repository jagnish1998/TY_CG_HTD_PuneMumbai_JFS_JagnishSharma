package com.capgemini.corejava.inheritance;

public class GrandFather {
	String name ="Torrhen";
	String lastname  = "Stark";
	public static void main(String[] args) 
	{
		GrandFather g1 = new GrandFather();
		g1.printName();
	}
	public void printName()
	{
			System.out.println(name+" "+lastname);
			
	}
}
