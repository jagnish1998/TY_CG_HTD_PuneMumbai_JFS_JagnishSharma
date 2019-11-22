package com.capgemini.threads;

public class Paytm extends Thread 
{
	PVR p ;

	public Paytm(PVR p)
	{
		this.p = p;
	}

	@Override
	public void run()
	{
		p.confirm();
	}

}
