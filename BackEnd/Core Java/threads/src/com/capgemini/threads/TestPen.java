package com.capgemini.threads;

public class TestPen
{
	public static void main(String[] args) 
	{
		System.out.println("main Started");
		Pen p1 = new Pen();
		p1.start();
		try
		{
			p1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Pen p2 = new Pen();
		p2.start();
		try
		{
			p2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}
