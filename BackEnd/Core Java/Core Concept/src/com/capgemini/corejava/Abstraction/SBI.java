package com.capgemini.corejava.Abstraction;

public class SBI implements Atm {

	@Override
	public void validateCard() {
		System.out.println(".........Connecting to SBI DB");
		System.out.println("Validating the user card");
	}

	@Override
	public void getInfo() {
		System.out.println(".........Connecting to SBI DB");
		System.out.println("Getting the User Info");
	}

}
