package org.leetcode.revision;

public class BinarySearch {

	public static int getIndexOfTarget(int[] nums, int target) {
		int startIndex = 0;
		int endIndex = nums.length - 1;

		while (startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;

			if (nums[midIndex] == target) {
				return midIndex;
			}
			if (nums[midIndex] < target) {
				startIndex = midIndex + 1;
			} else if (nums[midIndex] > target) {
				endIndex = midIndex - 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 6, 7, 8, 9 };
		int target = 9;

		int indexOfTarget = getIndexOfTarget(nums, target);
		System.out.println("Target = " + target + "\nIndex of Target = " + indexOfTarget);
	}

}
