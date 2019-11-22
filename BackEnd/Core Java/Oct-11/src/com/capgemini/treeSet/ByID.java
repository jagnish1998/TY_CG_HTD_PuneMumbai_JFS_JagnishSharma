package com.capgemini.treeSet;

import java.util.Comparator;

public class ByID implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		Integer i = o1.getId();
		Integer j = o2.getId();
		return i.compareTo(j);
	}
	
}
