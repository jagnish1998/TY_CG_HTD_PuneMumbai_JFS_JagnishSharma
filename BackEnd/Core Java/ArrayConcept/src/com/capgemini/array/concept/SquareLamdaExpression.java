package com.capgemini.array.concept;

interface B {
	int square(int a);
}

public class SquareLamdaExpression {
	public static void main(String[] args) {
		B b = a -> a * a;
		System.out.println("Square is :"+b.square(5));
	}
}
