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
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(path);

        Map<Integer, Integer> bytesMap = new HashMap<>();

        while (inputStream.available() > 0) {
            int readValue = inputStream.read();
            if (bytesMap.keySet().contains(readValue)) {
                bytesMap.put(readValue, bytesMap.get(readValue) + 1);
            } else bytesMap.put(readValue, 1);
        }

        int minCount = 10;
        for (Integer element : bytesMap.values()) {
            if (element < minCount) {
                minCount = element;
            }
        }

        for (Map.Entry<Integer, Integer> entry : bytesMap.entrySet()) {
            if (entry.getValue().equals(minCount)) {
                System.out.println(entry.getKey());
            }
        }

        inputStream.close();
        scanner.close();
    }
}
