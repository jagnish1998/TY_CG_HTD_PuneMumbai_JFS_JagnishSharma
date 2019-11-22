package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudenrt
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 = new ArrayList<Student>();

		Student s1 = new Student(4,"Jagnish",80.6);
		Student s2 = new Student(4,"nish",20.6);
		Student s3 = new Student(4,"Jag",70.6);
		Student s4 = new Student(4,"agsh",60.6);
		Student s5 = new Student(4,"sajfhcai",80.6);


		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);

		for (Student student : a1) 
		{
			System.out.println(student);
		}



		Iterator<Student> i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1);
		}

		ListIterator<Student> li = a1.listIterator();

		while (li.hasNext())
		{
			System.out.println(li.next());
		}

	}
}
