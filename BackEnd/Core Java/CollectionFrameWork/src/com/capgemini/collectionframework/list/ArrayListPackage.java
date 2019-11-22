package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class ArrayListPackage {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add("Chinnu");
		a1.add(2.9);
		a1.add('f');

		for (int i = 0; i < a1.size(); i++) {
			Object o = a1.get(i);
			System.out.println(o);
		}
	}
}
