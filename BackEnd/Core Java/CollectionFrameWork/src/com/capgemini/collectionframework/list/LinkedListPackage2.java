package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPackage2 {
	public static void main(String[] args) {
		LinkedList<String> s1 = new LinkedList<String>();
		s1.add("Hello");
		s1.add("yello");
		s1.add("mello");
		s1.add("kello");
		System.out.println("Using For-Each");

		for (String string : s1) {
			System.out.println(string);
		}

		System.out.println("Using For");
		for (int i = 0; i < s1.size(); i++) {
			String s = s1.get(i);
			System.out.println(s);
		}

		System.out.println("Using Iteretor");

		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("Forward ");
		ListIterator<String> l1 = s1.listIterator();
		while (l1.hasNext()) {
			System.out.println(l1.next());
		}

		System.out.println("Backward ");
		while (l1.hasPrevious()) {
			System.out.println(l1.previous());
		}

	}
}
