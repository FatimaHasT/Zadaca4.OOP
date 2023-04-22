package org.FatimaHasT.qamp.zadaci.zadaca8.task2;

public class Square extends Shape {
    final double side;

    public Square(String colour, double side) {
        super(colour);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }
}
