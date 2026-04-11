package com.learning.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
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

	public static boolean isAnagramByChatGptBackup(String s, String t) {
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

	public static boolean isAnagramByChatGpt(String s, String t) {
		int[] demoArray = new int[26];

		for (int i = 0; i < s.length(); i++) {
			System.out.println("s.charAt(i) = " + s.charAt(i));
			System.out.println("t.charAt(i) = " + t.charAt(i));
			System.out.println("=======================================================");
			demoArray[s.charAt(i) - 'a']++;
			demoArray[t.charAt(i) - 'a']--;
		}

		for (int n : demoArray) {
			if (n != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "rams", t = "mars";
		boolean anagram = isAnagramByChatGpt(s, t);
		System.out.println(anagram);
	}

}
