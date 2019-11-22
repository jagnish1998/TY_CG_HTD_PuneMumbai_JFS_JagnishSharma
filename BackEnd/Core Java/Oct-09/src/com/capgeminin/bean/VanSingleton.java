package com.capgeminin.bean;

public class VanSingleton 
{
	final private static VanSingleton v1 = new VanSingleton();
	
	private VanSingleton() 
	{
		super();
	}
	
	static VanSingleton getVanSingleton()
	{
		return v1;
	}
	
}
