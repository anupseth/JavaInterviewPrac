package com.datastructures;

public class LinkedList {

	Node head; // head of the list

	/* Linked list Node */
	static class Node {
		int data;
		Node next;

		// Constructor to create a new node
		// Next is by default initialized
		// as null
		Node(int d) {
			data = d;
		}
	}

	/* This function prints contents of linked list starting from head */
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}

		System.out.println();
	}

	public void insertNodeAtFront(int data) {
		Node head = this.head;
		Node temp = new Node(data);
		temp.next = head;
		this.head = temp;
	}

	public void insertAfterNode(Node prev_node, int new_data) {

		/* 1. Check if the given Node is null */
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		/*
		 * 2. Allocate the Node & 3. Put in the data
		 */
		Node new_node = new Node(new_data);

		new_node.next = prev_node.next;

		prev_node.next = new_node;

	}

	public void inserAtEnd(int new_data) {
		Node temp = this.head;

		if (temp != null) {
			
			while (temp.next != null) {
				temp = temp.next;
			}
			
			if (temp.next == null) {
				temp.next = new Node(new_data);
				temp.next.next = null;
			}

		} else {
			this.head = new Node(new_data);
		}

	}
	
	public int length() {
		Node temp = null;
		int count = 0;
		if(this.head == null)
			return 0;
		if(this.head.next == null)
			return 1;
		
		temp = this.head;
		
		do {
			count++;
			temp = temp.next;
		}while(temp.next != null);
		
		count++;
		
		return count;
	}

}
