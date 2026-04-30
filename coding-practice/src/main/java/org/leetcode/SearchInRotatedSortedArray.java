package org.leetcode;

/** Leetcode Problem: 33 */
public class SearchInRotatedSortedArray {

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			// Left half is sorted
			if (nums[start] <= nums[mid]) {
				if (nums[start] <= target && target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			else {// Right half is sorted
				if (nums[mid] < target && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1 };
		int target = 1;

		int result = search(nums, target);
		System.out.println(target + " is at index = " + result);
	}

}
