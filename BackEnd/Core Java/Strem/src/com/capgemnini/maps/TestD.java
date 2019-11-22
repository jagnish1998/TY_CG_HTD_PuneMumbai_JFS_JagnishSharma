package com.capgemnini.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("Ondu", 1);
		hm.put("Idhu", 2);
		hm.put("Hathu", 4);
		hm.put("Eredu", 3);
		
		System.out.println("************************* Keys are*******************");
		Set<String> s =	hm.keySet();
		for(String r : s)
		{
			System.out.println(r);
		}
		System.out.println("************************* values are*******************");

		Collection<Integer> c = hm.values();
		for (Integer integer : c) {
			System.out.println(integer);
		}
		
	}
}
