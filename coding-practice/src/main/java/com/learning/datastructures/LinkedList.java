package com.learning.datastructures;

public class LinkedList {

	Node head;
	Node tail;
	int length;

	public LinkedList() {
	}

	public LinkedList(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length++;
	}

	public void append(int val) {
		Node newNode = new Node(val);
		if (length > 0) {
			tail.next = newNode;
			tail = newNode;
		} else {
			head = newNode;
			tail = newNode;
		}
		length++;
	}

	public void reverse() {
		if (head == null || head.next == null) {
			return;
		}
		Node temp = head;
		head = tail;
		tail = temp;

		Node before = null;
		Node after;

		while (temp != null) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
}
