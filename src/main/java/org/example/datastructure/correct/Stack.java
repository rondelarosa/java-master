package org.example.datastructure.correct;

public class Stack<T> {
    private int stackPointer = 0;
    T[] contents = (T[]) new Object[1000];

    public void push(T item) {
        assert stackPointer < contents.length : "push to full stack";
        contents[stackPointer++] = item;
    }

    public T pop() {
        assert stackPointer > 0 : "pop from empty stack";
        return contents[--stackPointer];
    }

    public void pushMany(T[] items) {
        assert (stackPointer + items.length) <= contents.length : "too many items";

        System.arraycopy(items, 0, contents, stackPointer, items.length);
        stackPointer += items.length;
    }

    public int size() { return contents.length; }
}
