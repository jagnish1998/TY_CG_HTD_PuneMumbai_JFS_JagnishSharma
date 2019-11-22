package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorPackage2 {
	public static void main(String[] args) {
		Vector<Character> v1 =  new Vector<Character>();
		v1.add('q');
		v1.add('g');
		v1.add('w');
		v1.add('f');
		
		for (Character object : v1) 
		{	
			System.out.println(object);
		}
		System.out.println("**********************************");
		for (int i = 0; i < v1.size(); i++)
		{
			Character o = v1.get(i);
			System.out.println(o);
		}
		System.out.println("**********************************");
		Iterator<Character> i1 = v1.iterator();
		while(i1.hasNext())
		{
			Character o = i1.next();
			System.out.println(o);
		}
	}
}
