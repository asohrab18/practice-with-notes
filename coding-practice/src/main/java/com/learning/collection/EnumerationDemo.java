package com.learning.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationDemo {

	public static void useVector() {
		Vector<Integer> vector = new Vector<>();
		for (int i = 1; i <= 3; i++) {
			vector.add(i);
		}
		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			int e = enumeration.nextElement();
			System.out.println("item = " + e);
		}
	}

	public static void useHashtable() {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(100, "A");
		hashtable.put(200, "B");
		hashtable.put(300, "C");

		Enumeration<Integer> keysEnumeration = hashtable.keys();
		while (keysEnumeration.hasMoreElements()) {
			int key = keysEnumeration.nextElement();
			System.out.println("key = " + key);
		}

		Enumeration<String> valuesEnumeration = hashtable.elements();
		while (valuesEnumeration.hasMoreElements()) {
			String value = valuesEnumeration.nextElement();
			System.out.println("value = " + value);
		}
	}

	public static void main(String[] args) {
		useVector();
		useHashtable();
	}

}
