package com.capgeminin.bean;

public class TestBus 
{
	public static void main(String[] args) 
	{
		Bus b1  = new Bus("Volvo",40);
		System.out.println("Name   of the bus   is : "+b1.getName());
		System.out.println("Capacity of the bus is : "+b1.getSeat());
	}
}
