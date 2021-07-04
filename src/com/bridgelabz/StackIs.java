package com.bridgelabz; 
class Node {
public int data;
public Node next;

public Node(int data) {
  this.data = data;
  next = null;
}
}

public class StackIs {
public Node head;
public Node top;

public StackIs() {
  head = null;
  top = null;
}

public void traversal() {
  Node temp = this.head; //temporary pointer to point to head

  while(temp != null) { //iterating over stack
    System.out.print(temp.data+"\t");
    temp = temp.next;
  }

  System.out.println("");
}

public boolean isEmpty() {
  if(this.top == null)
    return true;
  return false;
}

public void push(Node n) {
  if(this.isEmpty()) {
    this.head = n;
    this.top = n;
  }
  else {
    this.top.next = n;
    this.top = n;
  }
}

public int pop() {
  if(this.isEmpty()) {
    System.out.println("Stack Underflow\n");
    return -1000;
  }
  else {
    int x = this.top.data;
    if(this.head == this.top) {// only one node
      this.top = null;
      this.head = null;
    }
    else {
      Node temp = this.head;
      while(temp.next != this.top) // iterating to the last element
        temp = temp.next;
      temp.next = null;
      this.top = temp;
    }
    return x;
  }
}
}

class StackMain {
public static void main(String[] args) {
	StackIs s = new StackIs();

  Node a, b, c;
  a = new Node(50);
  b = new Node(30);
  c = new Node(70);

  s.pop();
  s.push(a);
  s.push(b);
  s.push(c);

  s.traversal();
  s.pop();
  s.traversal();
}
}