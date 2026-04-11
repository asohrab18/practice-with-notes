package com.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/** This is my logic by brute force but not optimized. */
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

	/** This is ChatGpt's optimized logic. */
	public static int[] twoSumByMap(int[] nums, int target) {

		Map<Integer, Integer> dataMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int element = nums[i];
			int complement = target - element;

			if (dataMap.containsKey(complement)) {
				return new int[] { dataMap.get(complement), i };
			}

			dataMap.put(element, i);
		}

		throw new IllegalArgumentException("no result found.");
	}

	public static void main(String[] args) {
		int[] nums = { 2, 8, 11, 15, 7 };
		int target = 9;
		int[] result = twoSumByMap(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println("index = " + result[i]);
		}

	}

}
