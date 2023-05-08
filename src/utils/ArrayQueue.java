package utils;

public class ArrayQueue<T> implements Queue<T> {
    private int size = 100;
    private int rear;
    private T[] queue;

    public int size() {
        return rear;
    }

    public ArrayQueue() {
        rear = 0;
        queue = (T[])(new Object[size]);
    }

    public ArrayQueue(int val) {
        rear = 0;
        queue = (T[])(new Object[val]);
    }
    @Override
    public void enqueue (T element){
        if (rear == queue.length)
            expandCapacity();
        queue[rear] = element;
        rear++;
    }
    @Override
    public T dequeue() {
        if (isEmpty())
            throw new UnsupportedOperationException("Empty");

        T result = queue[0];
        rear--;

        for (int i = 0; i < rear; i++)
            queue[i] = queue[i + 1];
        queue[rear] = null;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty())
            throw new UnsupportedOperationException("Empty");
        return queue[0];
    }

    private void expandCapacity() {
        T[] larger = (T[])(new Object[queue.length*2]);
        for (int i = 0; i < queue.length; i++)
            larger[i] = queue[i];
        queue = larger;
    }

    @Override
    public boolean isEmpty(){
        return (rear == 0);
    }

    public void DisplayAll() {
        for (int i = 0 ; i < size(); i++) {
            System.out.println(queue[i]);
        }
    }
}
