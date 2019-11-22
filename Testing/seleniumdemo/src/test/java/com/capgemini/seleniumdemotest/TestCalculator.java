package com.capgemini.seleniumdemotest;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.seleniumdemowebdriver.Calculator;

public class TestCalculator {
	Calculator cal = new Calculator();

	@Test
	public void addTest() {
		int a = 20;
		int b = 10;
		int expected = 10;
		int actual = cal.sub(a, b);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void subTest() {
		int a = 20;
		int b = 10;
		int expected = 30;
		int actual = cal.add(a,b);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void mulTest() {
		int a = 10;
		int b = 20;
		int expected = 30;
		int actual = cal.add(a,b);
		Assert.assertEquals(expected, actual);
	}
}
