package com.capgemini.junit;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public double div(int a, int b) {
		return a / b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
	
	public int fact(int no) {
		int rs=1;
		for(int i=no;i>0;i--) {
			rs = rs*i;
		}
		return rs;
	}
}
