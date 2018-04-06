package com.aladdinshow.search.binary;

/**
 * Given a positive integer num,
 * write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Returns: True
 * Example 2:
 *
 * Input: 14
 * Returns: False
 *
 * @author aladdin
 */
public class Problem367 {

	/**
	 * @param num
	 * @return
	 */
	public boolean isPerfectSquare(int num) {
		if (num <= 4) {
			return num == 0 || num == 1 || num == 4;
		}
		int start = 0;
		// n > 4 时， x^2 = n -> x < n/2
		int end = num / 2;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (mid == num / mid) {
				if (num % mid == 0) {
					return true;
				} else {
					return false;
				}
			} else if (mid > num / mid) {
				end = mid;
			} else {
				start = mid;
			}
		}
		return false;
	}

	/**
	 * 牛顿法
	 *
	 * @param num
	 * @return
	 */
	public boolean newtonMethod(int num) {
		long x = num;
		while (x * x > num) {
			x = (x + num / x) >> 1;
		}
		return x * x == num;
	}

	/**
	 * 使用斐波那契数列解题
	 *
	 * @param num
	 * @return
	 */
	public boolean fibonacci(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}
}
