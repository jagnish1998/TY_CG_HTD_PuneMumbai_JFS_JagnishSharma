package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3
{
	public static void main(String[] args) 
	{
		HashSet<Employee> h1 = new HashSet<Employee>();
		
		Employee e1 = new Employee(1,"Rahul",15000.00);
		Employee e2 = new Employee(2,"Rohit",250000.45);
		Employee e3 = new Employee(3,"Mohan",551000.26);
		Employee e4 = new Employee(4,"Roy",4000000.510);
		Employee e5 = new Employee(2,"Rohit",250000.45);
		
		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		h1.add(e4);
		h1.add(e5);
		
		System.out.println("**********************************  Using hashSet *************************************");
		Iterator<Employee> i = h1.iterator();
		while(i.hasNext())
		{
			Employee e = i.next();
			System.out.println("ID is :"+e.id);
			System.out.println("Name is :"+e.name);
			System.out.println("Salary is :"+e.salary);
			System.out.println("-----------------------------------------------------------------");
		}
	}
}
