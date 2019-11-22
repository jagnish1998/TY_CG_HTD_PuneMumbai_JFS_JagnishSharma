package com.capgemini.corejava.inheritance;

public class TestChips 
{
	public static void main(String[] args) 
	{
		Bingo b2 = new Bingo();
		Lays l1  = new Lays();
		Kurkure k1 = new Kurkure();
		
		Baby b1 = new Baby();
		
		b1.receive(b2);
	}
}
