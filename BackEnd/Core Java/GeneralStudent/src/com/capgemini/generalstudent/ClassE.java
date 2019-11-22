package com.capgemini.generalstudent;

import java.util.function.Consumer;

public class ClassE 
{
	public static void main(String[] args) 
	{
		Consumer<Student> a = (i) -> {
			System.out.println("Name is "+i.name);
			System.out.println("Id is "+i.id);
			System.out.println("Percentage is "+i.percentage);

		};

		Student s6 = new Student(6, "rohit", 'm', 73);
		Student s7 = new Student(7, "jagnish", 'm', 33);
		Student s8 = new Student(8, "Mohit", 'm', 90);

		a.accept(s7);

	}

}
