package com.aladdinshow.search.binary;

import java.util.Random;

/**
 * You are a product manager and currently leading a team to develop a new product.
 * * Unfortunately, the latest version of your product fails the quality check.
 * * Since each version is developed based on the previous version,
 * * all the versions after a bad version are also bad.
 * * <p>
 * * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * * which causes all the following ones to be bad.
 * * <p>
 * * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * * Implement a function to find the first bad version.
 * * You should minimize the number of calls to the API.
 */
public class Problem278 extends VersionControl {

	public static void main(String[] args) {
		Problem278 p = new Problem278();
		int maxVersion = p.range();
		System.out.println(p.getBadVersion());
		int firstBadVersion = p.getFirstBadVersion(maxVersion);
		System.out.println(firstBadVersion);
	}

	public int getFirstBadVersion(int range) {
		int start = 0;
		int end = range;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (isBadVersion(start)) {
			return start;
		}
		if (isBadVersion(end)) {
			return end;
		}
		return -1;
	}

}

class VersionControl {

	private static final int VERSION = 1000;
	private static final int BAD_VERSION = new Random().nextInt(VERSION);

	public boolean isBadVersion(int version) {
		return version >= BAD_VERSION;
	}

	public int range() {
		return VERSION;
	}

	public int getBadVersion() {
		return BAD_VERSION;
	}
}

