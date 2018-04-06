package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem367Test {

	private Problem367 p;

	@Before
	public void setUp() throws Exception {
		p = new Problem367();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int num = 4;
		boolean result = p.isPerfectSquare(num);
		Assert.assertTrue(result);
		result = p.newtonMethod(num);
		Assert.assertTrue(result);
		result = p.fibonacci(num);
		Assert.assertTrue(result);
	}

	@Test
	public void test2() {
		int num = 2;
		boolean result = p.isPerfectSquare(num);
		Assert.assertFalse(result);
		result = p.newtonMethod(num);
		Assert.assertFalse(result);
		result = p.fibonacci(num);
		Assert.assertFalse(result);
	}

	@Test
	public void test3() {
		int num = 9;
		boolean result = p.isPerfectSquare(num);
		Assert.assertTrue(result);
		result = p.newtonMethod(num);
		Assert.assertTrue(result);
		result = p.fibonacci(num);
		Assert.assertTrue(result);
	}

	@Test
	public void test4() {
		int num = 15;
		boolean result = p.isPerfectSquare(num);
		Assert.assertFalse(result);
		result = p.newtonMethod(num);
		Assert.assertFalse(result);
		result = p.fibonacci(num);
		Assert.assertFalse(result);
	}

	@Test
	public void test5() {
		int num = Integer.MAX_VALUE;
		boolean result = p.isPerfectSquare(num);
		Assert.assertFalse(result);
		result = p.newtonMethod(num);
		Assert.assertFalse(result);
		result = p.fibonacci(num);
		Assert.assertFalse(result);
	}

	@Test
	public void test6() {
		int num = 681;
		boolean result = p.isPerfectSquare(num);
		Assert.assertFalse(result);
		result = p.newtonMethod(num);
		Assert.assertFalse(result);
		result = p.fibonacci(num);
		Assert.assertFalse(result);
	}

}