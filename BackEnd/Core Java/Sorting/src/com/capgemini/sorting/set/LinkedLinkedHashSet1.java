package com.capgemini.sorting.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedLinkedHashSet1 {
public static void main(String[] args) {
		
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(15);
		hs.add('A');
		hs.add(2.4);
		hs.add("Deepa");
		hs.add(null);
		hs.add(null);
		System.out.println("************************* Using For-Each *****************************");
		
		for (Object object : hs) 
		{
			System.out.println(object);
			
		}
		System.out.println("************************* Using Iterator *****************************");
		Iterator i1 = hs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
