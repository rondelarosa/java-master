package org.example.datastructure.correct;

public class MonitorableStack<T> implements Stack<T> {
    private int highWaterMark = 0;

    private Stack.Implementation<T> stack = new Implementation<T>();

    public int maximumSizeSoFar() {
        return highWaterMark;
    }

    public void push(T item) {
        if (size() > highWaterMark)
            highWaterMark = size();

        stack.push(item);

    }

    /**
     * @return
     */
    @Override
    public T pop() {
        return stack.pop();
    }

    /**
     * @param items
     */
    @Override
    public void pushMany(T[] items) {
        stack.pushMany(items);
        if (stack.size() > highWaterMark)
            highWaterMark = stack.size();

    }

    /**
     * @return
     */
    @Override
    public int size() {
        return stack.size();
    }
}
