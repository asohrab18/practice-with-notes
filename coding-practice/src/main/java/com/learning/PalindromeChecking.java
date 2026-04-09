package com.learning;

/** Palindrome is a string which is equivalent to its reverse. */
public class PalindromeChecking {

	public static String method1(String input) {
		String reverse = ReverseString.method1(input);
		return input.equals(reverse) ? "Palindrome" : "Not Palindrome";
	}

	public static String method2(String input) {
		String reverse = ReverseString.method2(input);
		return input.equals(reverse) ? "Palindrome" : "Not Palindrome";
	}

	public static String method3(String input) {
		String reverse = ReverseString.method3(input);
		return input.equals(reverse) ? "Palindrome" : "Not Palindrome";
	}

	public static void main(String[] args) {
		String input = "MALAYALAM";
		System.out.println("input: " + input);
		System.out.println("output: " + method1(input));
		System.out.println("output: " + method2(input));
		System.out.println("output: " + method3(input));
	}

}
