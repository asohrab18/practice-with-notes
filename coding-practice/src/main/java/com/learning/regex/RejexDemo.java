package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexDemo {

	// 1. A string must contain exactly 5 digits.
	public static boolean isValidWithExactly5Digits_V1(String input) {
		String regex = "\\d{5}";
		return input.matches(regex);
	}

	public static boolean isValidWithExactly5Digits_V2(String input) {
		String regex = "\\d{5}";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(input);

		return matcher.matches();
	}

	public static void isValid(String input) {
		String regex = "\\d{3}";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(input);

		// Attempts to match the entire region against the pattern.
		boolean m = matcher.matches();
		System.out.println(m);

		// Attempts to find the next subsequence of the input that matches the pattern.
		boolean f = matcher.find();
		System.out.println(f);

		// Attempts to match the input sequence, starting at the beginning of the
		// region, against the pattern.
		boolean l = matcher.lookingAt();
		System.out.println(l);
	}

	public static void isValidWithOneOrMoreDigits(String input) {
		String regex = "\\d+";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(input);

		boolean f = matcher.find();
		System.out.println(f);

		boolean l = matcher.lookingAt();
		System.out.println(l);

		boolean m = matcher.matches();
		System.out.println(m);
	}

	public static void extractNumbers(String input) {
		String regex = "\\d+";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(input);

		while (matcher.find()) {
			// Returns the input subsequence matched by the previous match.
			String g = matcher.group();
			System.out.println(g);
		}

	}

	public static void main(String[] args) {
		// System.out.println(isValidWithExactly5Digits_V1("12345"));
		// System.out.println(isValidWithExactly5Digits_V2("12345"));
		// isValid("9998abc123def");
		// isValidWithOneOrMoreDigits("123");
		extractNumbers("Order123#Product456TESTING@789");
	}

}
