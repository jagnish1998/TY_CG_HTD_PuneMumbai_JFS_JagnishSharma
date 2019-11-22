package com.capgemini.exceptionhandling.first;

public class Paytm {
	void book() {
		System.out.println("Book Started");
		IRCTC i1 = new IRCTC();
		i1.confirm();
		System.out.println("Book Ended");
	}
}
