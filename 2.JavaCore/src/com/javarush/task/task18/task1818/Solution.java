package com.javarush.task.task18.task1818;

/* 
Два в одном
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
        String fileThree = scanner.nextLine();

        FileOutputStream streamOne = new FileOutputStream(fileOne, true);
        FileInputStream streamTwo = new FileInputStream(fileTwo);
        FileInputStream streamThree = new FileInputStream(fileThree);

        while (streamTwo.available() > 0) {
            byte[] buffer = new byte[streamTwo.available()];
            streamTwo.read(buffer);
            streamOne.write(buffer);
        }

        while (streamThree.available() > 0) {
            byte[] buffer = new byte[streamThree.available()];
            streamThree.read(buffer);
            streamOne.write(buffer);
        }

        streamOne.close();
        streamTwo.close();
        streamThree.close();
    }
}
