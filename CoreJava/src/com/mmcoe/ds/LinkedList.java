package com.mmcoe.ds;

public class LinkedList<T> {

    private class Node {
        private T data;
        public Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    private Node head, last;
    private int size;

    public void add(T data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
        } else {
            last.next = n;
        }

        last = n;
        size++;    // Missing in your code
    }

    public void insert(int idx, T data) {

        if (idx > size) {
            throw new IllegalArgumentException("Index out of Bound");
        }

        Node n = new Node(data);

        if (idx == 0) {
            n.next = head;
            head = n;

            if (last == null)
                last = n;
        } else {

            Node t = head;

            for (int c = 1; true; c++, t = t.next) {
                if (c == idx) {
                    n.next = t.next;
                    t.next = n;

                    if (n.next == null)
                        last = n;

                    break;
                }
            }
        }

        size++;
    }

    public void remove(int idx) {

        Node t = head;

        if (idx == 0) {
            head = head.next;

            if (head == null)
                last = null;
        } else {

            for (int c = 1; true; c++, t = t.next) {

                if (c == idx ) {

                    if (t.next == last)
                        last = t;

                    t.next = t.next.next;
                    break;
                }
            }
        }

        size--;
    }

    public void print() {

        Node t = head;

        while (t != null) {
            System.out.println(t.getData());
            t = t.next;
        }
    }
}