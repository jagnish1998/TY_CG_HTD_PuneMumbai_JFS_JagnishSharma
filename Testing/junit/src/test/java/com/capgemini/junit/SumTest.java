package com.capgemini.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void testSum() {
		Sum s = new Sum();
		int i = s.add(10, 5);
		assertEquals(15,i);
	}
	
	@Test
	public void testAddThree() {
		Sum s = new Sum();
		int i = s.addThree(10,5,5);
		assertEquals(20,i);
	}

}
