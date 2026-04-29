package org.leetcode;

/** Leetcode Problem: 704 */
public class BinarySearch {

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 3, 5, 9, 12 };
		int target = 5;

		int result = search(nums, target);
		System.out.println(target + " is at index = " + result);
	}

}
