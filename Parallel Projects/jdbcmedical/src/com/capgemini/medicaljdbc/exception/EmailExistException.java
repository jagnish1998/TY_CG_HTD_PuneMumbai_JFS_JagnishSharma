package com.capgemini.medicaljdbc.exception;

public class EmailExistException extends Exception{
	
	String msg = "Email is Already Exist";
	
	@Override
	public String toString() {
		return msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	
}
