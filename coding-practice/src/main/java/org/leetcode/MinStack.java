package org.leetcode;

import java.util.Stack;

/**
 * Leetcode Problem: 155: Solution by ChatGpt. It has time complexity =
 * O(1)
 */
public class MinStack {

	Stack<Integer> inputStack;
	Stack<Integer> minValueStack;

	public MinStack() {
		inputStack = new Stack<>();
		minValueStack = new Stack<>();
	}

	public void push(int val) {
		inputStack.push(val);

		if (minValueStack.isEmpty() || minValueStack.peek() >= val) {
			minValueStack.push(val);
		}

	}

	public void pop() {
		if (!inputStack.isEmpty()) {
			if (!minValueStack.isEmpty() && minValueStack.peek().equals(inputStack.peek())) {
				minValueStack.pop();
			}
			inputStack.pop();
		}
	}

	public int top() {
		if (!inputStack.isEmpty()) {
			return inputStack.peek();
		}
		return 0;
	}

	public int getMin() {
		if (!minValueStack.isEmpty()) {
			return minValueStack.peek();
		}
		return 0;
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
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
