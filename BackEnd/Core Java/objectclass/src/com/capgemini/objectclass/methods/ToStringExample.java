package com.capgemini.objectclass.methods;

public class ToStringExample {
	String name;
	int id;
	double percentage;

	public ToStringExample(String name, int id, double percentage) {
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}

	public String toString() {
		return "Name : " + name + ",Id : " + id + ",Percentage : " + percentage;
	}

}
