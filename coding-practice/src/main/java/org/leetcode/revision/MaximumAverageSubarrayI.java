package org.leetcode.revision;

/** Leetcode Problem: 643 */
public class MaximumAverageSubarrayI {

	public static double findMaxAverage(int[] nums, int k) {

		int maximumSum = 0;
		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum = windowSum + nums[i];
		}
		maximumSum = windowSum;

		for (int i = k; i < nums.length; i++) {
			windowSum = windowSum + nums[i] - nums[i - k];
			maximumSum = Math.max(maximumSum, windowSum);
		}

		return (double) maximumSum / k;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 2, 3, 10 };
		int k = 3;
		System.out.println("Max Average = " + findMaxAverage(nums, k));
	}

}
