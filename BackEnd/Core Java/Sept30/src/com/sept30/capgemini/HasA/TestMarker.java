package com.sept30.capgemini.HasA;

public class TestMarker 
{
	public static void main(String[] args) {
	Person p  = new Person();
	System.out.println(p.i);
	p.walk();
	p.m.colour();
	p.m.write();
	}
}
