package org.leetcode;

import java.util.Stack;

/** Leetcode Problem: 20 */
public class ValidParentheses {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char charInput = ch[i];

			if (!stack.isEmpty()) {
				char charFromTopOfStack = stack.peek();

				boolean condition1 = charFromTopOfStack == '(' && charInput == ')';
				boolean condition2 = charFromTopOfStack == '[' && charInput == ']';
				boolean condition3 = charFromTopOfStack == '{' && charInput == '}';

				if (condition1 || condition2 || condition3) {
					stack.pop();
					continue;
				}
			}
			stack.push(charInput);

		}

		return stack.empty();
	}

	public static void main(String[] args) {
		String input = "([])";
		System.out.println(isValid(input) ? "Valid Input" : "Invalid Input");
	}

}
