package com.aladdinshow.search.binary;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * Find the minimum element.
 *
 * You may assume no duplicate exists in the array.
 *
 * @author aladdin
 */
public class Problem153 {

	/**
	 * 二分查找
	 *
	 * @param nums
	 * @return
	 */
	public int binarySearch(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[start] < nums[mid]) {
				if (nums[start] > nums[end]) {
					start = mid;
				} else {
					end = mid;
				}
			}
			if (nums[mid] < nums[end]) {
				end = mid;
			}
		}
		if (nums[start] < nums[end]) {
			return nums[start];
		} else {
			return nums[end];
		}
	}

	/**
	 * 遍历查找
	 *
	 * @param nums
	 * @return
	 */
	public int traverse(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
}
