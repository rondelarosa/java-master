package org.example.datastructure.wrong;

public class WrongStart {
    public static void process() {
        Stack<String> myStack = new Stack<String>();
        myStack.push("1");
        // this is wrong as it will throw exception, there should be no surprises
        myStack.clear();
        String s = myStack.pop(); // throw an error due precedent clear calls
    }
}
