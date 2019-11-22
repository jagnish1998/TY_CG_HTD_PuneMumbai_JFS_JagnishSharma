package com.capgemini.generalstudent;

import java.util.function.Function;

public class TestC 
{
	public static void main(String[] args)
	{
		Function<Integer, Student> x = (i) ->
		{
			Student s = new Student();
			s.id = i;
			return s;
		};
		
		Student s = x.apply(20);
		System.out.println("Name is "+s.name);
		System.out.println("Id is "+s.id);
	}
}
