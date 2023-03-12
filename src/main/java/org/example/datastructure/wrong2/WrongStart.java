package org.example.datastructure.wrong2;

public class WrongStart {
    public static void process() {
        Stack<String> myStack = new Stack<String>();
        myStack.push("1");
        String s = myStack.pop(); // throw an error due precedent clear calls
    }
}
