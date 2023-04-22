package org.FatimaHasT.qamp.zadaci.zadaca8.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {
        List<Flight> flyingThings = new ArrayList<>();
        List<Swim> swimmingThings = new LinkedList<>();

        flyingThings.add(new Plane());
        flyingThings.add(new Duck());
        flyingThings.add(new Pegasus());

        swimmingThings.add(new Fish());
        swimmingThings.add(new Duck());
        swimmingThings.add(new Submarine());

        System.out.println("Flies:");
        for (Flight flyingThing : flyingThings) {
            System.out.println(flyingThing.getClass().getSimpleName() + " " + flyingThing.fly());
        }

        System.out.println("\nSwims:");
        for (Swim swimmingThing : swimmingThings) {
            System.out.println(swimmingThing.getClass().getSimpleName() + " " + swimmingThing.swim());
        }
    }
}

