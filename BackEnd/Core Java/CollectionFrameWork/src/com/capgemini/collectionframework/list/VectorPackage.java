package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorPackage {
	public static void main(String[] args) {
		Vector v1 =  new Vector();
		v1.add(54);
		v1.add("Hello");
		v1.add('w');
		v1.add(4.44);
		
		for (Object object : v1) 
		{	
			Object o = object;
			System.out.println(o);
		}
		System.out.println("**********************************");
		for (int i = 0; i < v1.size(); i++)
		{
			Object o = v1.get(i);
			System.out.println(o);
		}
		System.out.println("**********************************");
		Iterator i1 = v1.iterator();
		while(i1.hasNext())
		{
			Object o = i1.next();
			System.out.println(o);
		}
	}
}
