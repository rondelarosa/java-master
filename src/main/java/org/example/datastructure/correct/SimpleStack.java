package org.example.datastructure.correct;

/**
 * No longer needed as solve in teh nested class Stack<T>
 * @param <T>
 */
public class SimpleStack<T> implements Stack<T> {
    private int stackPointer = 0;
    T[] contents = (T[]) new Object[1000];

    @Override
    public void push(T item) {
        assert stackPointer < contents.length : "push to full stack";
        contents[stackPointer++] = item;
    }

    @Override
    public T pop() {
        assert stackPointer > 0 : "pop from empty stack";
        return contents[--stackPointer];
    }

    @Override
    public void pushMany(T[] items) {
        assert (stackPointer + items.length) <= contents.length : "too many items";

        System.arraycopy(items, 0, contents, stackPointer, items.length);
        stackPointer += items.length;
    }

    @Override
    public int size() { return stackPointer; }
}
