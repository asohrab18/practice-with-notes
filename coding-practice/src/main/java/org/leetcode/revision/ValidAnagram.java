package org.leetcode.revision;

import java.util.HashMap;
import java.util.Map;

/** Leetcode Problem: 242 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);

			if (!frequencyMap.containsKey(ch)) {
				return false;
			}

			frequencyMap.put(ch, frequencyMap.get(ch) - 1);

			if (frequencyMap.get(ch) == 0) {
				frequencyMap.remove(ch);
			}
		}

		return frequencyMap.isEmpty();
	}

	public static void main(String[] args) {
		String s = "rat", t = "cat";
		boolean anagram = new ValidAnagram().isAnagram(s, t);
		System.out.println(anagram ? "Anagram" : "Not Anagram");
	}
}
