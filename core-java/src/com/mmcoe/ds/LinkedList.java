package com.mmcoe.ds;

public class LinkedList<Z> {
	private class Node {
		private Z data;
		public Node next;

		public Node(Z data) {
			this.data = data;
		}

		public Z getData() {
			return data;
		}
	}

	private Node head, last;
	private int size;

	public void add(Z data) {
		Node n = new Node(data);
		if (head == null)
			head = n;
		else
			last.next = n;
		last = n;
		size++;
	}

	public void insert(int idx, Z data) {
		if (idx > size)
			throw new IllegalArgumentException("Index out of bounds");

		Node n = new Node(data);
		if (idx == 0) {
			n.next = head;
			head = n;
		} else {
			Node t = head;
			for (int c = 1; true; c++, t = t.next) {
				if (c == idx) {
					n.next = t.next;
					t.next = n;
					break;
				}
			}
		}
		size++;
	}

	public void remove(int idx) {
		if (idx == 0) {
			head = head.next;
		} else {
			Node t = head;
			for (int c = 1; true; c++, t = t.next) {
				if (c == idx) {
					if(t.next == last) last = t;
					t.next = t.next.next;
					break;
				}
			}
		}
		size --;
	}

	public void print() {
		Node t = head;
		while (t != null) {
			System.out.println(t.getData());
			t = t.next;
		}
	}

	public int getSize() {
		return size;
	}
}
