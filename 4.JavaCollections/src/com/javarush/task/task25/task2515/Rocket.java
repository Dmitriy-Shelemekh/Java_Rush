package com.javarush.task.task25.task2515;

/**
 * Created by Dmitry Shelemekh on 11.10.2017.
 */
public class Rocket extends BaseObject {
    private int size;
    private int y;
    private int x;

    public Rocket(double x, double y, double radius) {
        super(x,y,radius);
        setRadius(radius);
    }

    @Override
    void move() {

    }

    @Override
    void draw() {

    }
}
