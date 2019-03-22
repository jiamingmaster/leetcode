package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumTest {

	private FindMinimum p;

	@Before
	public void setUp() throws Exception {
		p = new FindMinimum();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int[] nums = {1, 1, 2, 3, 4, 4, 5, 6};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test2() {
		int[] nums = {5, 6, 7, 1, 1, 2, 2, 4};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test3() {
		int[] nums = {5, 5};
		int min = p.binarySearch(nums);
		Assert.assertEquals(5, min);
		min = p.traverse(nums);
		Assert.assertEquals(5, min);
	}

	@Test
	public void test4() {
		int[] nums = {5, 6, 7, 7, 1, 1, 2, 3, 4};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test5() {
		int[] nums = {2, 2, 3, 1, 1};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test6() {
		int[] nums = {5, 5, 1, 1, 2, 3, 4};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test7() {
		int[] nums = {3, 3, 1, 3};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

	@Test
	public void test8() {
		int[] nums = {10, 1, 10, 10, 10};
		int min = p.binarySearch(nums);
		Assert.assertEquals(1, min);
		min = p.traverse(nums);
		Assert.assertEquals(1, min);
	}

}