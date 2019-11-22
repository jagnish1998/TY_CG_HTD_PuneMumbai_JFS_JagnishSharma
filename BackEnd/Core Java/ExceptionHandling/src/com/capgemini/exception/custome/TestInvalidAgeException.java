package com.capgemini.exception.custome;

public class TestInvalidAgeException 
{
	public static void main(String[] args) 
	{
		Validate v1 = new Validate();
		try 
		{
			v1.verify(20);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
			
		}

	}
}
