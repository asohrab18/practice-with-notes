package org.leetcode.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Leetcode Problem: 128 */
public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		Set<Integer> hs = new HashSet<>();
		for (int i : nums) {
			hs.add(i);
		}
		System.out.println(hs);
		List<Integer> al = new ArrayList<>(hs);
		Map<Integer, int[]> dm = new HashMap<>();
		int[] res = new int[al.size()];

		int diff = 0;
		for (int i = 0; i < al.size(); i++) {
			if (i == 0) {
				res[i] = al.get(i);
				dm.put(diff, res);
			}
			if (i == 1) {
				res[i] = al.get(i);

				diff = al.get(i) - al.get(i - 1);

				dm.put(diff, res);
			} else {
				res[i] = al.get(i);
				diff = al.get(i) - al.get(i - 1);
				if (dm.containsKey(diff)) {
					dm.put(diff, res);
				}
			}
		}

		System.out.println(dm);
		return 0;
	}

	public static void main(String[] args) {
		/*
		 * 1. Input: nums = [0,3,7,2,5,8,4,6,0,1] nums = [0,1,2,3,4,5,6,7,8] Output: 9
		 * 
		 * 
		 * 2. Input: nums = [100,4,200,1,3,2] nums = [1, 2, 3, 4, 100, 200] Output: 4
		 * 
		 * 
		 * 3. Input: nums = [1,0,1,2] nums = [0,1,2] Output: 3
		 * 
		 */
		int nums[] = { 100, 4, 200, 1, 3, 2 };
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		int len = lcs.longestConsecutive(nums);
		System.out.println(len);

	}

}
