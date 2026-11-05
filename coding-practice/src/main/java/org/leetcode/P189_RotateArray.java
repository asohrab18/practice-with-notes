package org.leetcode;

public class P189_RotateArray {

	public void rotate(int[] nums, int k) {
		System.out.println("Before Rotation=>");
		for (int i : nums) {
			System.out.println(i);
		}

		System.out.println("\n\n==================================================================================");

		for (int shift = 1; shift <= k; shift++) {
			int[] res = getNewArray(nums);
			for (int i = 0; i < res.length; i++) {
				nums[i] = res[i];
			}
		}

		System.out.println("After Rotation=>");
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static int[] getNewArray(int[] nums) {
		int size = nums.length;
		int[] res = new int[size];

		for (int i = 0; i < nums.length; i++) {
			int item = nums[i];
			int nextIndex = i + 1;

			if (nextIndex >= size) {
				nextIndex = nextIndex - size;
				res[nextIndex] = item;
			} else {
				res[nextIndex] = item;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		P189_RotateArray p = new P189_RotateArray();

		int[] nums = { -1, -100, 3, 99 };
		int k = 2;

		p.rotate(nums, k);
	}

}
