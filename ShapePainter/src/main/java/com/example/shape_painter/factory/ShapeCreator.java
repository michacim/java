package com.example.shape_painter.factory;



import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class ShapeCreator {

    protected final Pane canvas;
    protected final Random rnd = new Random();

    public ShapeCreator(Pane canvas) {
        this.canvas = canvas;
    }

    /**
     * Factory Method: Unterklassen entscheiden,
     * WELCHES konkrete Shape erzeugt wird.
     */
    public abstract Shape createShape();

    /**
     * Hilfsmethode: zufällige X-Position innerhalb der Zeichenfläche.
     */
    protected double randomX() {
        return rnd.nextDouble(20, Math.max(40, canvas.getWidth() - 20));
    }

    /**
     * Hilfsmethode: zufällige Y-Position innerhalb der Zeichenfläche.
     */
    protected double randomY() {
        return rnd.nextDouble(20, Math.max(40, canvas.getHeight() - 20));
    }
}
