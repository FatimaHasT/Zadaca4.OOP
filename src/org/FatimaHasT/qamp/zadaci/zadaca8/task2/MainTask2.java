package org.FatimaHasT.qamp.zadaci.zadaca8.task2;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Pink", 3.0));
        shapes.add(new Square("Red", 3.0));
        shapes.add(new Rectangle("Black", 3.0, 4.0));

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape);
        }
    }
}
