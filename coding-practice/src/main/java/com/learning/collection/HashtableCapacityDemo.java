package com.learning.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableCapacityDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> ht = new Hashtable<>();
		for (int i = 1; i <= 10; i++) {
			ht.put(i, i);
		}
		System.out.println(ht);

	}

}
