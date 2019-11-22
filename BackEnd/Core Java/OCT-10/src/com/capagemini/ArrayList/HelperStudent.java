package com.capagemini.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class HelperStudent 
{
	void display(ArrayList<Student> k)
	{
		System.out.println("*************************All the Student ***************************************");
		for ( Student student : k) 
		{
			System.out.println("name is"+student.name);
			System.out.println("Id is "+student.id);
			System.out.println("Percentage is"+student.percentage);
			System.out.println("-----------------------------------------");
		}

	}

	void pass(ArrayList<Student> k)
	{
		System.out.println("********************** Student Passed ****************************");
		Iterator<Student> i = k.iterator();
		while(i.hasNext())
		{
			Student s = i.next();
			if(s.percentage >= 35)
			{
				System.out.println("name is"+s.name);
				System.out.println("Id is "+s.id);
				System.out.println("Percentage is"+s.percentage);
				System.out.println("-------------------------------------------");

			}
		}
	}
	
	void distiction(ArrayList<Student> k)
	{
		System.out.println("********************** Distinction Student  ****************************");
		Iterator<Student> i = k.iterator();
		while(i.hasNext())
		{
			Student s = i.next();
			if(s.percentage >= 70)
			{
				System.out.println("name is"+s.name);
				System.out.println("Id is "+s.id);
				System.out.println("Percentage is"+s.percentage);
				System.out.println("-------------------------------------------");

			}
		}
	}
}
