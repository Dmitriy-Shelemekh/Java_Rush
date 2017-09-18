package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String fileOneName = scanner.nextLine();
        String fileTwoName = scanner.nextLine();

        FileOutputStream fileOneWrite = new FileOutputStream(fileOneName, false);
        FileInputStream fileOneRead = new FileInputStream(fileOneName);
        FileInputStream fileTwoRead = new FileInputStream(fileTwoName);

        byte[] fileOneBuffer = new byte[fileOneRead.available()];
        byte[] fileTwoBuffer = new byte[fileTwoRead.available()];

        while (fileOneRead.available() > 0) {
            fileOneRead.read(fileOneBuffer);
        }

        while (fileTwoRead.available() > 0) {
            fileTwoRead.read(fileTwoBuffer);
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(fileTwoBuffer);
        byteArrayOutputStream.write(fileOneBuffer);
        byte[] buffer = byteArrayOutputStream.toByteArray();

        fileOneWrite.write(buffer);

        fileOneWrite.close();
        fileOneRead.close();
        fileTwoRead.close();
        byteArrayOutputStream.close();
    }
}
