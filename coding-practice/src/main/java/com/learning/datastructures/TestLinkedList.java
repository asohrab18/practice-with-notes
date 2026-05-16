package com.learning.datastructures;

public class TestLinkedList {

	public static LinkedList createLinkedList() {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);

		return myLinkedList;
	}

	public static void printLinkedList(LinkedList myLinkedList) {
		Node temp = myLinkedList.head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList myLinkedList = createLinkedList();
		printLinkedList(myLinkedList);
		System.out.println("=============== Reverse Linked List ====================");
		myLinkedList.reverse();
		
		printLinkedList(myLinkedList);

	}

}
