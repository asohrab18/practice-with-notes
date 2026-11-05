package com.learning.programs;

public class ReverseString {

	public static String reverseManually(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		return output;
	}

	public static String reverseByStringBuffer(String input) {
		StringBuffer sbf = new StringBuffer(input);
		return sbf.reverse().toString();
	}

	public static String reverseByStringBuilder(String input) {
		StringBuilder sbd = new StringBuilder(input);
		return sbd.reverse().toString();
	}

	public static void main(String[] args) {
		String input = "SAMIR";
		System.out.println("input:: " + input);
		System.out.println("output: " + reverseManually(input));
		System.out.println("output: " + reverseByStringBuffer(input));
		System.out.println("output: " + reverseByStringBuilder(input));
	}

}
