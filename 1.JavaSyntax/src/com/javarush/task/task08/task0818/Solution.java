package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 300);
        map.put("Two", 1000);
        map.put("Three", 400);
        map.put("Fore", 1000);
        map.put("Five", 1000);
        map.put("Six", 1000);
        map.put("Seven", 1000);
        map.put("Eight", 1000);
        map.put("Nine", 1000);
        map.put("Ten", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int) pair.getValue() < 500)
                iterator.remove();
        }

//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            if (pair.getValue() < 500) {
//                map.remove(pair.getKey());
//            }
//        }
    }

    public static void main(String[] args) {
//        HashMap<String , Integer> map =  createMap();
//        removeItemFromMap(map);
//        for (Map.Entry<String , Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}