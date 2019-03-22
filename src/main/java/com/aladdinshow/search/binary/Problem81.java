package com.aladdinshow.search.binary;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
 * <p>
 * You are given a target value to search. If found in the array return true, otherwise return false.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 * <p>
 * <p>
 * 本问题中，数据可以重复，无法直接使用二分查找
 * (当nums[mid] nums[start] nums[end]相等时,无法区分左右区间)
 * <p>
 * 最坏情况，时间复杂度为O(n)
 * 最好情况，时间复杂度为O(logn)
 * <p>
 * {@link Problem33}
 *
 * @author aladdin
 * @date 2018/10/18
 */
public class Problem81 {

	public static void main(String[] args) {
		Problem81 p = new Problem81();
		int[] nums = {5, 6, 7, 7, 7, 8, 8, 8, 1, 1, 2, 3, 3, 4, 4};
		System.out.println(p.binarySearch(nums, 9));
	}

	/**
	 * 直接遍历和二分查找相结合
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	private boolean binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int start = 0;
		int end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return true;
			}
			//无法区分，需要start++直接遍历下一个元素
			if (nums[start] == nums[mid]) {
				start++;
			} else if (nums[start] < nums[mid]) {
				//二分
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				//nums[start] > nums[mid]
				if (nums[mid] <= target && target <= nums[end]) {
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		if (nums[start] == target || nums[end] == target) {
			return true;
		}
		return false;
	}

	/**
	 * 从头尾同时遍历，只需要循环nums.length/2次
	 */
	private boolean doubleTraverse(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int mid = nums.length / 2;
		for (int i = 0; i <= mid; i++) {
			if (nums[i] == target || nums[nums.length - 1 - i] == target) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 直接遍历
	 */
	private boolean traverse(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return true;
			}
		}
		return false;
	}
}
