package com.capgemini.corejava.basics;

public class AssignmentOpertaors 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b =20;
		System.out.println("+= "+(b+=a));
		System.out.println("-= "+(b-=a));
		System.out.println("*= "+(b*=a));
		System.out.println("/= "+(b/=a));
	}
}
