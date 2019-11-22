package com.capgemini.corejava.Methods;

public class Demo 
{
	static MethodExample m2 = new MethodExample();

	public static void main(String[] args) 
	{
		MethodExample m1 = new MethodExample();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m2.areaOfRec(8, 4));
		System.out.println(m1.areaOfRec(4, 2));
		int r = m1.y;
		System.out.println(r);
	}
}
