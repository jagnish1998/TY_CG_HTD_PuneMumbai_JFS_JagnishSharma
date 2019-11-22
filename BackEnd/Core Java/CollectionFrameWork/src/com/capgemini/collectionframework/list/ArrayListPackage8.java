package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPackage8 
{
	public static void main(String[] args)
	{
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(2.4);
		a1.add(9.6);
		a1.add(4.1);
		a1.add(3.2);

		for(int i=0;i<a1.size();i++) 
		{
			double d1 = a1.get(i);
			System.out.println(d1);
		}
	}
}
