package org.leetcode.revision;

import java.util.Stack;

/** Leetcode Problem: 20 */
public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> charStack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char inputChar = s.charAt(i);

			if (!charStack.isEmpty()) {
				char charFromTopOfStack = charStack.peek();
				boolean cond1 = charFromTopOfStack == '(' && inputChar == ')';
				boolean cond2 = charFromTopOfStack == '[' && inputChar == ']';
				boolean cond3 = charFromTopOfStack == '{' && inputChar == '}';

				if (cond1 || cond2 || cond3) {
					charStack.pop();
					continue;
				}
			}
			charStack.push(inputChar);
		}
		return charStack.isEmpty();
	}

	public static void main(String[] args) {
		String input = "([{}])";
		System.out.println(isValid(input) ? "Valid Input" : "Invalid Input");
	}

}
