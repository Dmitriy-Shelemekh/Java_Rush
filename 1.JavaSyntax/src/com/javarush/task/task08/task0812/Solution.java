package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int maxRepeat = 1;
        int index = 0;
        int n;
        for (int i = 0; i < 10; i++) {
            n = Integer.parseInt(reader.readLine());
            list.add(n);
            if (list.get(index).equals(n)) {
                count++;
            } else {
                index = i;
                count = 1;
            }

            if (count > maxRepeat) {
                maxRepeat = count;
            }
        }
        System.out.println(maxRepeat);
    }
}