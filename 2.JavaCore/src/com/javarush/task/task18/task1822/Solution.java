package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner fileName = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(fileName.nextLine());

        while (fileInputStream.available() > 0) {

        }

        fileInputStream.close();
    }
}
