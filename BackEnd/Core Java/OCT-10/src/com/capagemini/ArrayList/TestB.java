package com.capagemini.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestB {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add('D');
		a.add('E');
		a.add('A');
		a.add('Z');
		System.out.println("Before------------------>"+a);
		Collections.sort(a);
		System.out.println("After------------------->"+a);
	}
}
