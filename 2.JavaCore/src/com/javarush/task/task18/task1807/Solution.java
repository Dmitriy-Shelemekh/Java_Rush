package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(filePath);
        int count = 0;

        while (inputStream.available() > 0) {
            int readByte = inputStream.read();
            if (readByte == 44) {
                count ++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
