package com.capgemini.corejava.Abstraction;

public class TestATM 
{
	public static void main(String[] args) 
	{
		Machine m1 = new Machine();
		
		HDFC h1  = new HDFC();
		ICICI i1=  new ICICI();
		SBI s1 = new SBI();
		
		m1.sloat(i1);
	}
}
