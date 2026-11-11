package org.leetcode;

public class P283_MoveZeroes {

	public void moveZeroes(int[] nums) {
		int index = 0;
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			int element = nums[i];

			if (element != 0) {
				nums[index] = element;
				index++;
			}
		}

		for (int i = index; i < length; i++) {
			nums[i] = 0;
		}
		
		//Optional loop to print
		for (int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}

	}

	public static void main(String[] args) {
		P283_MoveZeroes p = new P283_MoveZeroes();
		int[] nums = { 0, 1, 0, 3, 12 };
		p.moveZeroes(nums);
	}

}
