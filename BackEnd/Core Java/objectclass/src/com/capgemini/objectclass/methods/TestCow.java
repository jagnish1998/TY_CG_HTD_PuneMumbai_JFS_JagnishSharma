package com.capgemini.objectclass.methods;

public class TestCow {
	public static void main(String[] args) {
		Cow c1 = new Cow(4, "hello");
		Cow c2 = new Cow(6, "bye");
		Cow c3 = new Cow(4, "hello");
		System.out.println(c1.equals(c3));
	}
}
