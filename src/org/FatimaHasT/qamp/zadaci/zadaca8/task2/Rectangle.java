package org.FatimaHasT.qamp.zadaci.zadaca8.task2;

public class Rectangle extends Shape {
    public double a;
    public double b;

    public Rectangle(String colour, double a, double b) {
        super(colour);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * a + 2 * b;
    }
}
