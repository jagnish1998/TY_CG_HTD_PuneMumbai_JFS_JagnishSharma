package com.capgemini.generalstudent;

import java.util.function.Supplier;

public class TestD {
public static void main(String[] args) {
	
	Supplier<Student> a = () -> new Student();
	Student s = a.get();
	Student s2 = a.get();
	System.out.println(s+"\n"+s2);
}
}
