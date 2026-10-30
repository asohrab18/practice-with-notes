/**Given an array of integers nums and an integer k, 
 return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
*/
package org.leetcode;

public class P560_SubarraySumEqualsK {

	public int subarraySum(int[] nums, int k) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;

			for (int j = i; j < nums.length; j++) {
				int item = nums[j];

				sum = sum + item;

				if (sum == k) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2, 1, 1, 2, 3, 3, 2, 1 };
		int k = 3;

		P560_SubarraySumEqualsK p = new P560_SubarraySumEqualsK();
		System.out.println(p.subarraySum(nums, k));

	}

}
