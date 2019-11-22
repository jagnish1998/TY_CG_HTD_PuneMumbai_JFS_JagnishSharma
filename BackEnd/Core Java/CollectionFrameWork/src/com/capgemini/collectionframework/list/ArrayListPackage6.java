package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPackage6 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("priya");
		a1.add(2);
		a1.add('f');
		a1.add(5.6);

		Iterator i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
