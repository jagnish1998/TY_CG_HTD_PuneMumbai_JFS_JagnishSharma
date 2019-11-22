package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrrayListPackage3 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(24);
		a1.add("Chinnu");
		a1.add(2.9);
		a1.add('f');
		
		Iterator i = a1.iterator();
		
		while(i.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("***********************************");
		
		ListIterator li = a1.listIterator();
		
		while(li.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
		}
	}
}
