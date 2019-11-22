package com.capgemini.objectclass.methods;

public class TestA {
	public static void main(String[] args) {

		Pen p = new Pen();
		System.out.println("Adress is " +p.hashCode());
		
		System.out.println(p.toString());
		System.out.println(p);
	}
}
