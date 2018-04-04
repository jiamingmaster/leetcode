package com.aladdinshow.search.binary;

/**
 * A peak element is an element that is greater than its neighbors.
 * <p>
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * <p>
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * <p>
 * You may imagine that num[-1] = num[n] = -∞.
 * <p>
 * For example, in array [1, 2, 3, 1], 3 is a peak element ,
 * and your function should return the index number 2.
 * <p>
 * https://leetcode.com/problems/find-peak-element/solution/
 *
 * @author aladdin
 */
public class Problem162 {

    /**
     * 二分查找
     *
     * @param nums
     * @return
     */
    public int binarySearch(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            // mid有可能是第一个元素，下标为0
            if (mid - 1 >= 0) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid - 1]) {
                    // nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1] 极小值
                    // nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1] 下降趋势，mid右边有可能一直是下降曲线
                    end = mid;
                } else {
                    //mid右边是上升趋势
                    start = mid;
                }
            } else {
                //mid下标为0
                if (nums[mid] > nums[mid + 1]) {
                    return mid;
                } else {
                    start = mid;
                }
            }
        }
        if (nums[start] < nums[end]) {
            return end;
        } else {
            return start;
        }
    }

    /**
     * 遍历查找
     *
     * @param nums
     * @return
     */
    public int traverse(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }

    /**
     * 递归查找
     *
     * @param nums
     * @return
     */
    public int recursive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return search(nums, 0, nums.length - 1);
    }

    private int search(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return search(nums, start, mid);
        } else {
            return search(nums, mid + 1, end);
        }
    }

    /**
     * 二分查找
     *
     * @param nums
     * @return
     */
    public int binarySearch2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
