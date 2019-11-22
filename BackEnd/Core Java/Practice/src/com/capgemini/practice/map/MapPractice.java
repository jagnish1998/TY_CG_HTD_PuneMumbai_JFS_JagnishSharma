package com.capgemini.practice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice 
{
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student("Hello",1, 25);
		Student s2 = new Student("Hello",2, 25);
		Student s3 = new Student("Hello",3, 25);
		Student s4 = new Student("Hello",4, 25);
		Student s5 = new Student("Hello",5, 25);
		Student s6 = new Student("Hello",6, 25);
		Student s7 = new Student("Hello",7, 25);
		Student s8 = new Student("Hello",9, 25);
		Student s9 = new Student("Hello",8, 25);
		Student s10 = new Student("Hello",10, 25);
		Student s11 = new Student("Hello",11, 25);
		Student s12 = new Student("Hello",12, 25);
		Student s13 = new Student("Hello",13, 25);
		Student s14 = new Student("Hello",14, 25);
		Student s15 = new Student("Hello",15, 25);
		Student s16 = new Student("Hello",16, 25);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(s6);
		a2.add(s7);
		a2.add(s8);
		a2.add(s9);
		a2.add(s10);
		a2.add(s11);
		
		ArrayList<Student> a3 = new ArrayList<Student>();
		a3.add(s12);
		a3.add(s13);
		a3.add(s14);
		a3.add(s15);
		a3.add(s16);
		
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("First",a1);
		hm.put("Second",a2);
		hm.put("Third",a3);
	
		/*
		 * for (Map.Entry<String,ArrayList<Student>> e: hm.entrySet()) { String k =
		 * e.getKey(); ArrayList<Student> v = e.getValue();
		 * 
		 * for (Student student : v) { System.out.println(v); }
		 * 
		 * }
		 */	
		for (Map.Entry<String,ArrayList<Student>> m : hm.entrySet())
		{
			System.out.println(m.getValue());
		}
		
		ArrayList<Student> arr = hm.get("First");
		Iterator<Student> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	
	}
}
