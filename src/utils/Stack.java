package utils;

public interface Stack<T> {
    public void push(T number);
    public T pop();
    public T peek();
    boolean isEmpty();
}
