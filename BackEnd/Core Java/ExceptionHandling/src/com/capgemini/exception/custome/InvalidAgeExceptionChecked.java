package com.capgemini.exception.custome;

public class InvalidAgeExceptionChecked extends Exception{
	private String message ="Age is not valid";
	@Override
	public String getMessage() 
	{
		return message;
	}
	
}
