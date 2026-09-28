package com.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacityDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		numbers.add(11);
		System.out.println(numbers);
	}

}
