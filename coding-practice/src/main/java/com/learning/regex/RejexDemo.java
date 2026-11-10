package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexDemo {

	public static void main(String[] args) {
		System.out.println("One or more digit:");
		matchesFindLookingAt("abc123xyz", "\\d+");
		System.out.println("________________________________________________");

		System.out.println("Exactly 5 digits:");
		matchesFindLookingAt("12345", "\\d{5}");
		System.out.println("________________________________________________");

		System.out.println("Exactly 3 digits:");
		matchesFindLookingAt("12345", "\\d{3}");
		System.out.println("________________________________________________");

		System.out.println("Extract Numbers:");
		extractNumbers("Order 123, Product 456");
		System.out.println("________________________________________________");
		
		validateUsername("asohrab18");
		System.out.println("________________________________________________");
		
		removeSpecialCharsAndSpace("The man is powerful @123 *&^^%$#@@.");
		System.out.println("________________________________________________");
	}

	public static void matchesFindLookingAt(String input, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);

		// Attempts to find the next subsequence of the input that matches the pattern.
		System.out.println("find: " + m.find());

		// Attempts to match the input sequence, starting at the beginning of the
		// region, against the pattern.
		System.out.println("lookingAt: " + m.lookingAt());

		// Attempts to match the entire region against the pattern.
		System.out.println("matches: " + m.matches());
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

	// Validate a username that contains only lowercase letters and digits.
	// It must have a length between 5 and 12 characters.
	public static void validateUsername(String username) {
		String regex = "[a-z0-9]{5,12}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(username);
		System.out.println(m.matches() ? "Valid Username" : "Invalid Username");
	}
	
	public static void removeSpecialCharsAndSpace(String input) {
		String regex = "[^a-zA-Z0-9]";
		System.out.println(input.replaceAll(regex, ""));
	}
}
