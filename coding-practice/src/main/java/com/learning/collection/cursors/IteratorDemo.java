package com.learning.collection.cursors;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class IteratorDemo {

	public static Vector<Integer> getVector() {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);

		return vector;
	}

	public static Stack<Integer> getStack() {
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		stack.add(7);
		stack.add(8);

		return stack;
	}

	public static Hashtable<Integer, String> getHashtable() {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "A");
		hashtable.put(2, "B");
		hashtable.put(3, "C");
		hashtable.put(4, "D");
		hashtable.put(5, "E");
		hashtable.put(6, "F");
		hashtable.put(7, "G");
		hashtable.put(8, "H");

		return hashtable;
	}

	public static void iterateVector() {
		Vector<Integer> vector = getVector();
		System.out.println(vector);

		Iterator<Integer> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("\nAfter removal, vector = " + vector);
	}

	public static void iterateStack() {
		Stack<Integer> stack = getStack();
		System.out.println(stack);

		Iterator<Integer> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void iterateHashtable() {
		Hashtable<Integer, String> hashtable = getHashtable();
		System.out.println(hashtable);

		Set<Entry<Integer, String>> entrySet = hashtable.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + "\tValue = " + entry.getValue());
		}
	}

	public static void iterateKeys() {
		Hashtable<Integer, String> hashtable = getHashtable();
		System.out.println(hashtable);

		Set<Integer> keySet = hashtable.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			System.out.println("Key = " + itr.next());
		}
	}

	public static void iterateValues() {
		Hashtable<Integer, String> hashtable = getHashtable();
		System.out.println(hashtable);

		Collection<String> valuesCollection = hashtable.values();
		Iterator<String> itr = valuesCollection.iterator();
		while (itr.hasNext()) {
			System.out.println("Value = " + itr.next());
			itr.remove();
		}

		System.out.println("After removal, hashtable = " + hashtable);
	}

	public static void main(String[] args) {
		iterateValues();
	}

}
