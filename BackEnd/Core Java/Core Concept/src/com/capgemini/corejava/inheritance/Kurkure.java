package com.capgemini.corejava.inheritance;

public class Kurkure implements Chips
{

	@Override
	public void open() {
		System.out.println("Opening the Kurkure");
	}

	@Override
	public void eat() {
		System.out.println("Eating the Kurkure");
	}

}
