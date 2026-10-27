package org.leetcode.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Leetcode Problem: 128 */
public class P128_LongestConsecutiveSequence {

	// length of the longest consecutive elements sequence
	public int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}

		Set<Integer> numSet = new HashSet<>();
		for (int i : nums) {
			numSet.add(i);
		}

		List<Integer> numList = new ArrayList<>(numSet);
		Collections.sort(numList);

		int longestConsecutiveSequenceLength = 1;
		int currentConsecutiveSequenceLength = 1;

		for (int i = 1; i < numList.size(); i++) {
			int previousItem = numList.get(i - 1);
			int currentItem = numList.get(i);
			long difference = (long) currentItem - previousItem;
			if (difference == 1) {
				currentConsecutiveSequenceLength++;
			} else {
				longestConsecutiveSequenceLength = Math.max(longestConsecutiveSequenceLength,
						currentConsecutiveSequenceLength);
				currentConsecutiveSequenceLength = 1;
			}
		}

		return Math.max(longestConsecutiveSequenceLength, currentConsecutiveSequenceLength);
	}

	public static void main(String[] args) {
		/*
		 * Some Test cases: 1. Input: nums = [0,3,7,2,5,8,4,6,0,1] sorted nums =
		 * [0,1,2,3,4,5,6,7,8] Output: 9
		 * 
		 * 
		 * 2. Input: nums = [100,4,200,1,3,2] sorted nums = [1, 2, 3, 4, 100, 200]
		 * Output: 4
		 * 
		 * 
		 * 3. Input: nums = [1,0,1,2] sorted nums = [0,1,2] Output: 3
		 * 
		 * 4. Input: nums = [1,100] Output: 1
		 * 
		 * 5. Input: nums = [1, 2, 3, 10, 11, 12, 13] Output: 4
		 * 
		 */
		int nums[] = { 1, 0, 1, 2 };
		P128_LongestConsecutiveSequence lcs = new P128_LongestConsecutiveSequence();
		int len = lcs.longestConsecutive(nums);
		System.out.println(len);

	}

}
