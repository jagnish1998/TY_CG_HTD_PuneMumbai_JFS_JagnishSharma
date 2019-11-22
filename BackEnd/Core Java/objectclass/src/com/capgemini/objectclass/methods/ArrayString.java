package com.capgemini.objectclass.methods;

public class ArrayString {
	public static void main(String[] args) {
		String[] a = new String[4];
		a[0] = "hello";
		a[1] = "yello";
		a[2] = "Kello";
		a[3] = "Mello";
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
