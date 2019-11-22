package com.capgemini.array.concept;

interface MyArea
{
	double area(double r);
}

public class AreaCircleLamda {
	public static void main(String[] args) 
	{
		MyArea a = r -> 3.14*r*r;
		System.out.println("Area is "+a.area(5.2));
	}
}
