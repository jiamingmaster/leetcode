package com.aladdinshow.search.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem162Test {

    private Problem162 p;

    @Before
    public void setUp() throws Exception {
        p = new Problem162();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        int[] nums = {1, 2};
        int index = p.binarySearch(nums);
        Assert.assertEquals(1, index);
        index = p.traverse(nums);
        Assert.assertEquals(1, index);
        index = p.recursive(nums);
        Assert.assertEquals(1, index);
        index = p.binarySearch2(nums);
        Assert.assertEquals(1, index);
    }

    @Test
    public void test1() {
        int[] nums = {2, 1};
        int index = p.binarySearch(nums);
        Assert.assertEquals(0, index);
        index = p.traverse(nums);
        Assert.assertEquals(0, index);
        index = p.recursive(nums);
        Assert.assertEquals(0, index);
        index = p.binarySearch2(nums);
        Assert.assertEquals(0, index);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 1};
        int index = p.binarySearch(nums);
        Assert.assertEquals(2, index);
        index = p.traverse(nums);
        Assert.assertEquals(2, index);
        index = p.recursive(nums);
        Assert.assertEquals(2, index);
        index = p.binarySearch2(nums);
        Assert.assertEquals(2, index);
    }

    @Test
    public void test3() {
        int[] nums = {8, 2, 3, 1, 5, 3, 2, 4};
        int index = p.binarySearch(nums);
        List<Integer> result = Arrays.asList(2, 4, 7, 0);
        Assert.assertTrue(result.contains(index));
        index = p.traverse(nums);
        Assert.assertTrue(result.contains(index));
        index = p.recursive(nums);
        Assert.assertTrue(result.contains(index));
        index = p.binarySearch2(nums);
        Assert.assertTrue(result.contains(index));
    }

    @Test
    public void test4() {
        int[] nums = {3, 2, 1};
        int index = p.binarySearch(nums);
        Assert.assertEquals(0, index);
        index = p.traverse(nums);
        Assert.assertEquals(0, index);
        index = p.recursive(nums);
        Assert.assertEquals(0, index);
        index = p.binarySearch2(nums);
        Assert.assertEquals(0, index);
    }
}
