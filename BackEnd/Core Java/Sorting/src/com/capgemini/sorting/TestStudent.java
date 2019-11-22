package com.capgemini.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student(1,"Priya",65.4);
		Student s2 = new Student(5,"Anil",42.3);
		Student s3 = new Student(3,"Dinesh",51.6);
		Student s4 = new Student(2,"Raju",76.8);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);

		Collections.sort(a1);
		
		Iterator<Student> p = a1.iterator();
		while(p.hasNext())
		{
			Student student = p.next();
			System.out.println("Name is "+student.name);
			System.out.println("ID is "+student.id);
			System.out.println("Percentage is "+student.percentage);
			System.out.println("------------------------------------------------------------------------");
	
		}

		
		
	}
	
}
