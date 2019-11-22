package com.capgemini.corejava.Methods;

public class Car 
{
	String name;
	String colour;
	double price;
	
	public Car(String name, String colour, double price)
	{
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public Car(String name, double price) 
	{
		super();
		this.name = name;
		this.colour = colour;
	}
	public Car(double price,String name)
	{
		super();
		this.name = name;
		this.colour = colour;
	}
	 
	public Car(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
}
