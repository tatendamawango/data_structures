package utils;

import java.util.EmptyStackException;

public class LinkedListQueue<T> implements Queue<T> {

    private int size;
    private Node first;
    private Node last;

    public class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListQueue() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public T dequeue() {
        if (first == null)
            throw new EmptyStackException();

        Node temp = first;
        first = first.next;
        if (first == null)
            last = null;

        T item = (T)temp.data;
        size--;
        return item;
    }

    @Override
    public void enqueue(T item) {
        Node temp = new Node(item);

        if (first == null) {
            first = temp;
            last = temp;
        }
        else {
            last.next = temp;
            last = temp;
        }
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return (T)first.data;
    }

    public void DisplayAll() {
        Node current = first;

        for (int i = 0; i < size(); i++) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
