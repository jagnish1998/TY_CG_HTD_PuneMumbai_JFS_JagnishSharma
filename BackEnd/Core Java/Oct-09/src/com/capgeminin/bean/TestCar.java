package com.capgeminin.bean;

public class TestCar 
{
	public static void main(String[] args)
	{
		Car c1  = new Car(2500000,"Benz");
		System.out.println("Name is :"+c1.getName());
		System.out.println("Cost is :"+c1.getCost());
	}
}
