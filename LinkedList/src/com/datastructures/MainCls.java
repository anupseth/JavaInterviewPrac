package com.datastructures;

import com.datastructures.LinkedList.Node;

public class MainCls {

	public static void main(String[] args) {
		// Create linked list
		LinkedList llist = new LinkedList();

		// Create nodes
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		// link nodes
		llist.head.next = second; // Link first node with the second node
		second.next = third; // Link second node with the third node

		// Print linked list
		llist.printList();
		System.out.println();

		llist.insertNodeAtFront(4);

		// After insertion At front
		System.out.println("After node insertion at front");
		llist.printList();

		// Insert data after a node
		llist.insertAfterNode(second, 5);

		// After insertion after second node
		System.out.println("After node insertion after 2nd node");
		llist.printList();

		
		System.out.println(" Count is  :  "+ llist.length());
		
		
		llist.inserAtEnd(6);
		
		// After insertion At end
		System.out.println("After insertion At end");
		llist.printList();

		System.out.println(" Length is  :  "+ llist.length());
	}

}
