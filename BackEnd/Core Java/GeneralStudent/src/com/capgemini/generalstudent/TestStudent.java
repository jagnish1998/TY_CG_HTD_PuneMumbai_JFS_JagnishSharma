package com.capgemini.generalstudent;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();

		Student s1 = new Student(1, "Priya", 'f', 65.4);
		Student s2 = new Student(2, "riya", 'f', 80);
		Student s3 = new Student(3, "sompriya", 'f', 25);
		Student s4 = new Student(4, "Garima", 'f', 30);
		Student s5 = new Student(5, "rahul", 'm', 75);
		Student s6 = new Student(6, "rohit", 'm', 73);
		Student s7 = new Student(7, "jagnish", 'm', 33);
		Student s8 = new Student(8, "Mohit", 'm', 90);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		a1.add(s7);
		a1.add(s8);

		/*
		 * HelperStudent hs = new HelperStudent(); System.out.
		 * println("******************************All Student ******************************"
		 * ); hs.getTopper(a1);
		 */

	
	}
}
