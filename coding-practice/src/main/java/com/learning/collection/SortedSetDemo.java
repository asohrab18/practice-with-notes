package com.learning.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> fruits = new TreeSet<>();
		fruits.add("Coconut");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Apple");

		System.out.println(fruits);
	}

}
