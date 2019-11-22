package com.capgemini.threads;

public class TestPVR 
{
	
	public static void main(String[] args) 
	{
		PVR p = new PVR();
		Paytm p1 = new Paytm(p);
		p1.start();
		
		Paytm p2 = new Paytm(p);
		p2.start();
		 
		
		try 
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
		
		p.leaveMe();
	}
}
