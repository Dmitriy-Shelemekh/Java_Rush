package com.javarush.task.task05.task0521;

/* 
Вызов конструктора из конструктора
*/

public class Circle {

    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void Print() {
        System.out.println(x + " " + y + " " + radius);
    }

    public Circle(double x, double y) {
        //напишите тут ваш код
        this(x, y, 10);
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.Print();
        Circle anotherCircle = new Circle(10, 5);
        anotherCircle.Print();
    }
}
