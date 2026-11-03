package org.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P169_MajorityElement {

	public int majorityElement(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int halfLength = nums.length / 2;

		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int i : nums) {
			frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
		}

		Iterator<Map.Entry<Integer, Integer>> itr = frequencyMap.entrySet().iterator();
		while (itr.hasNext()) {

			Map.Entry<Integer, Integer> entry = itr.next();
			if (entry.getValue() > halfLength) {
				return entry.getKey();
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		P169_MajorityElement p = new P169_MajorityElement();
		int[] nums = { 3, 2, 3 };
		System.out.println("Majority Element = " + p.majorityElement(nums));
	}

}
