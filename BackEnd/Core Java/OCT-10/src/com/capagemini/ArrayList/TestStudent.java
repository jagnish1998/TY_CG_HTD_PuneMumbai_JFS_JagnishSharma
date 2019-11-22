package com.capagemini.ArrayList;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student("Jagnish", 1, 80.6);
		Student s2 = new Student("Chinnu", 2, 20.6);
		Student s3 = new Student("Chotu", 3, 50.5);
		Student s4 = new Student("Mohit", 4, 70.6);
		Student s5 = new Student("Rohit", 5, 30.8);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);

		HelperStudent h1 = new HelperStudent();
		h1.display(a1);
		h1.pass(a1);
		h1.distiction(a1);
	}
}
