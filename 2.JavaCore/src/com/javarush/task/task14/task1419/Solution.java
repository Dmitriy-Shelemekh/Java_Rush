package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] arrays = new int[2];
            arrays[3] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> i = new ArrayList<Integer>();
            i.add(1);
            for (int j = 0; j < 2; j++) {
                i.get(j);
            }
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            FileInputStream file = new FileInputStream("sss");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            int[] i = new int[-2];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            Random r = null;
            int i = r.nextInt();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            String s = "str";
            System.out.println(s.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int i = Integer.parseInt("big");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            Object j = new Character('w');
            System.out.println((byte) j);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
    }
}
