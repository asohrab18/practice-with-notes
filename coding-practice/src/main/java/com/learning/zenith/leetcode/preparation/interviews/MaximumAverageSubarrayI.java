package com.learning.zenith.leetcode.preparation.interviews;

/** Leetcode Problem: 643 */
public class MaximumAverageSubarrayI {

	/** This solution failed in one case. Time Limit Exceeded. */
	public static double findMaxAverageByBruteForce(int[] nums, int k) {
		int maximumSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length - k + 1; i++) {
			int sum = 0;
			for (int j = i; j <= k - 1 + i; j++) {
				sum = sum + nums[j];
			}
			maximumSum = Math.max(maximumSum, sum);
		}

		return (double) maximumSum / k;
	}

	/** This is universal solution provided by ChatGpt. */
	public static double findMaxAverage(int[] nums, int k) {
		int maximumSum = 0;

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum = windowSum + nums[i];
		}
		maximumSum = windowSum;

		for (int i = k; i < nums.length; i++) {
			windowSum = windowSum + nums[i];
			windowSum = windowSum - nums[i - k];

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
