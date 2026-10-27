package org.leetcode;

public class P53_MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int currentSum = nums[0];// -2
		int maxSum = nums[0];// -2

		for (int i = 1; i < nums.length; i++) {
			int item = nums[i];
			int sum = item + currentSum;

			currentSum = Math.max(item, sum);

			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		P53_MaximumSubarray p = new P53_MaximumSubarray();
		System.out.println("Sum = " + p.maxSubArray(nums));

	}

}
