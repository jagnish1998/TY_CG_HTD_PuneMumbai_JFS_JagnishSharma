package com.capgemnini.maps;

import java.util.TreeMap;
import java.util.Map;

public class TestC 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("Ondu", 1);
		hm.put("Idhu", 2);
		hm.put("Hathu", 4);
		hm.put("Eredu", 3);

		for (Map.Entry<String, Integer> r : hm.entrySet()) {
			String k = r.getKey();
			Integer v = r.getValue();
			System.out.println("Key is " + k);
			System.out.println("value is" + v);
			System.out.println("---------------------------------------------------------------");
		}

	}
}