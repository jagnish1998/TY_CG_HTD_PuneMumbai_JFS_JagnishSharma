package com.capgemini.array.concept;

public class DoubleRcevive {
	public static void main(String[] args) {
		double [] a = {45.66,48.66,52.44,4812.57};
		receive(a);

	}
	public static void receive(double []a)
	{
		for (double d : a) {
			System.out.println(d);
		}
	}
}
