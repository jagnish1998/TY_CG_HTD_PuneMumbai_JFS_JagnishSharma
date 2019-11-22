package com.capgemini.exception.custome;

public class Validate {
	void verify(int age)
	{
		if(age<18) 
		{
			
			throw new InvalidAgeException("Dont come until you are 18");	
		}
	}
}
