package com.capgemini.exception.custome;

public class InvalidLimitException extends Exception {
	private String message = "day limit is 40,000";

	public String getMessage() {
		return message;
	}
}
