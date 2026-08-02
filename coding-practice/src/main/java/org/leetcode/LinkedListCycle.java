package org.leetcode;

import com.learning.datastructures.Node;

/** Leetcode Problem: 141 */
public class LinkedListCycle {

	public static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;

		System.out.println(hasCycle(n1));
	}

}
