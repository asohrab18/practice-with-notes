package com.learning.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {

	public static Deque<Integer> getDeque() {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		deque.add(6);

		return deque;
	}

	public static Deque<String> getAlphabetsDeque() {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("A");
		deque.add("B");
		deque.add("C");
		deque.add("D");
		deque.add("E");
		deque.add("F");

		return deque;
	}

	public static void printDeque() {
		Deque<Integer> deque = getDeque();
		System.out.println(deque);
	}

	public static void printAlphabetsDeque() {
		Deque<String> deque = getAlphabetsDeque();
		System.out.println(deque);
	}

	public static void iterateAlphabetsDeque() {
		Deque<String> deque = getAlphabetsDeque();
		Iterator<String> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nReverse iteration:");

		Iterator<String> descItr = deque.descendingIterator();
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}
	}

	public static void iterateDeque() {
		Deque<Integer> deque = getDeque();
		Iterator<Integer> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nReverse iteration:");

		Iterator<Integer> descItr = deque.descendingIterator();
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}
	}

	public static void addElements() {
		Deque<Integer> deque = getDeque();
		System.out.println(deque);

		deque.addFirst(100);
		deque.addLast(99);

		System.out.println(deque);

		deque.offer(21);
		System.out.println(deque);

		deque.offerFirst(55);
		deque.offerLast(33);
		System.out.println(deque);

		deque.push(888);
		System.out.println(deque);
	}

	public static void getElements() {
		Deque<Integer> deque = getDeque();
		System.out.println(deque);

		int first = deque.getFirst();
		System.out.println("First element = " + first);

		int last = deque.getLast();
		System.out.println("Last element = " + last);

		int peekFirst = deque.peekFirst();
		System.out.println("Peek First element = " + peekFirst);

		int peekLast = deque.peekLast();
		System.out.println("Peek Last element = " + peekLast);

		int peek = deque.peek();
		System.out.println("Peek element = " + peek);
	}

	public static void removeElements() {
		Deque<Integer> deque = getDeque();
		System.out.println(deque);

		deque.remove();
		System.out.println(deque);

		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);

		deque.pollFirst();
		deque.pollLast();
		System.out.println(deque);
	}

	public static void main(String[] args) {
		// printDeque();
		// printAlphabetsDeque();
		// iterateDeque();
		// iterateAlphabetsDeque();
		// addElements();
		// getElements();
		removeElements();
	}
}
