package org.example.datastructure.wrong2;

import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> stacks = new ArrayList<T>();
    private int stackPointer = 0;

    public int size() {
        return stacks.size();
    }
    public void push(T item) {
        stacks.add(stackPointer++, item);
    }

    public T pop() {
        return stacks.remove(--stackPointer);
    }

    public void pushMany(T[] items) {
        for(T item : items)
            push(item);
    }
}
