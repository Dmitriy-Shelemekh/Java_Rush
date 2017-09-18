package com.javarush.task.task15.task1529;

/**
 * Created by Dmitry Shelemekh on 23.05.2017.
 */
public class Plane implements Flyable {
    private int passengers;


    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Plane() {

    }

    public Plane(int passengers) {
        setPassengers(passengers);
    }

    public void fly() {

    }
}
