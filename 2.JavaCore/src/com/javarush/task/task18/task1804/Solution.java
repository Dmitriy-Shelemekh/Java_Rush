package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        FileInputStream inputStream = new FileInputStream(filePath);
        Map<Integer, Integer> bytesMap = new HashMap<>();

        while (inputStream.available() > 0) {
            int readByte = inputStream.read();
            if (bytesMap.containsKey(readByte)) {
                bytesMap.put(readByte, bytesMap.get(readByte) + 1);
            } else {
                bytesMap.put(readByte, 1);
            }
        }

        int minCount = 1;
        for (Integer element : bytesMap.values()) {
            if (element < minCount) {
                minCount = element;
            }
        }

        for (Map.Entry<Integer, Integer> entry : bytesMap.entrySet()) {
            if (entry.getValue().equals(minCount)) {
                System.out.print(entry.getKey() + " ");
            }
        }

        inputStream.close();
    }
}
