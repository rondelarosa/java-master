package org.example.datastructure.correct;

public class CorrectStart {
    public static void process() {
        MonitorableStack<String> myStack = new MonitorableStack<>();
        myStack.pushMany(new String[]{"abc", "def"});
        assert myStack.maximumSizeSoFar() == 2 : "Unexpected maximum size: " + myStack.maximumSizeSoFar();
    }
}
