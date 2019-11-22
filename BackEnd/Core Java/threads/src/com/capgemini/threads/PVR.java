package com.capgemini.threads;

public class PVR 
{
	synchronized public void confirm()
	{
		for (int i = 0; i <= 5; i++)
		{
			System.out.println(i);
			if(i==0)
			{
				try 
				{
					wait();
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	synchronized void leaveMe()
	{
		notify();
	}
}
