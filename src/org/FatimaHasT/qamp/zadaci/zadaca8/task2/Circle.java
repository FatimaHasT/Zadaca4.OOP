package org.FatimaHasT.qamp.zadaci.zadaca8.task2;

public class Circle extends Shape {
    final double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
