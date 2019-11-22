package com.capgemini.studentaap.qsp;

import com.capgemini.studentaap.jsp.Remote;

public class TestC {
	public static void main(String[] args) {
		Remote r1 = new Remote();
		r1.off();
		System.out.println(r1.sum);
		Remote.on();
		System.out.println(Remote.count);
	}
}
