package com.learning.profilers;

public class Calc {

	public static void main(String[] args) {
		while (true) {
			add();
		}
	}

	private static long add() {

		long sum = 0;

		for (int i = 0; i < 1_000_000; i++) {
			sum += i;
		}
		
		return sum;
	}
}