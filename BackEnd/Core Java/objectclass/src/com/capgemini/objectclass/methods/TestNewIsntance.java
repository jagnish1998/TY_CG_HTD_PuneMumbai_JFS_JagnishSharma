package com.capgemini.objectclass.methods;

public class TestNewIsntance {
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		NewInstance n1 = new NewInstance("hello",4);
		System.out.println(n1);
		Object o = n1.clone();
		
		NewInstance n2 = (NewInstance)o;
		System.out.println(o);
		
	
	}
}
