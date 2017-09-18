package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(path);
        int minValue = inputStream.read();
        int readValue;
        while (inputStream.available() > 0) {
            readValue = inputStream.read();
            if (readValue < minValue) minValue = readValue;
        }
        inputStream.close();
        System.out.println(minValue);
    }
}
