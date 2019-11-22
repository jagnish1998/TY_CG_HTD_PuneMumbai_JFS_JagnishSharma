package com.capgemini.objectclass.methods;

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product(4, "Register", "NoteBook", 100.0, "Classmate");
		Product p2 = new Product(4, "Book", "NoteBook", 90, "Java");
		Product p3 = new Product(4, "Register", "NoteBook", 100.0, "Sathi");
		Product p4 = new Product(4, "Register", "NoteBook", 100.0, "Classmate");
		System.out.println(p1.equals(p4));
	}
}
