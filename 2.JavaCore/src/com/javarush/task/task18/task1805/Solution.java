package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(filePath);
        ArrayList<Integer> bytesList = new ArrayList<>();

        while (inputStream.available() > 0) {
            int readByte = inputStream.read();
            if (!bytesList.contains(readByte)) {
                bytesList.add(readByte);
            }
        }

        Collections.sort(bytesList);

        for (Integer element : bytesList) {
            System.out.print(element + " ");
        }

        inputStream.close();
    }
}
