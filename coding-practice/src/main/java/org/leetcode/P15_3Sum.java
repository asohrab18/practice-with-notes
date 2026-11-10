package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15_3Sum {

	// COPIED FROM CHAT GPT

	public static void main(String[] args) {
		P15_3Sum p = new P15_3Sum();

		int[] nums = { -4, -1, -1, 0, 1, 2 };
		List<List<Integer>> resultList = p.threeSum(nums);
		System.out.println(resultList);
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// Step 1: Sort the array
		Arrays.sort(nums);

		// Step 2: Select the first number
		for (int i = 0; i < nums.length - 2; i++) {

			// Skip duplicate first numbers
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = nums.length - 1;

			// Step 3: Apply Two Pointers
			while (left < right) {

				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {

					// Triplet found
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					left++;
					right--;

					// Skip duplicate left values
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

					// Skip duplicate right values
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}

				} else if (sum < 0) {

					// Increase sum
					left++;

				} else {

					// Decrease sum
					right--;
				}
			}
		}

		return result;
	}

}
