package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPackage {
	public static void main(String[] args) {
		LinkedList a1 = new LinkedList();
		a1.add("priya");
		a1.add(2);
		a1.add('f');
		a1.add(5.6);
		
		System.out.println("********************Using For-each**********************");
		for (Object o : a1) 
		{
			System.out.println(o);
		}
	
		System.out.println("********************Using For**********************");
		for (int i = 0; i < a1.size(); i++) {
			Object d1 = a1.get(i);
			System.out.println(d1);
		}

		ListIterator l1 = a1.listIterator();
		System.out.println("********************Using ListIterator**********************");
		System.err.println("********************Forward*******************");
		while (l1.hasNext()) {
			Object d1 = l1.next();
			System.out.println(d1);
		}

		System.err.println("********************Backward*******************");
		while (l1.hasPrevious()) {
			Object d1 = l1.previous();
			System.out.println(d1);
		}
		Iterator i = a1.iterator();
		System.out.println("********************Using Iterator**********************");
		while (i.hasNext()) {
			Object d1 = i.next();
			System.out.println(d1);
		}

	}
}
