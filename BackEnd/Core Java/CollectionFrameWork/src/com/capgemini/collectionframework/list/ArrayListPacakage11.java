package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPacakage11 {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(2.4);
		a1.add(9.6);
		a1.add(4.1);
		a1.add(3.2);

		ListIterator<Double> l1 = a1.listIterator();
		
		System.err.println("********************Forward*******************");		
		while(l1.hasNext())
		{
			Double d1 = l1.next();
			System.out.println(d1);
		}
		
		System.err.println("********************Backward*******************");
		while(l1.hasPrevious())
		{
			Double d1 = l1.previous();
			System.out.println(d1);
		}
	}
}
