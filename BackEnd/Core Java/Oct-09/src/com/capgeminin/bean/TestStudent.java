package com.capgeminin.bean;

public class TestStudent {
public static void main(String[] args) {
	Student s = new Student();
	s.setHeight(5.11);
	s.setName("jagnish");
	s.setId(42);
	
	
	DataBaseStudent d1  = new DataBaseStudent();
	d1.receive(s);
}
}
