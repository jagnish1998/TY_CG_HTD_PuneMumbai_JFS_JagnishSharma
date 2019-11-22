package com.capgemini.corejava.Methods;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		System.out.println(add(5,6));
		System.out.println(add(5,6,5));
		System.out.println(add(5,6.5,7));
		System.out.println(add(5,6,7.5));
	}
	public static int add(int i ,int j)
	{
		return i+j;
	}
	public static int add(int i ,int j,int k)
	{
		return i+j+k;
	}
	public static double add(int i ,int j,double k)
	{
		return i+j+k;
	}
	public static double add(int i ,double j,int k)
	{
		return i+j+k;
	}
	
}
