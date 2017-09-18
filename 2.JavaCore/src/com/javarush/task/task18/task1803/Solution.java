package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(path);
        int readByte;
        Map<Integer, Integer> bytesMap = new HashMap<>();
        while (fileInputStream.available() > 0) {
            readByte = fileInputStream.read();
            if (bytesMap.keySet().contains(readByte)) {
                bytesMap.put(readByte, bytesMap.get(readByte) + 1);
            } else bytesMap.put(readByte, 0);
        }
    }
}
