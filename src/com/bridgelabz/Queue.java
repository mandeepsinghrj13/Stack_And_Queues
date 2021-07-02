package com.bridgelabz;
public class Queue 
{
	Node front;
	Node rear;

	int length;

	class Node{
		int data;
		Node next;
		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}
		//add data into the Queue
	public void enQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		}
		else {
			rear.next = new Node(data);
			rear = rear.next;
		}

		length ++;

	}
      //Print method 
	public void print() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}
}
