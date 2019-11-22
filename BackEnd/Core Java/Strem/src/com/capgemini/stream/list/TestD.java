package com.capgemini.stream.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(6);
		a.add(3);
		a.add(4);
		Comparator<Integer> comp = (i,j)->i.compareTo(j);
		
		Integer small = a.stream().min(comp).get();
		Integer larger = a.stream().max(comp).get();
		System.out.println("Smaller is "+small);
		System.out.println("larger is "+larger);
		
	}

}
