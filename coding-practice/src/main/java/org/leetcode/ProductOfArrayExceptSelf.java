package org.leetcode;

/** Leetcode Problem: 238 */
public class ProductOfArrayExceptSelf {

	// Copied from ChatGpt
	public static int[] productExceptSelf(int[] nums) {
		int size = nums.length;
		int answer[] = new int[size];

		int leftProduct = 1;
		for (int i = 0; i < nums.length; i++) {
			answer[i] = leftProduct;
			leftProduct = leftProduct * nums[i];
		}

		int rightProduct = 1;
		for (int i = size - 1; i >= 0; i--) {
			answer[i] = answer[i] * rightProduct;
			rightProduct = rightProduct * nums[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 3, 4, 5 };
		int answer[] = productExceptSelf(nums);

		for (int i : answer) {
			System.out.println(i);
		}
	}

	public int[] productExceptSelfByBruteForce(int[] nums) {
		int size = nums.length;
		int answer[] = new int[size];

		for (int i = 0; i < size; i++) {
			int mult = 1;
			for (int j = 0; j < size; j++) {
				if (j != i) {
					mult = mult * nums[j];
				}
			}
			answer[i] = mult;
		}
		return answer;
	}

}
