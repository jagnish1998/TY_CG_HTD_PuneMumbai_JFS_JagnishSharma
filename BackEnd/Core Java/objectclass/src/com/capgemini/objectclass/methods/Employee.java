package com.capgemini.objectclass.methods;

public class Employee {
	int id;
	String name;
	double salary;
	char gender;

	public Employee(int id, String name, double salary, char gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}

}
