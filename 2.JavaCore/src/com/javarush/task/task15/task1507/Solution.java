package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    //1
    public static void printMatrix(Integer m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    //2
    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    //3
    public static void printMatrix(double m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, n, (Object) value);
    }

    //4
    public static void printMatrix(double m, double n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }

    //5
    public static void printMatrix(double m, double n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, value);
    }

    //6
    public static void printMatrix(double m, double n, Integer value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }

    //7
    public static void printMatrix(double m, double n, Double value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }

    //8
    public static void printMatrix(byte m, double n, Double value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }

    //9
    public static void printMatrix(byte m, byte n, Double value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }

    //10
    public static void printMatrix(short m, byte n, Double value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, (int) n, (Object) value);
    }
}

