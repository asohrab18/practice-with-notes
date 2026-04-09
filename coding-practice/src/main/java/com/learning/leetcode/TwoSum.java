package com.learning.leetcode;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for (int index = 0; index < nums.length - 1; index++) {
			int firstElement = nums[index];
			for (int i = index + 1; i < nums.length; i++) {
				int nextElement = nums[i];
				int sum = firstElement + nextElement;
				if (sum == target) {
					return new int[] { index, i };
				}
			}
		}
		throw new IllegalArgumentException("No solution found");
	}

	public static void main(String[] args) {
		int[] nums = { 2, 8, 11, 15, 7 };
		int target = 9;
		int[] result = twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println("index = " + result[i]);
		}

	}

}
