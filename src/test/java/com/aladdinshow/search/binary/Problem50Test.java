package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem50Test {

	private Problem50 p;

	@Before
	public void setUp() throws Exception {
		p = new Problem50();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		double result = p.traverse(2.0, 10);
		Assert.assertEquals(1024.0, result, 0);
		result = p.recursive(2.0, 10);
		Assert.assertEquals(1024.0, result, 0);
		result = p.recursive1(2.0, 10);
		Assert.assertEquals(1024.0, result, 0);
		result = p.binary(2.0, 10);
		Assert.assertEquals(1024.0, result, 0);
	}

	@Test
	public void test2() {
		double result = p.traverse(2.10000, 3);
		Assert.assertEquals(9.26100, result, 0.001);
		result = p.recursive(2.10000, 3);
		Assert.assertEquals(9.26100, result, 0.001);
		result = p.recursive1(2.10000, 3);
		Assert.assertEquals(9.26100, result, 0.001);
		result = p.binary(2.10000, 3);
		Assert.assertEquals(9.26100, result, 0.001);
	}

	@Test
	public void test3() {
		double result = p.traverse(34.00515, -3);
		System.out.println(result);
		System.out.println(3e-05);
		Assert.assertEquals(3e-05, result, 0.001);
		result = p.recursive(34.00515, -3);
		Assert.assertEquals(3e-05, result, 0.001);
		result = p.recursive1(34.00515, -3);
		Assert.assertEquals(3e-05, result, 0.001);
		result = p.binary(34.00515, -3);
		Assert.assertEquals(3e-05, result, 0.001);
	}

	@Test
	public void test4() {
		double result = p.recursive1(0.000001, Integer.MAX_VALUE);
		System.out.println(result);
		Assert.assertEquals(0.0, result, 0.001);
		result = p.binary(0.000001, Integer.MAX_VALUE);
		System.out.println(result);
		Assert.assertEquals(0.0, result, 0.001);
	}

	@Test
	public void test5() {
		double result = p.recursive1(2.0, Integer.MIN_VALUE);
		System.out.println(result);
		Assert.assertEquals(0.0, result, 0.001);
		result = p.binary(2.0, Integer.MIN_VALUE);
		System.out.println(result);
		Assert.assertEquals(0.0, result, 0.001);
	}

	@Test
	public void test6() {
		double result = p.recursive1(-1.0, Integer.MIN_VALUE);
		System.out.println(result);
		Assert.assertEquals(1.0, result, 0.001);
		result = p.binary(-1.0, Integer.MIN_VALUE);
		System.out.println(result);
		Assert.assertEquals(1.0, result, 0.001);
	}
}