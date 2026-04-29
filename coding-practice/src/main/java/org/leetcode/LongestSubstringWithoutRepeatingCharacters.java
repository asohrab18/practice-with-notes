package org.leetcode;

import java.util.HashMap;
import java.util.Map;

/** Leetcode Problem: 3 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "pwwkew";
		String longestSubstring = getLongestSubstring(s);
		System.out.println("Longest Substring:" + longestSubstring);
		System.out.println("Length of Longest Substring = " + longestSubstring.length());
	}

	/** I implemented with the help of ChatGpt. */
	public static String getLongestSubstring(String s) {
		Map<Character, Integer> charIndexMap = new HashMap<>();

		int leftIndex = 0, maximumLength = 0, startIndex = 0;

		for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {
			char ch = s.charAt(currentIndex);

			if (charIndexMap.containsKey(ch)) {
				leftIndex = Math.max(leftIndex, charIndexMap.get(ch) + 1);
			}

			charIndexMap.put(ch, currentIndex);

			int lengthOfSubstring = currentIndex - leftIndex + 1;

			if (lengthOfSubstring > maximumLength) {
				maximumLength = lengthOfSubstring;
				startIndex = leftIndex;
			}
		}

		return s.substring(startIndex, startIndex + maximumLength);
	}

	/** Solution by ChatGpt */
	public static int lengthOfLongestSubstring(String s) {

		int leftIndex = 0, maximumLength = 0;

		Map<Character, Integer> charIndexMap = new HashMap<>();

		for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {
			char ch = s.charAt(currentIndex);

			if (charIndexMap.containsKey(ch)) {
				leftIndex = Math.max(leftIndex, charIndexMap.get(ch) + 1);
			}

			charIndexMap.put(ch, currentIndex);

			int lengthOfSubstring = currentIndex - leftIndex + 1;
			maximumLength = Math.max(maximumLength, lengthOfSubstring);
		}

		return maximumLength;
	}

}
