package org.leetcode;

public class P125_ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();

		StringBuilder sbd = new StringBuilder(s);
		String reverseStr = sbd.reverse().toString();

		return reverseStr.equals(s);
	}

	public static void main(String[] args) {
		P125_ValidPalindrome p = new P125_ValidPalindrome();
		String input = "MALAYALAM";
		System.out.println(p.isPalindrome(input) ? "Valid Palindrome." : "Not a palindrome.");
	}

}
