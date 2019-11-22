package com.capgeminin.bean;

public class DataBaseStudent 
{
	void receive(Student s)
	{
		System.out.println("**********************Iam is the database***********************");
		System.out.println("Name   is :"+s.getName());
		System.out.println("Id     is :"+s.getId());
		System.out.println("Height is :"+s.getHeight());
	}
	void receive(Employee e1)
	{
		System.out.println("**********************Iam is the database***********************");
		System.out.println("Name   is :"+e1.getName());
		System.out.println("Id     is :"+e1.getId());
		System.out.println("Department is :"+e1.getDepartment());
		System.out.println("Roll is :"+e1.getRole());
		System.out.println("Salary is :"+e1.getSalary());
	}
}
