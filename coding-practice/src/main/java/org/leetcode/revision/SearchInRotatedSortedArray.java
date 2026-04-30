package org.leetcode.revision;

/** Leetcode Problem: 33 */
public class SearchInRotatedSortedArray {

	public static int search(int[] nums, int target) {
		int startIndex = 0;
		int endIndex = nums.length - 1;

		while (startIndex <= endIndex) {
			int startElement = nums[startIndex];

			int midIndex = startIndex + (endIndex - startIndex) / 2;
			int middleElement = nums[midIndex];

			int endElement = nums[endIndex];

			if (middleElement == target) {
				return midIndex;
			}

			// left array is sorted
			if (startElement <= middleElement) {
				if (startElement <= target && target < middleElement) {
					endIndex = midIndex - 1;
				} else {
					startIndex = midIndex + 1;
				}

			} else {
				// right array is sorted
				if (middleElement < target && endElement >= target) {
					startIndex = midIndex + 1;
				} else {
					endIndex = midIndex - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int result = search(nums, target);
		System.out.println(target + " is at index = " + result);
	}

}
