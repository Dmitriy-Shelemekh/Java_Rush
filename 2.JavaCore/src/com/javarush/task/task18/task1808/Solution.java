package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String file_1 = scanner.nextLine();
        String file_2 = scanner.nextLine();
        String file_3 = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(file_1);

        FileOutputStream outputStream_1 = new FileOutputStream(file_2);
        FileOutputStream outputStream_2 = new FileOutputStream(file_3);

        int fileSize = inputStream.available();
        int half = fileSize % 2 == 0 ? fileSize / 2 : fileSize / 2 + 1;

        byte[] bufer_1 = new byte[half];
        byte[] bufer_2 = new byte[fileSize - half];

        while (inputStream.available() > 0) {
            inputStream.read(bufer_1);
            inputStream.read(bufer_2);

            outputStream_1.write(bufer_1);
            outputStream_2.write(bufer_2);
        }

        inputStream.close();
        outputStream_1.close();
        outputStream_2.close();
    }
}
