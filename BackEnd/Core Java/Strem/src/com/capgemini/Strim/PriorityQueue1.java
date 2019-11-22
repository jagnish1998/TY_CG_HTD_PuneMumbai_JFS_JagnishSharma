package com.capgemini.Strim;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
public static void main(String[] args) {
	PriorityQueue<Integer> p1 =  new PriorityQueue<Integer>();
	p1.add(10);
	p1.add(56);
	p1.add(12);
	p1.add(2);
	
	Iterator<Integer> i = p1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
