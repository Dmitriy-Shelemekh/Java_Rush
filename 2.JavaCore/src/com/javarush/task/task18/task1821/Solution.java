package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream(args [0]);
        Map<Character, Integer> map = new TreeMap<>();

        while (fileReader.available() > 0) {
            char symbol = (char) fileReader.read();
            if (map.keySet().contains(symbol)) {
                map.put(symbol, map.get(symbol) + 1);
            } else map.put(symbol, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        fileReader.close();
    }
}
