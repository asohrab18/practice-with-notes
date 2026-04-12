package com.learning.zenith.leetcode.preparation.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Leetcode Problem: 242 */
public class ValidAnagram {

	/** This is my logic by brute force but not optimized. */
	public static boolean isAnagramUsingList(String s, String t) {
		if (s == null || t == null) {
			return false;
		}
		char[] chArray1 = s.toCharArray();

		List<Character> chList1 = new ArrayList<>();

		for (char c : chArray1) {
			chList1.add(c);
		}

		char[] chArray2 = t.toCharArray();

		List<Character> chList2 = new ArrayList<>();

		for (char c : chArray2) {
			chList2.add(c);
		}
		Collections.sort(chList1);
		Collections.sort(chList2);
		return chList1.equals(chList2);
	}

	/**
	 * This is ChatGpt's optimized logic applicable for strings having only
	 * alphabets in small letters.
	 */
	public static boolean isAnagramUsingArray(String s, String t) {
		if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() != t.length()) {
			return false;
		}

		int[] countArray = new int[26];

		for (int i = 0; i < s.length(); i++) {
			countArray[s.charAt(i) - 'a']++;
			countArray[t.charAt(i) - 'a']--;
		}

		for (int c : countArray) {
			if (c != 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * This is ChatGpt's optimized universal logic applicable for all types of
	 * strings (case insensitive).
	 */
	public static boolean isAnagramUsingMap(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		s = s.toLowerCase();
		t = t.toLowerCase();

		Map<Character, Integer> characterFrequencyMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (!characterFrequencyMap.containsKey(ch)) {
				return false;
			}
			characterFrequencyMap.put(ch, characterFrequencyMap.get(ch) - 1);

			if (characterFrequencyMap.get(ch) == 0) {
				characterFrequencyMap.remove(ch);
			}

		}

		return characterFrequencyMap.isEmpty();
	}

	public static void main(String[] args) {
		String s = "aacc", t = "ccac";
		boolean anagram = isAnagramUsingMap(s, t);
		System.out.println(anagram);
	}

}
