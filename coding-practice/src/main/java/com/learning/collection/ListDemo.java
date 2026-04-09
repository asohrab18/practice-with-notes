package com.learning.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void add(List<String> list, String element) {
		try {
			list.add(element);
		} catch (UnsupportedOperationException e) {
			System.out.println("cannot add element: " + e.getClass().getSimpleName());
		}
	}

	public static void remove(List<String> list, String element) {
		try {
			list.remove(element);
		} catch (UnsupportedOperationException e) {
			System.out.println("cannot add element: " + e.getClass().getSimpleName());
		}
	}

	public static void set(List<String> list, int index, String element) {
		try {
			list.set(index, element);
		} catch (UnsupportedOperationException e) {
			System.out.println("cannot add element: " + e.getClass().getSimpleName());
		}
	}

	public static void testNewArrayList() {
		System.out.println("---------------------------testNewArrayList------------------------------------------");
		List<String> fruits = new ArrayList<>();
		add(fruits, "Apple");
		add(fruits, "Apple");
		add(fruits, "Banana");

		System.out.println("Initially: " + fruits);

		add(fruits, "Coconut");
		remove(fruits, "Apple");
		set(fruits, 0, "Mango");

		System.out.println("Finally: " + fruits);

		System.out.println(
				"\nnew ArrayList() is completely Modifiable bcoz it  allows add(), remove(), set() operations.");
	}

	public static void testArraysAsList() {
		System.out.println("\n---------------------------testArraysAsList------------------------------");
		List<String> fruits = Arrays.asList("Apple", "Apple", "Banana");
		System.out.println("Initially: " + fruits);

		add(fruits, "Coconut");
		remove(fruits, "Apple");
		set(fruits, 0, "Mango");

		System.out.println("Finally: " + fruits);

		System.out.println(
				"\nSo, Arrays.asList(..) is partially modifiable because it allows set() operation but does not allow add() and remove().");
	}

	public static void testListOf() {
		System.out.println("\n---------------------------testListOf--------------------------");
		List<String> fruits = List.of("Apple", "Apple", "Banana");
		System.out.println("Initially: " + fruits);

		add(fruits, "Coconut");
		remove(fruits, "Apple");
		set(fruits, 0, "Mango");

		System.out.println("Finally: " + fruits);

		System.out.println(
				"\nSo, List.of(..) is completely unmodifiable bcoz it does not allow add(), remove(), set() operations.");
		System.out.println();
	}

	public static void main(String[] args) {
		List a = new ArrayList();
		List b = new ArrayList();

		// 1. add method
		a.add(1);
		a.add(2);
		a.add("A");

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// 2. addAll method copies all elements from one collection to another.
		b.addAll(a);
		System.out.println("After addAll(..):");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//3. clear()
		a.clear();
		b.clear();
		System.out.println("After clear():");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//contains() checks whether an element exists in the collection.
		System.out.println(a.contains(1));
		
		a.add(1);
		a.add(2);
		System.out.println("a = " + a);
		System.out.println(a.contains(1));
		System.out.println(a.contains("A"));
		
	}

}
