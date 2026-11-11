package org.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P26_RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (int i : nums) {
			numSet.add(i);
		}

		List<Integer> numList = new ArrayList<>(numSet);
		Collections.sort(numList);
		int size = numList.size();

		for (int i = 0; i < size; i++) {
			nums[i] = numList.get(i);
		}
		for (int i = size; i < nums.length; i++) {
			nums[i] = 0;
		}

		// Optional to print array
		for (int i : nums) {
			System.out.println(i);
		}

		return size;
	}

	public static void main(String[] args) {
		P26_RemoveDuplicatesFromSortedArray p = new P26_RemoveDuplicatesFromSortedArray();
		int[] nums = { -3, -1, 0, 0, 0, 3, 3 };
		int size = p.removeDuplicates(nums);
		System.out.println("size = " + size);
	}

}
