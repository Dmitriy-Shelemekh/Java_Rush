package com.javarush.task.task15.task1529;

/**
 * Created by Dmitriy Shelemekh on 24.05.2017.
 */
public class Plane implements Flyable {
    private int passengers;


    public Plane() {

    }

    public Plane(int passengers) {
        setPassengers(passengers);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void fly() {

    }
}
