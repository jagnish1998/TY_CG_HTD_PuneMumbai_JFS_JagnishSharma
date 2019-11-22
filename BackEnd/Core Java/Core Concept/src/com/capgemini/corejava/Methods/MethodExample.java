package com.capgemini.corejava.Methods;

public class MethodExample 
{
	int y=  10;
	public static void main(String[] args) 
	{
		// 1st Way
		MethodExample m1 = new MethodExample();
		int area1  = m1.areaOfRec(2, 5);
		System.out.println("Area is "+area1);
		// 2nd Way
		int area2 =  new MethodExample().areaOfRec(5, 10);
		System.out.println("Area is " +area2);
		// 3rd Way
		System.out.println("Area is " +new MethodExample().areaOfRec(10, 20));
		
	}
	
	public static void print() 
	{
		System.out.println("Print() Method");
	}
	
	public static int areaOfSquare(int side)
	{	
		return side*side;
	}
	public int areaOfRec(int l , int b)
	{
		return l*b;
	}
}
