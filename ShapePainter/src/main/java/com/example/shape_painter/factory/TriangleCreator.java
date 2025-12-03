package com.example.shape_painter.factory;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class TriangleCreator extends ShapeCreator {

    public TriangleCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {
        double x = randomX();
        double y = randomY();

        double size = rnd.nextDouble(30, 70);

        Polygon triangle = new Polygon(
                x, y - size / 2,
                x - size / 2, y + size / 2,
                x + size / 2, y + size / 2
        );
        triangle.setFill(Color.color(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble(), 0.6));
        triangle.setStroke(Color.BLACK);
        return triangle;
    }
}
