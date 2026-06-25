package com.mmcoe.ds;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList <Integer>list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.insert(2,25);
		list.insert(4, 40);
		list.remove(2);
		
		
		list.print();
	}
}