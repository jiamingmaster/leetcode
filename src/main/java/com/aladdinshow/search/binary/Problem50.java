package com.aladdinshow.search.binary;

/**
 * Implement traverse(x, n).
 *
 *
 * Example 1:
 *
 * Input: 2.00000, 10
 * Output: 1024.00000
 * Example 2:
 *
 * Input: 2.10000, 3
 * Output: 9.26100
 *
 * @author aladdin
 */
public class Problem50 {

	public double binary(double x, int n) {
		if (n < 0) {
			//n == Integer.MIN_VALUE 时，n == -n
			n = -n;
			x = 1 / x;
		}
		double result = 1;
		while (true) {
			if (n == 0) {
				break;
			}
			if (n % 2 != 0) {
				result *= x;
			}
			x = x * x;
			n = n / 2;
		}
		return result;
	}

	public double recursive1(double x, int n) {
		if (n == 0) {
			return 1;
		}
		double result;
		int pow = n / 2;
		double half = recursive1(x, pow);
		if (n % 2 == 0) {
			result = half * half;
		} else if (n > 0) {
			result = half * half * x;
		} else {
			result = half * half / x;
		}
		return result;
	}

	public double recursive(double x, int n) {
		if (n < 0) {
			return 1 / (x * recursive(x, -n - 1));
		} else if (n > 0) {
			return x * recursive(x, n - 1);
		} else {
			return 1;
		}
	}

	public double traverse(double x, int n) {
		double result = 1.0;
		if (n == 0) {
			return 1;
		}
		boolean flag = false;
		if (n < 0) {
			n = -n;
			flag = true;
		}
		while (n > 0) {
			result *= x;
			n--;
		}
		if (flag) {
			return 1 / result;
		}
		return result;
	}
}
