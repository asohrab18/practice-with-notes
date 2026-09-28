package com.learning.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void insertNullKeyValue() {
		Map<String, String> ht = new Hashtable<>();
		ht.put(null, null);
	}

	public static void insertNullKey() {
		Map<String, String> ht = new Hashtable<>();
		ht.put(null, "A");
	}

	public static void insertNullValue() {
		Map<String, String> ht = new Hashtable<>();
		ht.put("A", null);
	}

	public static void insertEmptyKeyValue() {
		Map<String, String> ht = new Hashtable<>();
		ht.put("", "");
		System.out.println(ht);
	}

	public static void insertEmptyKey() {
		Map<String, String> ht = new Hashtable<>();
		ht.put("", "A");
		System.out.println(ht);
	}

	public static void insertEmptyValue() {
		Map<String, String> ht = new Hashtable<>();
		ht.put("A", "");
		System.out.println(ht);
	}

	public static void insertSomeKeyValue() {
		Map<String, String> ht = new Hashtable<>();
		ht.put("A", "A");
		System.out.println(ht);
		ht.put("A", "B");
		System.out.println(ht);
	}

	public static void main(String[] args) {
		// insertNullKeyValue();
		// insertNullKey();
		// insertNullValue();
		// insertEmptyKeyValue();
		// insertEmptyKey();
		// insertEmptyValue();
		insertSomeKeyValue();
	}

}
