package com.learning.zenith.leetcode.preparation.interviews;

import java.util.HashSet;
import java.util.Set;

/** Leetcode Problem: 217 */
public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return false;
		}
		Set<Integer> numSet = new HashSet<>();
		for (int n : nums) {
			boolean added = numSet.add(n);
			if (!added) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		boolean duplicate = containsDuplicate(nums);
		System.out.println("duplicate exists?\nANS: " + duplicate);

	}
}
