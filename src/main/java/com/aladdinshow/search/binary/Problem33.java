package com.aladdinshow.search.binary;

/**
 * Search in Rotated Sorted Array
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 *
 * {@link Problem81}
 * @author aladdin
 */
public class Problem33 {

	public static void main(String[] args) {
		int[] nums = {1, 3, 5};
		Problem33 p = new Problem33();
		System.out.println(p.search(nums, 1));
	}

	/**
	 * The idea is that when rotating the array,
	 * there must be one half of the array that is still in sorted order.
	 * For example, 6 7 1 2 3 4 5, the order is disrupted from the point between 7 and 1.
	 * So when doing binary search, we can make a judgement that which part
	 * is ordered and whether the target is in that range,
	 * if yes, continue the search in that half, if not continue in the other half.
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[start] <= nums[mid]) {
				if (target >= nums[start] && target < nums[mid]) {
					end = mid;
				} else {
					start = mid;
				}
			}
			if (nums[mid] <= nums[end]) {
				if (target > nums[mid] && target <= nums[end]) {
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		if (nums[start] == target) {
			return start;
		}
		if (nums[end] == target) {
			return end;
		}
		return -1;
	}

	public int search1(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			//从左边查找
			if (nums[start] <= nums[mid]) {
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				//从右边查找
				if (nums[mid] <= target && target <= nums[end]) {
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		if (nums[start] == target) {
			return start;
		}
		if (nums[end] == target) {
			return end;
		}
		return -1;
	}
}
