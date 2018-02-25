package com.javarush.task.task05.task0515;

/* 
Инициализация объектов
*/

public class Person {
    private String name;
    private char sex;
    private int money;
    private int weight;
    private double size;

    public static void main(String[] args) {
    }

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }
}
