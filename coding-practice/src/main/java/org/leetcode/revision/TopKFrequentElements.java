package org.leetcode.revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Leetcode Problem: 347 */
public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> freqMap = new HashMap<>();

		for (int i : nums) {
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freqMap.entrySet());

		entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		int[] resultArr = new int[k];

		for (int i = 0; i < k; i++) {
			resultArr[i] = entries.get(i).getKey();
		}

		return resultArr;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 1, -1, 2, -1, 2, 3 };
		int k = 2;
		int[] result = new TopKFrequentElements().topKFrequent(nums, k);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
