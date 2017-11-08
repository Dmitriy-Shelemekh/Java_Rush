package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry Shelemekh on 07.11.2017.
 */
public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses ) {
            horse.move();
        }
    }

    public void print() {
    }

    public static void main(String[] args) {

        game = new Hippodrome(new ArrayList<>());

        game.getHorses().add(new Horse("Horse_1", 3, 0));
        game.getHorses().add(new Horse("Horse_2", 3, 0));
        game.getHorses().add(new Horse("Horse_3", 3, 0));

    }
}
