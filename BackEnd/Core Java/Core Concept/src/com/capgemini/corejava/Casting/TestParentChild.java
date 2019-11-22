package com.capgemini.corejava.Casting;

public class TestParentChild 
{
	public static void main(String[] args) 
	{
		Parent p = new child();//upcasting
		
		child c =(child)p;		//downcasting
		System.out.println(c.cost);
		c.write();
		System.out.println(c.size);
		c.colour();
	}
}
