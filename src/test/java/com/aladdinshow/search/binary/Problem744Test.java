package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem744Test {

	Problem744 p;

	@Before
	public void setUp() throws Exception {
		p = new Problem744();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('c', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('c', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('c', result);
	}

	@Test
	public void test2() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'c';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('f', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('f', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('f', result);
	}

	@Test
	public void test3() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'd';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('f', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('f', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('f', result);
	}

	@Test
	public void test4() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'g';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('j', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('j', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('j', result);
	}

	@Test
	public void test5() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'k';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('c', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('c', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('c', result);
	}

	@Test
	public void test6() {
		char[] letters = {'a', 'z'};
		char target = 'a';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('z', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('z', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('z', result);
	}

	@Test
	public void test7() {
		char[] letters = {'a', 'z'};
		char target = 'd';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('z', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('z', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('z', result);
	}

	@Test
	public void test8() {
		char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
		char target = 'e';
		char result = p.binarySearch(letters, target);
		Assert.assertEquals('n', result);
		result = p.recordSeen(letters, target);
		Assert.assertEquals('n', result);
		result = p.traverse(letters, target);
		Assert.assertEquals('n', result);
	}
}