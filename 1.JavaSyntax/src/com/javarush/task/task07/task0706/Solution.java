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
        Scanner scan = new Scanner(System.in);
        int[] list = new int[15];
        for (int i = 0; i < 15; i++) {
            list[i] = scan.nextInt();
            {
                if (i % 2 == 0 || i == 0) dom2 = dom2 + list[i];
                else dom1 = dom1 + list[i];
            }
        }
        if (dom1 < dom2)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}

