package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String input = Integer.toString(number);
        int output = 0;
        for (char element : input.toCharArray()) {
            output += Integer.parseInt(String.valueOf(element));
        }
        return output;
    }
}