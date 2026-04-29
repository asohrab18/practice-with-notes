package org.leetcode;

import java.util.Comparator;
import java.util.Stack;

/**
 * Leetcode Problem: 155: I created this by brute force and it is working fine
 * but getMin() has time complexity = O(n) 
 * because it checks all the stack elements one by one for minimum value.
 */
public class MinStackByBruteForce {

	Stack<Integer> stack = null;

	public MinStackByBruteForce() {
		stack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
	}

	public void pop() {
		if (!stack.isEmpty()) {
			stack.pop();
		}
	}

	public int top() {
		if (!stack.isEmpty()) {
			return stack.peek();
		}
		return 0;
	}

	public int getMin() {
		if (!stack.isEmpty()) {
			return stack.stream().min(Comparator.naturalOrder()).get();
		}
		return 0;
	}

	public static void main(String[] args) {
		MinStackByBruteForce minStack = new MinStackByBruteForce();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);

		int min1 = minStack.getMin(); // return -3
		System.out.println("min1 = " + min1);

		minStack.pop();

		int top = minStack.top(); // return 0
		System.out.println("top = " + top);

		int min2 = minStack.getMin(); // return -2
		System.out.println("min2 = " + min2);
	}
}
