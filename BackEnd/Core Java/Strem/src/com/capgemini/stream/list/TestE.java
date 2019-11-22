package com.capgemini.stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(6);
		a.add(3);
		a.add(4);
		
		
		List<Integer> l = a.stream().sorted().collect(Collectors.toList());
		for (Integer integer : l)
		{
			System.out.println(integer);
		}
	}

}
