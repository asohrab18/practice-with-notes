package com.learning.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Java's PriorityQueue does not guarantee sorted iteration or sorted toString()
 * output. It guarantees that the head element has the highest priority
 * according to its natural ordering or supplied comparator. To retrieve
 * elements in priority order, repeatedly call poll().
 */

public class PriorityQueueDemo {

	public static Queue<String> getAlphabetsPriorityQueue() {
		Queue<String> pq = new PriorityQueue<>();
		pq.add("H");
		pq.add("B");
		pq.add("J");
		pq.add("D");
		pq.add("I");
		pq.offer("Z");
		pq.offer("X");
		pq.add("F");
		pq.add("A");
		pq.add("G");
		pq.add("C");
		pq.add("E");

		return pq;
	}

	public static void printAlphabetsPriorityQueue() {
		Queue<String> pq = getAlphabetsPriorityQueue();

		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.element());
		System.out.println("head of this queue = " + pq.peek());

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

	/** Iterator does not traverse in priority order. */
	public static void iterateAlphabetsPriorityQueue() {
		Queue<String> pq = getAlphabetsPriorityQueue();
		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.peek());

		Iterator<String> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static Queue<Integer> getPriorityQueue() {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.add(1);
		pq.add(3);
		pq.add(2);
		pq.add(10);
		pq.add(5);
		pq.offer(7);
		pq.offer(9);
		pq.add(8);
		pq.add(6);

		return pq;
	}

	public static Queue<Integer> getPriorityQueue(Comparator<Integer> comp) {
		Queue<Integer> pq = new PriorityQueue<>(comp);
		pq.add(4);
		pq.add(1);
		pq.add(3);
		pq.add(2);
		pq.add(10);
		pq.add(5);
		pq.add(7);
		pq.add(9);
		pq.add(8);
		pq.add(6);

		return pq;
	}

	public static void printPriorityQueue() {
		Queue<Integer> pq = getPriorityQueue();

		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.element());
		System.out.println("head of this queue = " + pq.peek());

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

	public static void printPriorityQueueUsingComparator() {
		Comparator<Integer> comp = (i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0;

		Queue<Integer> pq = getPriorityQueue(comp);

		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.element());
		System.out.println("head of this queue = " + pq.peek());

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

	public static void removeElement(int item) {
		Queue<Integer> pq = getPriorityQueue();
		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.peek());
		System.out.println("===================================================================");

		int r = pq.remove();
		System.out.println("Removed head = " + r);
		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.peek());
		System.out.println("===================================================================");

		boolean b = pq.remove(item);
		System.out.println("Removed element = " + item + " : " + b);
		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.peek());
		System.out.println("===================================================================");

		boolean rf = pq.removeIf(i -> i > 5);
		System.out.println("Removed all elements having values greater than 5: " + rf);
		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.peek());

		List<Integer> numbers = List.of(1, 2, 3, 6, 7, 8);

		boolean rall = pq.removeAll(numbers);
		System.out.println("===================================================================");
		System.out.println("Removed all list elements = " + numbers + " from Priority Queue: " + rall);
		System.out.println("Priority Queue = " + pq);
		System.out.println("head of this queue = " + pq.peek());
	}

	public static void main(String[] args) {
		printPriorityQueue();
		// System.out.println("===================================================================");
		// printPriorityQueueUsingComparator();
		// removeElement(10);
		// printAlphabetsPriorityQueue();
		// iterateAlphabetsPriorityQueue();
	}
}
