package com.capgemini.corejava.inheritance;

public class Lays implements Chips 
{

	@Override
	public void open() 
	{
		System.out.println("Opening the Lays");
	}

	@Override
	public void eat() 
	{
		System.out.println("Eating the Lays");
	}
	
}
