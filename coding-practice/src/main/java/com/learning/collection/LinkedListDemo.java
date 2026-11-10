package com.learning.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedListDemo {

	public static LinkedList<Object> getLinkedList() {
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		return linkedList;
	}

	public static LinkedList<Object> addOperations() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println(linkedList);

		linkedList.add(2, "Apple");
		System.out.println(linkedList);

		Collection<Double> temperatures = List.of(100.56d, 56.78d, 98.76d);
		linkedList.addAll(2, temperatures);
		System.out.println(linkedList);

		Collection<Integer> ranks = List.of(5, 4, 3, 2, 1);
		linkedList.addAll(ranks);
		System.out.println(linkedList);

		linkedList.addFirst("First");
		System.out.println(linkedList);

		linkedList.addLast("Last");
		System.out.println(linkedList);

		return linkedList;
	}

	public static void clearOperation() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("Initially, LinkedList = " + linkedList);

		linkedList.clear();

		System.out.println("After clearing, LinkedList = " + linkedList);
	}

	public static void cloneOperation() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("Initially, LinkedList = " + linkedList);

		Object clonedObj = linkedList.clone();
		System.out.println("clonedObj = " + clonedObj);
	}

	public static void containsOperation(Object obj) {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		System.out.println("LinkedList contains '" + obj + "'? Answer: " + linkedList.contains(obj));
	}

	public static void descendingIterator() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);
		System.out.println("Descending Iterator iterates as:");
		Iterator<Object> itr = linkedList.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void printElement() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		System.out.println("head (first element) = " + linkedList.element());
	}

	public static void getOperations() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);
		System.out.println("linkedList.get(1) = " + linkedList.get(1));
		System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
		System.out.println("linkedList.getLast() = " + linkedList.getLast());
		System.out.println("No deletion in LinkedList = " + linkedList);
	}

	public static void indexOfOperations(Object obj) {
		LinkedList<Object> linkedList = getLinkedList();
		LinkedList<Object> linkedList2 = getLinkedList();
		linkedList.addAll(linkedList2);
		System.out.println("LinkedList = " + linkedList);
		System.out.println("index of " + obj + " = " + linkedList.indexOf(obj));
		System.out.println("Last index of " + obj + " = " + linkedList.lastIndexOf(obj));
	}

	public static void listIterator() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		ListIterator<Object> litr = linkedList.listIterator();
		while (litr.hasNext()) {
			System.out.println("next element = " + litr.next() + "\tnext index = " + litr.nextIndex());
		}

		while (litr.hasPrevious()) {
			System.out.println("previous element = " + litr.previous() + "\tprevious index = " + litr.previousIndex());
		}
	}

	public static void offerOperations() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		linkedList.offer(100);
		System.out.println("offer(100) => LinkedList = " + linkedList);

		linkedList.offerFirst("First");
		System.out.println("offerFirst(First) => LinkedList = " + linkedList);

		linkedList.offerLast("Last");
		System.out.println("offerLast(Last) => LinkedList = " + linkedList);
	}

	public static void peekOperations() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		System.out.println("linkedList.peek() = " + linkedList.peek());
		System.out.println("linkedList.peekFirst() = " + linkedList.peekFirst());
		System.out.println("linkedList.peekLast() = " + linkedList.peekLast());

		System.out.println("Finally, LinkedList = " + linkedList);
	}

	public static void pollOperations() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		System.out.println("\nlinkedList.poll() = " + linkedList.poll());
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("\nlinkedList.pollFirst() = " + linkedList.pollFirst());
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("\nlinkedList.pollLast() = " + linkedList.pollLast());
		System.out.println("Now, LinkedList = " + linkedList);
	}

	/**
	 * Pops an element from the stack represented by this list. In other words,
	 * removes and returns the first element of this list.
	 */
	public static void popOperation() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);
		System.out.println("linkedList.pop() = " + linkedList.pop());
		System.out.println("LinkedList = " + linkedList);
	}

	/**
	 * Pushes an element onto the stack represented by this list. In other words,
	 * inserts the element at the front of this list.
	 */
	public static void pushOperation() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		linkedList.push("APPLE");

		System.out.println("LinkedList = " + linkedList);
	}

	public static void removeOperations() {
		LinkedList<Object> linkedList = getLinkedList();
		linkedList.addAll(getLinkedList());
		linkedList.addAll(getLinkedList());
		System.out.println("LinkedList = " + linkedList);

		System.out.println("linkedList.remove() = " + linkedList.remove());
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("linkedList.remove(D) = " + linkedList.remove("D"));
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("linkedList.removeFirst() = " + linkedList.removeFirst());
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("linkedList.removeLast() = " + linkedList.removeLast());
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("linkedList.removeFirstOccurrence(C) = " + linkedList.removeFirstOccurrence("C"));
		System.out.println("Now, LinkedList = " + linkedList);

		System.out.println("linkedList.removeLastOccurrence(A) = " + linkedList.removeLastOccurrence("A"));
		System.out.println("Now, LinkedList = " + linkedList);

	}

	public static void setOperation(int index, Object val) {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		linkedList.set(index, val);
		System.out.println("Updated LinkedList = " + linkedList);
	}

	public static void sizeOperation() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);
		System.out.println("linkedList.size() = " + linkedList.size());
	}

	public static void splIterator() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		Spliterator<Object> splItr = linkedList.spliterator();
		System.out.println("splItr.estimateSize() = " + splItr.estimateSize());
		System.out.println("splItr.getExactSizeIfKnown() = " + splItr.getExactSizeIfKnown());
		System.out.println("LinkedList = " + linkedList);
	}

	public static void toArray() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		Object[] objArr = linkedList.toArray();
		for (Object obj : objArr) {
			System.out.println(obj);
		}
	}

	public static void toArrayWithType() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		String[] srr = new String[linkedList.size()];

		String[] strArray = linkedList.toArray(srr);
		for (String str : strArray) {
			System.out.println(str);
		}
	}

	public static void toStringOperation() {
		LinkedList<Object> linkedList = getLinkedList();
		System.out.println("LinkedList = " + linkedList);

		String str = linkedList.toString();
		System.out.println("linkedList.toString() = " + str);
		System.out.println("str.charAt(0) = " + str.charAt(0));
	}

	public static void main(String[] args) {

		// addOperations();
		// clearOperation();
		// cloneOperation();
		// containsOperation("A");
		// descendingIterator();
		// printElement();
		// getOperations();
		// indexOfOperations("A");
		// listIterator();
		// offerOperations();
		// peekOperations();
		// pollOperations();
		// popOperation();
		// pushOperation();
		// removeOperations();
		// setOperation(1,"Mango");
		// sizeOperation();
		// splIterator();
		// toArray();
		// toArrayWithType();
		toStringOperation();
	}

}
