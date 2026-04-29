package org.leetcode;

/** Leetcode Problem: 11 */
public class ContainerWithMostWater {

	/** This is ChatGpt's optimized logic. I understand it. */
	public static int maxArea(int[] heightArray) {
		int leftIndex = 0;
		int rightIndex = heightArray.length - 1;
		int maximumArea = 0;

		while (leftIndex < rightIndex) {
			int width = rightIndex - leftIndex;

			int leftHeight = heightArray[leftIndex];
			int rightHeight = heightArray[rightIndex];

			int minimumHeight = Math.min(leftHeight, rightHeight);

			int area = width * minimumHeight;

			maximumArea = Math.max(maximumArea, area);

			if (leftHeight < rightHeight) {
				leftIndex++;
			} else {
				rightIndex--;
			}
		}

		return maximumArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height));
	}

}
