package com.capgemini.exceptionhandling.first;

public class TestIRCTCPaytam 
{
	public static void main(String[] args)
	{
		System.out.println("main Started");
		Paytm p1 = new Paytm();
		p1.book();
		System.out.println("Main Ended");
	}
}
