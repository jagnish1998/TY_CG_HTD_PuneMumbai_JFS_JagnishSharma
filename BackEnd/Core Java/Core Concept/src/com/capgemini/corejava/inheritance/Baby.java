package com.capgemini.corejava.inheritance;

public class Baby 
{
	Chips c1;
	void receive(Chips c1)
	{
		this.c1 =c1;
		c1.open();
		c1.eat();
	}
}
