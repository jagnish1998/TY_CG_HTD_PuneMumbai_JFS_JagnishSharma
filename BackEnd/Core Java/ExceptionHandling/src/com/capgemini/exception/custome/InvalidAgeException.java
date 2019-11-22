package com.capgemini.exception.custome;

public class InvalidAgeException extends RuntimeException
{
	String message ;
	
	@Override
	public String toString() {
		return message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}
}
