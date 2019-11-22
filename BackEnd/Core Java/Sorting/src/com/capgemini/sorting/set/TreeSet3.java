package com.capgemini.sorting.set;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet3 {
public static void main(String[] args) {
		
		TreeSet<String> hs = new TreeSet<String>();
		hs.add("Jagnish");
		hs.add("Mohit");
		hs.add("Rohit");
		hs.add("Deepa");
		
		System.out.println("************************* Using Iterator *****************************");
		Iterator<String> i1 = hs.iterator();
		while(i1.hasNext())
		{	
			System.out.println(i1.next());
		}
		
	}

}
