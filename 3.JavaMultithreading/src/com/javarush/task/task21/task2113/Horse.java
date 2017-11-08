package com.javarush.task.task21.task2113;

/**
 * Created by Dmitry Shelemekh on 07.11.2017.
 */
public class Horse {

    String name;
    double speed;
    double distance;

    public void move() {}

    public void print() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
}
