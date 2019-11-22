package com.capgemnini.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;



public class TestStudent
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Priya",1,65.4);
		Student s2 = new Student("Anil",2,42.3);
		Student s3 = new Student("Dinesh",3,51.6);
		Student s4 = new Student("Raju",4,76.8);
		Student s5 = new Student("Jagnish", 5, 80.6);
		Student s6 = new Student("Chinnu", 6, 20.6);
		Student s7 = new Student("Chotu", 7, 50.5);
		Student s8 = new Student("Mohit", 8, 70.6);
		Student s9 = new Student("Rohit", 9, 30.8);

		
		ArrayList<Student> a1 = new  ArrayList<Student>();
		ArrayList<Student> a2 = new  ArrayList<Student>();
		ArrayList<Student> a3 = new  ArrayList<Student>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a2.add(s4);
		a2.add(s5);
		a2.add(s6);
		a3.add(s7);
		a3.add(s8);
		a3.add(s9);
		
		LinkedHashMap<String,ArrayList<Student>> hm = new LinkedHashMap<String, ArrayList<Student>>();
		
		hm.put("First", a1);
		hm.put("Second", a2);
		hm.put("third", a3);
		
		
		/*
		 * Collection<ArrayList<Student>> c = hm.values(); for(ArrayList<Student> a : c)
		 * { for(Student s : a) { System.out.println("Name is " + s.name);
		 * System.out.println("Id is " + s.id); System.out.println("Percentage is " +
		 * s.percentage);
		 * System.out.println("----------------------------------------------------"); }
		 * }
		 */
		
		ArrayList<Student> as = hm.get("Second");
		for (Student student : as) {
			System.out.println("Name is " + student.name);
			System.out.println("Id is " + student.id);
			System.out.println("Percentage is " + student.percentage);
			System.out.println("----------------------------------------------------");

		}
		
		}
}
