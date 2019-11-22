package com.capgemini.corejava.inheritance;

public class Bingo implements Chips
{

	@Override
	public void open() {
		System.out.println("Opening the Bingo");
	}

	@Override
	public void eat() {
		System.out.println("Eating the Kurkure");
	}

}
