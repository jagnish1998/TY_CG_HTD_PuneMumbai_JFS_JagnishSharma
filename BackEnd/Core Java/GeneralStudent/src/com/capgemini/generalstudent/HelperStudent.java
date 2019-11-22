package com.capgemini.generalstudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HelperStudent 
{
	Comparator<Student> comp = (o1,o2) ->
	{
		Double i = o1.percentage;
		Double j = o2.percentage;
		return i.compareTo(j);
	};
	
	void getTopper(ArrayList<Student> a1)
	{
		Student s = a1.stream().max(comp).get();
		System.out.println("Name is " + s.name);
		System.out.println("Id is " + s.id);
		System.out.println("Percentage is " + s.percentage);
		System.out.println("Gender is "+s.Gender);
		System.out.println("----------------------------------------------------");

	}
	
	void displayPassed(ArrayList<Student> a1)
	{
		List<Student> ls = a1.stream().filter(i -> i.percentage >=35).collect(Collectors.toList());
		Iterator<Student> s1 = ls.iterator();
		while(s1.hasNext())
		{
			Student s = s1.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("Gender is "+s.Gender);
			System.out.println("----------------------------------------------------");
		}
		
	}
	
	void displayFailed(ArrayList<Student> a1)
	{
		List<Student> ls = a1.stream().filter(i -> i.percentage < 35).collect(Collectors.toList());
		Iterator<Student> s1 = ls.iterator();
		while(s1.hasNext())
		{
			Student s = s1.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("Gender is "+s.Gender);
			System.out.println("----------------------------------------------------");
		}
		
	}
	
	void displayFailedGender(ArrayList<Student> a1, char g)
	{
		List<Student> ls = a1.stream().filter(i -> i.percentage < 35 && i.Gender == g).collect(Collectors.toList());
		Iterator<Student> s1 = ls.iterator();
		while(s1.hasNext())
		{
			Student s = s1.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("Gender is "+s.Gender);
			System.out.println("----------------------------------------------------");
		}
		
	}

	void displayPassedGender(ArrayList<Student> a1,char g)
	{
		List<Student> ls = a1.stream().filter(i -> i.percentage >=35 && i.Gender== g).collect(Collectors.toList());
		Iterator<Student> s1 = ls.iterator();
		while(s1.hasNext())
		{
			Student s = s1.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("Gender is "+s.Gender);
			System.out.println("----------------------------------------------------");
		}
		
	}

	
	void displayAll(ArrayList<Student> al)
	{
		Iterator<Student> s1 = al.iterator();
		while(s1.hasNext())
		{
			Student s = s1.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("Gender is "+s.Gender);
			System.out.println("----------------------------------------------------");
		}
		
	}

}
