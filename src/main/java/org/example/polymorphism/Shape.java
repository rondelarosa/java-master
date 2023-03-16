package org.example.polymorphism;

import java.awt.*;

public abstract class Shape {
    private Color color;

    public void darken() {

    }
    public void draw(Graphics g) {
        g.setColor(this.color);
        render(g);
    }

    abstract protected void render(Graphics g);
}
