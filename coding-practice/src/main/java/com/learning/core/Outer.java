package com.learning.core;

public class Outer {

	static class Inner {
		public void show() {
			System.out.println("static Nested class has show instance method.");
		}
		
		public static void display() {
			System.out.println("static Nested class has static display method.");
		}
	}
	
	
	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		obj.show();
		
		
		Outer.Inner.display();
		
	}
}
