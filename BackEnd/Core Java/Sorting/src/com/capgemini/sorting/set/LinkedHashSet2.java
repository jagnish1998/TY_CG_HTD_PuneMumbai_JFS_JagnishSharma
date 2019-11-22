package com.capgemini.sorting.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet2 {
public static void main(Double[] args) {
		
		LinkedHashSet<Double> hs = new LinkedHashSet<Double>();
		hs.add(4.2);
		hs.add(65.8);
		hs.add(49.6);
		hs.add(89.5);
		System.out.println("************************* Using For-Each *****************************");
		
		for (Double s : hs) 
		{
			System.out.println(s);
			
		}
		System.out.println("************************* Using Iterator *****************************");
		Iterator<Double> i1 = hs.iterator();
		while(i1.hasNext())
		{	
			System.out.println(i1.next());
		}
		
	}
}
