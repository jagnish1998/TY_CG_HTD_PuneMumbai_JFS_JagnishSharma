package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPacakage4
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add("Chinnu");
		a1.add(2.9);
		a1.add('f');

		ListIterator li = a1.listIterator();

		System.out.println("****************Forward**********************");

		while (li.hasNext()) 
		{
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("****************Backward**********************");
		
		while (li.hasPrevious())
		{
			Object o = li.previous();
			System.out.println(o);

		}
	}
}
