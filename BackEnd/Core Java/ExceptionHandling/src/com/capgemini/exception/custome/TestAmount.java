package com.capgemini.exception.custome;

public class TestAmount {
	public static void main(String[] args) throws InvalidLimitException {
		Amount a1 = new Amount();
		a1.check(50000);
		System.out.println("End");
	}
}
