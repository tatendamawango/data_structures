package utils;

import java.util.Iterator;
/*
Implement all interface methods based on a linked list.
Do not use the java class LinkedList <E>, try to write all the logic yourself.
Additional methods and variables can be developed as needed.
*/
public class LinkedList<T> implements List<T> {

    static  int counter;
    class Node{

        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(Node das)
        {
            next = das;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(T item) {
        Node newNode = new Node(item);

        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;

        }
        tail = newNode;
        counter++;
    }

    public T get(int index){
        if (index < 0) {
            return null;
        }

        Node current = null;

        if (head != null) {
            current = head.next;
            for (int i = 0; i < index; i++) {
                if (current.next == null)
                    return null;
                current = current.next;
            }
            return current.data;
        }
        return current.data;
    }

    @Override
    public boolean remove(T item){
        Node current = head;

        if (head != null) {
            for (int i = 0; i < counter; i++) {
                if (current.next == null) {
                    return false;
                }
                current = current.next;
            }
            current.setNext(current.next.next);
            counter--;
            return true;
        }
        return false;
    }

    /**
     * E set(int index, E element)
     * Replaces the element at the specified position in this list with the specified element.
     * */
    public T set(int index, T element) {
        Node current = head;
        int count = 0;
        for (int i = 0; i < counter; i++) {
            if (count == index) {
                current.data = element;
            }
            else {
                current = current.next;
                count++;
            }
        }
        return current.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            public Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (hasNext()){
                    T data = current.data;
                    current = current.next;
                    return data;
                }
                return null;
            }

        };
    }
}
