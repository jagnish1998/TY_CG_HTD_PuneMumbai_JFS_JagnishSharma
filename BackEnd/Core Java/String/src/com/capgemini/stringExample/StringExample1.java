package com.capgemini.stringExample;

public class StringExample1 {
	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 = " Iam java";
		String s3 ="hello  lo  lo lo";
		System.out.println(s1.length());
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s2.endsWith("va"));
		System.out.println(s3.indexOf("l"));
		System.out.println(s2.indexOf("a",5));
		System.out.println(s2.indexOf("java"));
		System.out.println(s2.indexOf("lo",1));
		System.out.println(s1.isEmpty());
		System.out.println(s2.replace("a","e"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s2.substring(4));
		System.out.println(s2.trim());
	}
}
