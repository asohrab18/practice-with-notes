package org.leetcode.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Leetcode Problem: 128 */
public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		//Remove Duplicate Items
		Set<Integer> hs = new HashSet<>();
		for (int num : nums) {
			hs.add(num);
		}

		List<Integer> al = new ArrayList<>(hs);
		
		//Sort Items in ASC order
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
		/*
		 * 1. Input: nums = [0,3,7,2,5,8,4,6,0,1] nums = [0,1,2,3,4,5,6,7,8] Output: 9
		 * 
		 * 
		 * 2. Input: nums = [100,4,200,1,3,2] nums = [1, 2, 3, 4, 100, 200] Output: 4
		 * 
		 * 
		 * 3. Input: nums = [1,0,1,2] nums = [0,1,2] Output: 3
		 * 
		 * 4. Input: nums = [1,100] Output: 1
		 * 
		 */
		int nums[] = { 10, 11, 12, 1, 2, 3, 10, 11, 12, 13 };
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		int len = lcs.longestConsecutive(nums);
		System.out.println(len);

	}

}
