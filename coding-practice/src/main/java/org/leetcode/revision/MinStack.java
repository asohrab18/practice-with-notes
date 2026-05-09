package org.leetcode.revision;

import java.util.Stack;

public class MinStack {

	Stack<Integer> inputStack;
	Stack<Integer> minimumValueStack;

	public MinStack() {
		inputStack = new Stack<>();
		minimumValueStack = new Stack<>();
	}

	void push(int val) {
		inputStack.push(val);
		if (minimumValueStack.isEmpty() || minimumValueStack.peek() >= val) {
			minimumValueStack.push(val);
		}
	}

	void pop() {
		if (!inputStack.isEmpty()) {

			if (!minimumValueStack.isEmpty() && minimumValueStack.peek().equals(inputStack.peek())) {
				minimumValueStack.pop();
			}

			inputStack.pop();
		}
	}

	int top() {
		if (!inputStack.isEmpty()) {
			return inputStack.peek();
		}
		return 0;
	}

	int getMin() {
		if (!minimumValueStack.isEmpty()) {
			return minimumValueStack.peek();
		}

		return 0;
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(10);
		minStack.push(15);
		minStack.push(20);
		minStack.push(100);
		minStack.push(12);
		minStack.push(6);
		System.out.println("Initially, top element = " + minStack.top());
		//minStack.pop();
		System.out.println("Finally, top element = " + minStack.top());
		System.out.println("Minimum element = " + minStack.getMin());

	}

}
