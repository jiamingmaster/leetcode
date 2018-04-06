package com.aladdinshow.search.binary;

/**
 * Given a list of sorted characters letters containing only lowercase letters,
 * and given a target letter target,
 * find the smallest element in the list that is larger than the given target.
 *
 * Letters also wrap around. For example,
 * if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 *
 * Examples:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "g"
 * Output: "j"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "j"
 * Output: "c"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 *
 * Note:
 * letters has a length in range [2, 10000].
 * letters consists of lowercase letters, and contains at least 2 unique letters.
 * target is a lowercase letter.
 *
 * @author aladdin
 */
public class Problem744 {

	public char recordSeen(char[] letters, char target) {
		boolean[] seen = new boolean[26];
		for (char c : letters) {
			seen[c - 'a'] = true;
		}
		while (true) {
			target++;
			if (target > 'z') {
				target = 'a';
			}
			if (seen[target - 'a']){
				return target;
			}
		}
	}

	public char traverse(char[] letters, char target) {
		for (char c : letters) {
			if (c > target) {
				return c;
			}
		}
		return letters[0];
	}

	public char binarySearch(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (target == letters[mid]) {
				start = mid;
			} else if (target > letters[mid]) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (letters[start] > target) {
			return letters[start];
		}
		if (letters[end] > target) {
			return letters[end];
		}
		return letters[0];
	}
}
