package com.learning;

public class ReverseString {

	public static String method1(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		return output;
	}

	public static String method2(String input) {
		StringBuffer sbf = new StringBuffer(input);
		return sbf.reverse().toString();
	}

	public static String method3(String input) {
		StringBuilder sbd = new StringBuilder(input);
		return sbd.reverse().toString();
	}

	public static void main(String[] args) {
		String input = "FEED";
		System.out.println("input: " + input);
		System.out.println("output: " + method1(input));
		System.out.println("output: " + method2(input));
		System.out.println("output: " + method3(input));
	}

}
