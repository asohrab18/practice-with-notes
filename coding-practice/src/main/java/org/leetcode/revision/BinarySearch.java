package org.leetcode.revision;

/** Leetcode Problem: 704 */
public class BinarySearch {

	public static int getIndexOfTarget(int[] nums, int target) {
		int startIndex = 0;
		int endIndex = nums.length - 1;

		while (startIndex <= endIndex) {
			int midIndex = startIndex + (endIndex - startIndex) / 2;
			int midElement = nums[midIndex];

			if (midElement == target) {
				return midIndex;
			}

			if (midElement < target) {
				startIndex = midIndex + 1;
			} else if (midElement > target) {
				endIndex = midIndex - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 6, 7, 8, 9 };
		int target = 50;

		int indexOfTarget = getIndexOfTarget(nums, target);
		System.out.println("Target = " + target + "\nIndex of Target = " + indexOfTarget);
	}

}
