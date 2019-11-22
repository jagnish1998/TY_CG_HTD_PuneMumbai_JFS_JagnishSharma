package com.capgemini.array.concept;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String s = scan.nextLine();
		System.out.println("Enter the age");
		int i = scan.nextInt();
		scan.close();
		System.out.println("Age is " + i);
		System.out.println("Name is " + s);
	}
}
