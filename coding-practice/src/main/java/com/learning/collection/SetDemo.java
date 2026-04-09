package com.learning.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Banana");

		System.out.println(fruits);
	}

}
