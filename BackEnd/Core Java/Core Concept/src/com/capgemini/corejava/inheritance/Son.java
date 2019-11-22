package com.capgemini.corejava.inheritance;

public class Son extends Father implements InterFaceExample {
	String sname = "Robb";

	public static void main(String[] args) {
		Son son = new Son();
		son.printName();
	}

	@Override
	public void printName() {
		System.out.println(sname + " " + fname + " " + lastname);
		super.printName();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method in Son");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show  method in Son");
	}
}
