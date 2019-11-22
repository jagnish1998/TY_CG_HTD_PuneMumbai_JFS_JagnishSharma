package com.capgemini.array.concept;

public class ReceiveArray {
	public static void main(String[] args) 
	{
		int[] a = { 10, 20, 30, 40, 59 };
		recive(a);
	}

	public static void recive(int[] a) 
	{
		for (int i : a) {
			System.out.println(i);
		}
	}
}
