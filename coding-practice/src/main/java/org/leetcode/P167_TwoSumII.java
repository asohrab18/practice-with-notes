package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P167_TwoSumII {

	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> dataMap = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			int item = numbers[i];
			int composite = target - item;

			if (dataMap.containsKey(composite)) {
				int[] resultArr = new int[2];
				resultArr[0] = dataMap.get(composite) + 1;
				resultArr[1] = i + 1;
				return resultArr;
			}
			
			dataMap.put(item, i);
		}

		return null;
	}

	public static void main(String[] args) {
		P167_TwoSumII p = new P167_TwoSumII();

		int[] nums = { 2, 3, 4 };
		int target = 6;
		int[] result = p.twoSum(nums, target);
		if (result != null) {
			for (int i = 0; i < result.length; i++) {
				System.out.println("index = " + result[i]);
			}
		}
	}

}
