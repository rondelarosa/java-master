package org.example.datastructure.correct;

/**
 * Do not use extends
 * use interface instead
 */
public class CorrectStart {
    public static void process() {
        MonitorableStack<String> myStack = new MonitorableStack<>();
        myStack.pushMany(new String[]{"abc", "def"});
        assert myStack.maximumSizeSoFar() == 2 : "Unexpected maximum size: " + myStack.maximumSizeSoFar();
    }
}
