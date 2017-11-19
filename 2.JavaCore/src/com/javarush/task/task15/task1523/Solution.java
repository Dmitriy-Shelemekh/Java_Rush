package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    private int a;

    public Solution() {
        a = 1;
    }

    private Solution(int a) {
        this.a = a;
    }

    Solution(int a, int b) {
    }

    protected Solution(int a, int b, int c) {
    }

    public static void main(String[] args) {

    }
}

