package com.javarush.task.task07.task0706;

import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int dom1 = 0;
        int dom2 = 0;
        int arrLength = 15;

        Scanner scan = new Scanner(System.in);
        int[] list = new int[arrLength];

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
            {
                if (i % 2 == 0 || i == 0) {
                    dom2 = dom2 + list[i];
                } else {
                    dom1 = dom1 + list[i];
                }
            }
        }

        Print(dom1, dom2);
//        if (dom1 < dom2) {
//            System.out.println("В домах с четными номерами проживает больше жителей.");
//        } else {
//            System.out.println("В домах с нечетными номерами проживает больше жителей.");
//        }
    }

    private static void Print(int dom1, int dom2) {
        String result = "В домах с нечетными номерами проживает больше жителей.";

        if (dom1 < dom2) {
            result = "В домах с четными номерами проживает больше жителей.";
        }

        System.out.println(result);
    }
}

