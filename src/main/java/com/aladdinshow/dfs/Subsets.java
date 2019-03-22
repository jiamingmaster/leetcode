package com.aladdinshow.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
//		int[] nums = {1, 9, 2, 4, 6, 7, 3, 0, 8, 5};
		int[] nums = {1, 9};
		Subsets subsets = new Subsets();
		List<List<Integer>> results = subsets.solution(nums);
	}

	public List<List<Integer>> solution(int[] nums) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			results.add(new ArrayList<Integer>());
			return results;
		}

		Arrays.sort(nums);
		helper(new ArrayList<Integer>(), nums, 0, results);
		return results;
	}

	//递归三要素
	//1.递归的定义：在Nums中找到所有以subset开头的集合，并放到results中
	private void helper(ArrayList<Integer> subset,
						int[] nums,
						int startIndex,
						List<List<Integer>> results) {
		//2.递归的拆解
		//deep copy
		//results.add(subset)
		results.add(new ArrayList<Integer>(subset));

		for (int i = startIndex; i < nums.length; i++) {
			//[1] -> [1,2]
			subset.add(nums[i]);
			//寻找所有以[1,2]开头的集合，并扔到results
			helper(subset, nums, i + 1, results);
			subset.remove(subset.size() - 1);
		}
		//3.递归的出口
		//return;
	}
}
