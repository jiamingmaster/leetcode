package com.aladdinshow.search.binary;

/**
 * Let's call an array A a mountain if the following properties hold:
 * <p>
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * <p>
 * Example 1:
 * <p>
 * Input: [0,1,0]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [0,2,1,0]
 * Output: 1
 * <p>
 * {@link Problem162}
 *
 * @author aladdin
 * @date 2018/10/18
 */
public class Problem852 {

	public static void main(String[] args) {
		Problem852 p = new Problem852();
		int[] a = {0, 2, 1, 0};
		System.out.println(p.peakIndexInMountainArray(a));
	}

	private int peakIndexInMountainArray(int[] a) {
		//数据最小长度为3，可以忽略null ,length = 0, 1, 2这些特殊情况。
		int start = 0;
		int end = a.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
				return mid;
			} else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
				start = mid;
			} else {
				end = mid;
			}
		}
		return a[start] > a[end] ? start : end;
	}
}
