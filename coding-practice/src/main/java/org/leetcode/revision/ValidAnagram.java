package org.leetcode.revision;

import java.util.Arrays;

/** Leetcode Problem: 242 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		if (s.equals("") && t.equals("")) {
			return true;
		}

		char[] sarr = s.toCharArray();
		char[] tarr = t.toCharArray();

		Arrays.sort(sarr);
		Arrays.sort(tarr);

		String s1 = new String(sarr);
		String t1 = new String(tarr);

		return s1.equals(t1);
	}

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		boolean anagram = new ValidAnagram().isAnagram(s, t);
		System.out.println(anagram ? "Anagram" : "Not Anagram");
	}
}
