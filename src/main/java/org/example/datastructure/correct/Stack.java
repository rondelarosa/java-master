package org.example.datastructure.correct;

public interface Stack<T> {
    void push(T item);

    T pop();

    void pushMany(T[] items);

    int size();

    /**
     * Pattern to use for fragility problem
     * @param <T>
     */
    class Implementation<T> implements Stack<T> {
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
}
