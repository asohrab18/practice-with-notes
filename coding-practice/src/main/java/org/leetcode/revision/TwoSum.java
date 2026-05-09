package org.leetcode.revision;

import java.util.HashMap;
import java.util.Map;

/** Leetcode Problem: 1 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> dataMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int element = nums[i];
			int composite = target - element;
			if (dataMap.containsKey(composite)) {
				return new int[] { dataMap.get(composite), i };
			}
			dataMap.put(element, i);
		}
		throw new IllegalArgumentException("No result found in input array.");
	}

	public static void main(String[] args) {
		int[] nums = { 2, 8, 11, 15, 7 };
		int target = 9;
		int[] result = new TwoSum().twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println("index = " + result[i]);
		}

	}
}
