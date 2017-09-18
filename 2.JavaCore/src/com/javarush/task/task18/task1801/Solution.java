package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(path);
        int maxValue = 0;
        int readValue;
        while (inputStream.available() > 0) {
            readValue = inputStream.read();
            if (readValue > maxValue) maxValue = readValue;
        }
        inputStream.close();
        System.out.println(maxValue);
    }
}
