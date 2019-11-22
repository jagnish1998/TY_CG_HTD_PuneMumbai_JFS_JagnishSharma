package com.capgemini.exception.custome;

public class Amount 
{
	void check(double amt) throws InvalidLimitException
	{
		if(amt>40000)
		{
			throw new InvalidLimitException();
		}
	}
}
