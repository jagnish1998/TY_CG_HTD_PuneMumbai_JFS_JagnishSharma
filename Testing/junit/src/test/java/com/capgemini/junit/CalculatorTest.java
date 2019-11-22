package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = null;

	@BeforeEach
	public void createObject() {
		calculator = new Calculator();
	}

	@Test
	void testAdd() {
		int i = calculator.add(10, 5);
		assertEquals(15, i);
	}

	@Test
	void testAddForNegative() {
		int i = calculator.add(-10, 5);
		assertEquals(-5, i);
	}

	@Test
	void testMul() {
		Calculator calculator = new Calculator();
		int i = calculator.mul(10, 2);
		assertEquals(20, i);
	}

	@Test
	void testDivForZero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
	}

	@Test
	void testSub() {
		int i = calculator.sub(15, 5);
		assertEquals(10, i);
	}

	@Test
	void testDiv() {
		double i = calculator.div(10, 5);
		assertEquals(2, i);
	}

	@Test
	void testFactForZero() {
		double i = calculator.fact(0);
		assertEquals(1, i);
	}

	@Test
	void testFactForNumber() {
		double i = calculator.fact(5);
		assertEquals(120, i);
	}

	@Test
	void testFactForNegative() {
		double i = calculator.fact(-5);
		assertEquals(1, i);
	}

}
