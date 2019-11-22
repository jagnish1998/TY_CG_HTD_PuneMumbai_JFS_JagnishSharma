package com.capgemini.junit;

public class Student {
	private int id;
	private String name;
	private double percentage;
	private String gender;

	
	// Parametrised Constructor
	public Student(String name, double percentage, String gender) {
		this.name = name;
		this.percentage = percentage;
		this.gender = gender;
	}
	//Default Constructor
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
