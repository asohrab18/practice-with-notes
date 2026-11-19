package com.learning.collection.cursors;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class EnumerationDemo {

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

	public static void enumerateVector() {
		Vector<Integer> vector = getVector();
		System.out.println(vector);

		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

	public static void enumerateStack() {
		Stack<Integer> stack = getStack();
		System.out.println(stack);

		Enumeration<Integer> enumeration = stack.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

	public static void enumerateHashtable() {
		Hashtable<Integer, String> hashtable = getHashtable();
		System.out.println(hashtable);
		System.out.println("\nKeys:");
		Enumeration<Integer> keysEnumeration = hashtable.keys();
		while (keysEnumeration.hasMoreElements()) {
			System.out.println(keysEnumeration.nextElement());
		}

		System.out.println("\nValues:");
		Enumeration<String> valuesEnumeration = hashtable.elements();
		while (valuesEnumeration.hasMoreElements()) {
			System.out.println(valuesEnumeration.nextElement());
		}

	}

	public static void main(String[] args) {
		// enumerateVector();
		// enumerateStack();
		enumerateHashtable();
	}

}
