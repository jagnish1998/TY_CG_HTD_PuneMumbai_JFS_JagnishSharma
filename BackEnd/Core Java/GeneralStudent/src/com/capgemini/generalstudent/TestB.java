package com.capgemini.generalstudent;

import java.util.function.Function;

public class TestB 
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> x = (i) -> i * i;
		System.out.println(x.apply(20));
	}
}
