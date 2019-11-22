package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPackage10 {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(2.4);
		a1.add(9.6);
		a1.add(4.1);
		a1.add(3.2);
		
		Iterator<Double> i = a1.iterator();
		
		while(i.hasNext())
		{
			Double d1 = i.next();
			System.out.println(d1);
		}
	}
}
