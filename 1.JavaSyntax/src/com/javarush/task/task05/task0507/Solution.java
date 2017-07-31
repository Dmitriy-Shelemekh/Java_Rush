package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String input = bufferedReader.readLine();
            if (Integer.parseInt(input) == -1) break;
            list.add(Integer.parseInt(input));
        }

        int summ = 0;
        for (Integer element : list) {
            summ += element;
        }

        double avrg = (double) summ/list.size();
        System.out.println(avrg);
    }
}

