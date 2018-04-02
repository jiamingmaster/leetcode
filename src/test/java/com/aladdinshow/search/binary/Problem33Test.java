package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class Problem33Test {

	private Problem33 p;

	@After
	public void tearDown() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		p = new Problem33();
	}

	@Test
	public void test1() {
		int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
		int index = p.search(nums, 3);
		Assert.assertEquals(7,index);
	}

	@Test
	public void test2() {
		int[] nums = {3,4,1};
		int index = p.search(nums, 3);
		Assert.assertEquals(0,index);
	}

	@Test
	public void test3(){
		int[] nums = {1,3,5};
		int index = p.search(nums, 1);
		Assert.assertEquals(0,index);
	}

	@Test
	public void test4(){
		int[] nums = {3,5,1};
		int index = p.search(nums, 3);
		Assert.assertEquals(0,index);
	}
}
