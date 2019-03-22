package com.aladdinshow.search.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted array, two integers k and x,
 * find the k closest elements to x in the array.
 * The result should also be sorted in ascending order.
 * If there is a tie, the smaller elements are always preferred.
 *
 * Example 1:
 * Input: [1,2,3,4,5], k=4, x=3
 * Output: [1,2,3,4]
 * Example 2:
 * Input: [1,2,3,4,5], k=4, x=-1
 * Output: [1,2,3,4]
 * Note:
 * The value k is positive and will always be smaller than the length of the sorted array.
 * Length of the given array is positive and will not exceed 10^4
 * Absolute value of elements in the array and x will not exceed 10^4
 *
 * @author aladdin
 */
public class Problem658 {

	/**
	 * 二分查找
	 *
	 * @param nums
	 * @param k
	 * @param x
	 * @return
	 */
	public List<Integer> binarySearch(int[] nums, int k, int x) {
		return null;
	}

	public List<Integer> findClosestElements1(int[] arr, int k, int x) {
		//-------- Main idea behind the binary search algorithm ----------//
		// 1) res will be a consecutive subarray of k size
		// 2) say if we need to pick 4 elems, now we r looking at 5 elem n1, n2, n3, n4, n5
		//    we need to compare two ends: diff(x, n1) and diff(x, n5), the number with bigger diff on the end will be eleminated
		//----------------------------------------------------------------//
		// lo and hi: range of all possible start of subarray with size k + 1, so we could compare both ends
		int lo = 0, hi = arr.length - k - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			// for subarray starting at mid with size k+1, we compare element of two ends to eliminate the loser
			if (Math.abs(x - arr[mid]) > Math.abs(x - arr[mid+k])) {
				// arr[mid] is the one further away from x, eliminate range[lo, mid]
				lo = mid + 1;
			} else {
				// arr[mid+k] is the one further away, all [mid, hi] will have simiar situation, elimiate them
				hi = mid - 1;
			}
		}
		// return subarray
		List<Integer> res = new ArrayList<>(k);
		for (int i = 0; i < k; i++) {
			res.add(arr[lo + i]);
		}
		return res;
	}

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		//首先通过二分法从arr中查找x，如果未找到，则返回start 、end 的最终位置
		int start = 0;
		int end = arr.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == x) {
				start = mid;
				end = mid + 1;
			} else if (arr[mid] > x) {
				end = mid;
			} else {
				//arr[mid] < x
				start  = mid;
			}
		}
		List<Integer> result = new ArrayList<>(k);
		int startIndex = 0;
		//确定起始索引位置
		for (int i = 0; i < k; i++) {
			if (start >= 0 && end <= arr.length - 1) {
				if (Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)) {
					startIndex = start;
					start--;
				} else {
					end++;
				}
			} else if (start < 0) {
				end++;
			} else {
				startIndex = start;
				start--;
			}
		}
		for (int i = 0; i < k; i++) {
			result.add(arr[startIndex++]);
		}
		return result;
	}
}
