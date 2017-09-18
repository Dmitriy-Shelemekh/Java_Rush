package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String key;

        for (int i = 0; i < 10; i++) {
            key = reader.readLine();
            if (map.keySet().contains(key)) map.put(key, map.get(key) + 1);
            else map.put(key, 0);
        }

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Циферка: " + entry.getKey() + " Число повторов: " + entry.getValue());
//        }

        List list = Arrays.asList(map.values().toArray());
        Collections.sort(list);
        System.out.println(list.get(map.values().size() - 1));
    }
}