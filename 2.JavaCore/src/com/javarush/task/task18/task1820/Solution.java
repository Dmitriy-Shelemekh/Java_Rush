package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String fileOne = scanner.nextLine();
        String fileTwo = scanner.nextLine();

        FileInputStream streamFileOne = new FileInputStream(fileOne);
        FileOutputStream streamFileTwo = new FileOutputStream(fileTwo);

        byte[] buffer = new byte[streamFileOne.available()];

        while (streamFileOne.available() > 0) {
            streamFileOne.read(buffer);
        }

        String fileOneStr = new String(buffer);
        String[] numbers = fileOneStr.split(" ");

        for (String number : numbers) {
            long roundNumber = Math.round(Double.parseDouble(number));
            String output = roundNumber + " ";
            streamFileTwo.write(output.getBytes());
        }

        streamFileOne.close();
        streamFileTwo.close();
    }
}
