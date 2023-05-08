package utils;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
    private  static int size = 100;
    private  T[] stack;
    private int top;

    public int size() {
        return top;
    }

    public ArrayStack() {
        top = 0;
        stack = (T[])(new Object[size]);
    }

    public ArrayStack(int initials)
    {
        top = 0;
        stack = (T[])(new Object[initials]);
    }

    @Override
    public void push(T element) {
        if (top == stack.length) {
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        stack[top] = element;
        top++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("ArrayStack Empty");
        }
        T retVal = stack[top - 1];
        stack[top] = null;
        top--;
        return  retVal;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("ArrayStack Empty");
        }
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return (top == 0);
    }

    public void DisplayALl() {
        for (int i = 0; i < size(); i++) {
            System.out.println(stack[i]);
        }
    }

}
