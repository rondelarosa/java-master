package org.example.reversedeps;

public class Button implements ButtonListener {
    /**
     *
     */
    @Override
    public void beenPressed() {
        System.out.println("Pressed");
    }
}
