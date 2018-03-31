package com.aladdinshow.search.binary;

/**
 * 求平方根算法
 * <p>
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 * <p>
 * Example 1:
 * Input: 4
 * Output: 2
 * <p>
 * Example 2:
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we want to return an integer,
 * the decimal part will be truncated.
 *
 * @author aladdin
 */
public class Problem69 {

	public static void main(String[] args) {
		int x = 10;
		int sqrt = binarySearch(x);
		System.out.println(sqrt);
		int sqrt1 = recursion(x);
		System.out.println(sqrt1);
		System.out.println(sqrt * sqrt);
	}

	/**
	 * 0,1,2,3,4,5......x
	 * find the last position n,which n * n <= x
	 *
	 * @param x
	 * @return
	 */
	private static int binarySearch(int x) {
		if (x < 0) {
			return -1;
		}
		if (x < 4) {
			return x == 0 ? 0 : 1;
		}
		int start = 1;
		int end = x;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (mid == x / mid) {
				return mid;
			} else if (mid < x / mid) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (end <= x / end) {
			return end;
		} else {
			return start;
		}
	}

	/**
	 * for any non-negative number N, sqrt(N) = 2/2sqrt(N) =2sqrt(1/4)sqrt(N) = 2sqrt(N/4).
	 * And for the Ns that are not multiple of 4, for example, 9, 25 or 49,
	 * the actual result should be 1+2*sqrt(N/4), because we need to take remainders into account
	 *
	 * @param x
	 * @return
	 */
	private static int recursion(int x) {
		if (x < 4) {
			return x == 0 ? 0 : 1;
		}
		int result = 2 * recursion(x / 4);
		if ((result + 1) <= x / (result + 1)) {
			return result + 1;
		} else {
			return result;
		}
	}
}
