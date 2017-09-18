package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {

    static class Cat {
        public String name;
    }

    static Cat cat = new Cat();

    static {
        cat.name = "Tom";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
    }
}
