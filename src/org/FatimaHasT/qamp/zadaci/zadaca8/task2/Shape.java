package org.FatimaHasT.qamp.zadaci.zadaca8.task2;

public abstract class Shape {
    final String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    @Override
    public String toString() {
        return "colour: " + colour + ", area: " + getArea() + ", circumference: " + getCircumference();
    }
}
