package org.example.datastructure.wrong2;

public class MonitorableStack<T> extends Stack<T> {
    private int highWaterMark = 0;
    public int maximumSizeSoFar() {
        return highWaterMark;
    }

    public void push(T item) {
        if (size() > highWaterMark)
            highWaterMark = size();

        super.push(item);

    }
}
