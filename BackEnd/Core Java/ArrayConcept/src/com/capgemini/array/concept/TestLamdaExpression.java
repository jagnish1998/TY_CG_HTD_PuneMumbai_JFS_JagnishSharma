package com.capgemini.array.concept;

interface A
{
	int add(int a, int b);
}

public class TestLamdaExpression 
{
	public static void main(String[] args) {
		A a = (f,b)->f+b;
		System.out.println(a.add(10,10));
	}
}
