package org.leetcode.revision;

import java.util.HashMap;
import java.util.Map;

/** Leetcode Problem: 1 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> indicesMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int firstNum = nums[i];
			int secondNum = target - firstNum;

			if (indicesMap.containsKey(secondNum)) {
				return new int[] { indicesMap.get(secondNum), i };
			}
			
			indicesMap.put(firstNum, i);
		}
		throw new IllegalArgumentException("No two sum solution found");

	}

	public static void main(String[] args) {
		int[] nums = { 3, 3, 11, 15, 7 };
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + ", " + result[1]);
	}
}
