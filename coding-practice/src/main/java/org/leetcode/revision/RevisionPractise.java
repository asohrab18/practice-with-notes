package org.leetcode.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RevisionPractise {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int item = nums[i];
			int composite = target - item;

			if (numMap.containsKey(composite)) {
				result[0] = numMap.get(composite);
				result[1] = i;
				return result;

			}

			numMap.put(item, i);

		}
		return result;
	}

	public static void printTwoSum(RevisionPractise rp) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] result = rp.twoSum(nums, target);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return false;
		}

		Set<Integer> numSet = new HashSet<>();
		for (int i : nums) {
			boolean added = numSet.add(i);
			if (!added) {
				return true;
			}
		}

		return false;
	}

	public static void printContainsDuplicate(RevisionPractise rp) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(rp.containsDuplicate(nums) ? "Duplicate elements found." : "No Duplicate element found.");
	}

	public boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}

		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);

		String sf = new String(sArr);
		String tf = new String(tArr);

		return sf.equals(tf);
	}

	public static void printValidAnagram(RevisionPractise rp) {
		String s = "anagram", t = "nagaram";
		System.out.println(rp.isAnagram(s, t) ? "VALID ANAGRAM" : "NOT ANAGRAM");
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> anagrams = new HashMap<>();

		for (String s : strs) {
			String in = s;
			char[] chArr = in.toCharArray();
			Arrays.sort(chArr);
			String key = new String(chArr);

			if (anagrams.containsKey(key)) {
				anagrams.get(key).add(in);

			} else {
				List<String> vals = new ArrayList<>();
				vals.add(in);
				anagrams.put(key, vals);
			}
		}

		return new ArrayList<>(anagrams.values());
	}

	public static void printGroupAnagrams(RevisionPractise rp) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(rp.groupAnagrams(strs));
	}

	public int[] topKFrequent(int[] nums, int k) {
		int[] resArr = new int[k];
		Map<Integer, Integer> freqMap = new HashMap<>();

		for (int i : nums) {
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freqMap.entrySet());
		entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

		for (int i = 0; i < k; i++) {
			resArr[i] = entries.get(i).getKey();
		}

		return resArr;
	}

	public static void printTopKFrequent(RevisionPractise rp) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] resArr = rp.topKFrequent(nums, k);
		for (int i : resArr) {
			System.out.println(i);
		}
	}

	public int[] productExceptSelf(int[] nums) {
		int[] resArr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int product = 1;

			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					product = product * nums[j];
				}
			}

			resArr[i] = product;
		}

		return resArr;
	}

	public static void printProductExceptSelf(RevisionPractise rp) {
		int[] nums = { 1, 2, 3, 4 };
		int[] resArr = rp.productExceptSelf(nums);
		for (int i : resArr) {
			System.out.println(i);
		}
	}

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

		int longestLength = 1;
		int currentLength = 1;

		for (int i = 1; i < numList.size(); i++) {
			int previous = numList.get(i - 1);
			int next = numList.get(i);
			int difference = next - previous;
			if (difference == 1) {
				currentLength++;
			} else {
				longestLength = Math.max(longestLength, currentLength);
				currentLength = 1;
			}
		}

		return Math.max(longestLength, currentLength);
	}

	public static void printLongestConsecutive(RevisionPractise rp) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println(rp.longestConsecutive(nums));
	}

	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int item = nums[i];
			int sum = currentSum + item;
			currentSum = Math.max(sum, item);
			maxSum = Math.max(currentSum, maxSum);
		}

		return maxSum;
	}

	public static void printMaxSubArray(RevisionPractise rp) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(rp.maxSubArray(nums));
	}

	public int subarraySum(int[] nums, int k) {
		if (nums == null) {
			return 0;
		}

		int totalNumberOfSubarrays = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;

			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					totalNumberOfSubarrays++;
				}
			}
		}

		return totalNumberOfSubarrays;
	}

	public static void printSubarraySum(RevisionPractise rp) {
		int[] nums = { 1, 1, 1 };
		int k = 2;
		System.out.println(rp.subarraySum(nums, k));
	}

	public int containerWithMostWater(int[] height) {
		int maxArea = 0;
		int leftIndex = 0;
		int rightIndex = height.length - 1;

		while (leftIndex < rightIndex) {
			int leftHeight = height[leftIndex];
			int rightHeight = height[rightIndex];

			int width = rightIndex - leftIndex;
			int minimumHeight = Math.min(leftHeight, rightHeight);

			int area = width * minimumHeight;
			maxArea = Math.max(maxArea, area);

			if (leftHeight < rightHeight) {
				leftIndex++;
			} else {
				rightIndex--;
			}
		}

		return maxArea;
	}

	public static void printContainerWithMostWater(RevisionPractise rp) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(rp.containerWithMostWater(height));
	}

	public static void main(String[] args) {
		RevisionPractise rp = new RevisionPractise();
		// printTwoSum(rp);
		// printContainsDuplicate(rp);
		// printValidAnagram(rp);
		// printGroupAnagrams(rp);
		// printTopKFrequent(rp);
		// printProductExceptSelf(rp);
		// printLongestConsecutive(rp);
		// printMaxSubArray(rp);
		// printSubarraySum(rp);
		printContainerWithMostWater(rp);

	}

}
