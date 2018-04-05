package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem34Test {

	private Problem34 p;

	@Before
	public void setUp() throws Exception {
		p = new Problem34();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] nums = {1, 2, 2, 3, 4, 5, 6, 6, 6, 6, 7};
		int[] result = p.traverse(nums, 6);
		Assert.assertArrayEquals(new int[]{6, 9}, result);
		result = p.binarySearch(nums,6);
		Assert.assertArrayEquals(new int[]{6, 9}, result);
	}

	@Test
	public void test1(){
		int[] nums = {1,1,1,2,3,3,4};
		int[] result = p.traverse(nums, 6);
		Assert.assertArrayEquals(new int[]{-1, -1}, result);
		result = p.binarySearch(nums,6);
		Assert.assertArrayEquals(new int[]{-1, -1}, result);
	}

	@Test
	public void test2(){
		int[] nums = {1,2,3,3,4};
		int[] result = p.traverse(nums, 1);
		Assert.assertArrayEquals(new int[]{0, 0}, result);
		result = p.binarySearch(nums,1);
		Assert.assertArrayEquals(new int[]{0, 0}, result);
	}

	@Test
	public void test3(){
		int[] nums = {1};
		int[] result = p.traverse(nums, 1);
		Assert.assertArrayEquals(new int[]{0, 0}, result);
		result = p.binarySearch(nums,1);
		Assert.assertArrayEquals(new int[]{0, 0}, result);
	}

	@Test
	public void test4() {
		int[] nums = {1, 2, 2, 3, 4, 5, 6, 6, 6, 6};
		int[] result = p.traverse(nums, 6);
		Assert.assertArrayEquals(new int[]{6, 9}, result);
		result = p.binarySearch(nums,6);
		Assert.assertArrayEquals(new int[]{6, 9}, result);
	}

	@Test
	public void test5() {
		int[] nums = {1, 2, 2, 3, 4, 5, 6};
		int[] result = p.traverse(nums, 6);
		Assert.assertArrayEquals(new int[]{6, 6}, result);
		result = p.binarySearch(nums,6);
		Assert.assertArrayEquals(new int[]{6, 6}, result);
	}

}