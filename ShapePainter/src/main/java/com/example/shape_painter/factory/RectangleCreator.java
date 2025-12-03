package com.example.shape_painter.factory;



import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class RectangleCreator extends ShapeCreator {

    public RectangleCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {
        double width = rnd.nextDouble(30, 80);
        double height = rnd.nextDouble(20, 60);
        double x = randomX();
        double y = randomY();

        Rectangle rect = new Rectangle(x, y, width, height);
        rect.setFill(Color.color(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble(), 0.6));
        rect.setStroke(Color.BLACK);
        return rect;
    }
}
