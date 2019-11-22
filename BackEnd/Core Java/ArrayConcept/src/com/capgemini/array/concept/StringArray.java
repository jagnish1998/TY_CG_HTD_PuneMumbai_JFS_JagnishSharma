package com.capgemini.array.concept;

public class StringArray {
	public static void main(String[] args) {
		String[] a = { "jello", "hdfludj", "divya", "yello" };
		receive(a);
	}

	public static void receive(String[] a) {
		for (String string : a) {
			System.out.println(string);
		}
	}
}
