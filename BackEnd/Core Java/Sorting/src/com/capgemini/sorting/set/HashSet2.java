package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Jagnish");
		hs.add("Mohit");
		hs.add("Rohit");
		hs.add("Deepa");
		System.out.println("************************* Using For-Each *****************************");
		
		for (String s : hs) 
		{
			System.out.println(s);
			
		}
		System.out.println("************************* Using Iterator *****************************");
		Iterator<String> i1 = hs.iterator();
		while(i1.hasNext())
		{	
			System.out.println(i1.next());
		}
		
	}
}
