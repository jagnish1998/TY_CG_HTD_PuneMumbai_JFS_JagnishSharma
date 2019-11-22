package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class ArrayListPackage7 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("priya");
		a1.add(2);
		a1.add('f');
		a1.add(5.6);

		for (Object object : a1) 
		{
			System.out.println(object);
		}
	}
}
