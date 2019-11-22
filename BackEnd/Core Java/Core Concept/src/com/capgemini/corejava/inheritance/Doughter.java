package com.capgemini.corejava.inheritance;

public class Doughter extends Father implements InterFaceExample {
	String dname = "Sansa";

	public static void main(String[] args) {
		Doughter d1 = new Doughter();
		d1.printName();
		System.out.println(d1.a);
	}

	@Override
	public void printName() {
		System.out.println(dname + " " + fname + " " + lastname);
		super.printName();
	}

	@Override
	public void display() {

		System.out.println("Display method in doughter");
	}

	@Override
	public void show() {
		System.out.println("Show  method in doughter");
	}
}
