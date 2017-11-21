package com.javarush.task.task29.task2909.car;

/**
 * Created by Dmitry Shelemekh on 21.11.2017.
 */
public class Truck extends Car {
    public Truck(int numberOfPassengers) {
        super(0, numberOfPassengers);
    }


    @Override
    public int getMaxSpeed() {
        final int MAX_TRUCK_SPEED = 80;
        return MAX_TRUCK_SPEED;
    }
}
