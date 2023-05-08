package utils;

import java.util.EmptyStackException;

public class LinkedListStack<T> implements Stack<T>{
    private int size;
    private Node top;

    public class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (top != null) {
            T temp = (T)top.data;
            top = top.next;
            size--;
            return temp;
        }
        throw new EmptyStackException();
    }

    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return (T) top.data;
    }

    public void DisplayAll() {
        Node current = top;
        for (int i = 0; i < this.size; i++) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
