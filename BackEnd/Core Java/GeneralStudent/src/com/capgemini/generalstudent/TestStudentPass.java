package com.capgemini.generalstudent;

import java.util.function.Predicate;

public class TestStudentPass {
	public static void main(String[] args) {

		Predicate<Student> p = (i) -> {
			if (i.percentage >= 35) {
				return true;
			} else {
				return false;
			}
		};
		Student s7 = new Student(7, "jagnish", 'm', 33);
		System.out.println(p.test(s7));
		
	}
}
