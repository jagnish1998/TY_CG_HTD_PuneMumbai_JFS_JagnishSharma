package com.capgemini.treeSet;

import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		
		ByID b1 = new ByID();
		ByName  b2  = new ByName();
		ByPercentage b3=  new ByPercentage();
		
		
		TreeSet<Student> ts = new TreeSet<Student>(b1);
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setGender("male");
		s1.setName("Vikas");
		s1.setPercentage(45);
	
		Student s2 = new Student();
		s2.setId(5);
		s2.setGender("male");
		s2.setName("Anil");
		s2.setPercentage(60.72);
	
		Student s3 = new Student();
		s3.setId(3);
		s3.setGender("female");
		s3.setName("Rema");
		s3.setPercentage(25.8);
	
		Student s4 = new Student();
		s4.setId(4);
		s4.setGender("male");
		s4.setName("Rohit");
		s4.setPercentage(60.4);
	
		Student s5 = new Student();
		s5.setId(2);
		s5.setGender("male");
		s5.setName("Jagnish");
		s5.setPercentage(89.86);
	
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for (Student s : ts) 
		{
			System.out.println("Name is "+s.getName());
			System.out.println("ID is "+s.getId());
			System.out.println("Percentage is "+s.getPercentage());
			System.out.println("Gender is "+s.getGender());
			System.out.println("---------------------------------------------------");
			
		}
		
		
	}
}
