package com.capgemini.Strim;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmployee2 {
public static void main(String[] args) {
	Comparator<Employee> comp = (e1,e2)->
	{
		if(e1.id > e2.id)
		{
			return 1;
		}
		else if(e1.id < e2.id)
		{
			return-1;
		}
		else
		{
			return 0;
		}
	};
	
	TreeSet<Employee> ts = new TreeSet<Employee>(comp);
	
	
	Employee e1 = new Employee("jagnish", 1, 5.11);
	Employee e2 = new Employee("Rohit", 2, 5.4);
	Employee e3 = new Employee("Jonh Wick", 3, 5.6);
	Employee e4 = new Employee("Sam", 4, 6.2);

	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	
	Iterator<Employee> i = ts.iterator();
	while(i.hasNext())
	{
		Employee e = i.next();
		System.out.println("name is "+e.name);
		System.out.println("ID is "+e.id);
		System.out.println("Height is "+e.height);
		System.out.println("--------------------------------------------------------------------");
	}
}
}
