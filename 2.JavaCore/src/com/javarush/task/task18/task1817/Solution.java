package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);

        int spaces = 0;
        int chars = 0;
        int readByte;

        while (reader.ready()) {
            readByte = reader.read();
            chars++;
            if (readByte == 32) {
                spaces++;
            }

        }

        reader.close();

        System.out.println(String.format("%.2f", ((float) spaces / chars) * 100));
    }
}
