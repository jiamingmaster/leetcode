package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem153Test {

	private Problem153 p;

	@Before
	public void setUp() throws Exception {
		p = new Problem153();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5, 6};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test2() {
		int[] nums = {5, 4, 3, 2, 1, 6};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test3() {
		int[] nums = {5};
		int min = p.binarySearch(nums);
		Assert.assertEquals(5, min);
		min = p.traverse(nums);
		Assert.assertEquals(5, min);
	}

	@Test
	public void test4() {
		int[] nums = {5, 6, 7, 1, 2, 3, 4};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test5() {
		int[] nums = {2, 3, 1};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test6() {
		int[] nums = {5, 1, 2, 3, 4};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

}