package com.aladdinshow.search.binary;

/**
 * Given an array of integers sorted in ascending order,
 * find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * @author aladdin
 */
public class Problem34 {

	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return new int[]{-1, -1};
		}
		int start = 0;
		int end = nums.length - 1;
		int first = -1;
		int last = -1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] < target) {
				start = mid;
			} else if (nums[mid] > target) {
				end = mid;
			} else {
				end = mid;
			}
		}
		if (nums[start] == target) {
			first = start;
		} else if (nums[end] == target) {
			first = end;
		}
		if (first == -1) {
			return new int[]{-1, -1};
		}
		start = first;
		end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] < target) {
				start = mid;
			} else if (nums[mid] > target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (nums[end] == target) {
			last = end;
		} else if (nums[start] == target) {
			last = start;
		}
		return new int[]{first, last};
	}

	public int[] traverse(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return new int[]{-1, -1};
		}
		int start = -1;
		int end = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				if (start == -1) {
					start = i;
					end = i;
				} else {
					end = i;
				}
			}
			if (nums[i] > target) {
				break;
			}
		}
		return new int[]{start, end};
	}

}
