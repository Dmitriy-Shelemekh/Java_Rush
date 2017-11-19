package com.javarush.task.task14.task1421;

/**
 * Created by Dmitriy Shelemekh on 12.03.2017.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
