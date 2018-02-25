package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    private static int even;
    private static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        for (char element : input.toCharArray()) {
            if (element % 2 == 0) even += 1;
            else odd += 1;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
