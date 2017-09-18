package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner fileOne = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(fileOne.nextLine()));

        while (reader.ready()) {
            String readLine = reader.readLine();
            if (readLine.startsWith(args[0])) {
                System.out.println(readLine);
            }
        }

        reader.close();
    }
}
