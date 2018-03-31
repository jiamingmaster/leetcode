package com.aladdinshow.search.binary;

import java.util.Random;

/**
 * Guess Number Higher or Lower
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * <p>
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 * <p>
 * -1 : My number is lower
 * 1 : My number is higher
 * 0 : Congrats! You got it!
 * Example:
 * n = 10, I pick 6.
 * <p>
 * Return 6.
 *
 * @author aladdin
 */
public class Problem374 extends GuessGame {

	public static void main(String[] args) {
		Problem374 p = new Problem374();
		System.out.println("picked : " + p.picked());
		int range = p.range();
		int result = p.guessNumber(range);
		System.out.println("result : " + result);
	}

	public int guessNumber(int n) {
		int start = 1;
		int end = n;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			int result = guess(mid);
			if (result == 0) {
				return mid;
			} else if (result == -1) {
				end = mid;
			} else {
				start = mid;
			}
		}
		return guess(start) == 0 ? start : end;
	}

}

class GuessGame {
	private static final int RANGE = 1000;
	private static final int N = new Random().nextInt(RANGE);

	public int guess(int num) {
		if (num == N) {
			return 0;
		} else if (num < N) {
			return 1;
		} else {
			return -1;
		}
	}

	public int range() {
		return RANGE;
	}

	public int picked() {
		return N;
	}
}
