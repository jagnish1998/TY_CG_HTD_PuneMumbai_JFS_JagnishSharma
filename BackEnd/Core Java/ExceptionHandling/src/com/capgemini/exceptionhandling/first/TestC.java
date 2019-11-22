package com.capgemini.exceptionhandling.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("MAin started");
		int[] a = new int[4];
		try {
			System.out.println(a[5]);
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
