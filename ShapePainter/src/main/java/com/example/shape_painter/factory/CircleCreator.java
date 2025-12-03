package com.example.shape_painter.factory;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class CircleCreator extends ShapeCreator {

    public CircleCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {
        double radius = rnd.nextDouble(15, 40);
        Circle circle = new Circle(randomX(), randomY(), radius);
        circle.setFill(Color.color(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble(), 0.6));
        circle.setStroke(Color.BLACK);
        return circle;
    }
}
