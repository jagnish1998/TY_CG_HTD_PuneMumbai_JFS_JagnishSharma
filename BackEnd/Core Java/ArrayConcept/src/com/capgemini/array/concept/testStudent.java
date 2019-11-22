package com.capgemini.array.concept;

public class testStudent {
public static void main(String[] args) {
		Student[] s = new Student[4];
		/*
		 * s[0] = new Student("hello",46, 80.44); 
		 * s[1] = new Student("yello",47, 11.44);
		 * s[2] = new Student("wello",48, 20.44); 
		 * s[3] = new Student("ello",49, 56.44);
		 * receive(s);
		 * 
		 */
		Student s1 = new Student("hello",46, 80.44);
		Student s2 = new Student("yello",47, 11.44);
		Student s3 = new Student("wello",48, 20.44);
		Student s4 = new Student("ello",49, 56.44);
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		
		receive(s);
		
		
		
}
public static void receive(Student[] a)
{
	for (Student student : a) {
		System.out.println("name is "+student.name);
		System.out.println("ID  is "+student.id);
		System.out.println("Percentage is "+student.percentage);
		System.out.println("-------------------------------------------------------");
	}
}
}
