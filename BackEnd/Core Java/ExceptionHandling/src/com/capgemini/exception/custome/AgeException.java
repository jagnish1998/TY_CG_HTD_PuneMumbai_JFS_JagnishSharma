package com.capgemini.exception.custome;

public class AgeException {
	public void verify(int age)throws InvalidAgeExceptionChecked
	{
		if(age<18)
		{
			throw new InvalidAgeExceptionChecked();
		}
	}
}
