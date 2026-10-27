package org.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Leetcode Problem: 128 */
public class P128_LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		// Remove Duplicate Items
		Set<Integer> hs = new HashSet<>();
		for (int num : nums) {
			hs.add(num);
		}

		List<Integer> al = new ArrayList<>(hs);

		// Sort Items in ASC order
		Collections.sort(al);

		int longest = 1;
		int current = 1;

		for (int i = 1; i < al.size(); i++) {
			int item = al.get(i);
			int previousItem = al.get(i - 1);

			int difference = item - previousItem;

			if (difference == 1) {
				current++;

			} else {
				longest = Math.max(longest, current);
				current = 1;
			}
		}

		return Math.max(longest, current);
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 10, 11, 12, 13 };
		P128_LongestConsecutiveSequence lcs = new P128_LongestConsecutiveSequence();
		int len = lcs.longestConsecutive(nums);
		System.out.println(len);
	}

}
