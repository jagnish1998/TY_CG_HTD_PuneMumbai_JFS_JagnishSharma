package com.capgemini.objectclass.methods;

public class TestRemote {
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Remote r1  = new Remote(4,"lG-Remote");
		System.out.println(r1.id);
		System.out.println(r1.name);
		
		Object  r = r1.clone();
		Remote r2 = (Remote)r;
		
		System.out.println(r2.id);
		System.out.println(r2.name);
		
	}
}
