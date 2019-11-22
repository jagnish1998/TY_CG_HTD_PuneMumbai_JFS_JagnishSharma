package com.capgemini.array.concept;

public class TestMouse {
	public static void main(String[] args) {
		Mouse m1 = new Mouse();
		double[] d1 = { 1.12, 2.14, 3.148, 547.54 };
		int[] i1 = { 1, 2, 3, 547 };
		m1.run(i1);
		m1.walk(d1);
	}
}
