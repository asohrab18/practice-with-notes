package com.learning.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1,2,3,4,5,6 };
		boolean duplicate = containsDuplicate(nums);
		System.out.println("duplicate exists?\nANS: " + duplicate);

	}

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
}
