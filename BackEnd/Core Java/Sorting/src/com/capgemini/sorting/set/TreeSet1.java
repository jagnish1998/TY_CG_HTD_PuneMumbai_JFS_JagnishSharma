package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
		
		TreeSet hs = new TreeSet();
		hs.add(15);
		hs.add(10);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		System.out.println("************************* Using For-Each *****************************");
		
		for (Object object : hs) 
		{
			System.out.println(object);
			
		}
		/*
		 * System.out.
		 * println("************************* Using Iterator *****************************"
		 * ); Iterator i1 = hs.iterator(); while(i1.hasNext()) {
		 * System.out.println(i1.next()); }
		 * 
		 */	}


}
