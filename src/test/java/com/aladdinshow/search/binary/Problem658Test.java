package com.aladdinshow.search.binary;

import com.alibaba.fastjson.JSON;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem658Test {

	private Problem658 p;

	@Before
	public void setUp() throws Exception {
		p = new Problem658();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5};
		int k = 4;
		int x = 3;
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		List<Integer> result = p.findClosestElements(nums, k, x);
		System.out.println(JSON.toJSONString(result));
		Assert.assertEquals(JSON.toJSONString(expected), JSON.toJSONString(result));
	}

	@Test
	public void test2() {
		int[] nums = {1, 2, 3, 4, 5};
		int k = 4;
		int x = -1;
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		List<Integer> result = p.findClosestElements(nums, k, x);
		System.out.println(JSON.toJSONString(result));
		Assert.assertEquals(JSON.toJSONString(expected), JSON.toJSONString(result));
	}

	@Test
	public void test3() {
		int[] nums = {1};
		int k = 1;
		int x = 1;
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1));
		List<Integer> result = p.findClosestElements(nums, k, x);
		System.out.println(JSON.toJSONString(result));
		Assert.assertEquals(JSON.toJSONString(expected), JSON.toJSONString(result));
	}

	@Test
	public void test4() {
		int[] nums = {0, 0, 1, 2, 3, 3, 4, 7, 7, 8};
		int k = 3;
		int x = 5;
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 3, 4));
		List<Integer> result = p.findClosestElements(nums, k, x);
		System.out.println(JSON.toJSONString(result));
		Assert.assertEquals(JSON.toJSONString(expected), JSON.toJSONString(result));
	}

	@Test
	public void test5() {
		int[] nums = {0, 0, 0, 1, 3, 5, 6, 7, 8, 8};
		int k = 2;
		int x = 2;
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3));
		List<Integer> result = p.findClosestElements(nums, k, x);
		System.out.println(JSON.toJSONString(result));
		Assert.assertEquals(JSON.toJSONString(expected), JSON.toJSONString(result));
	}
}