package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

//        String url = "http://javarush.ru/alpha/index.html?obj=xxx&name=Amigo";

        ArrayList<String> paramsList = new ArrayList<>();
        String param = "";
        char[] charArray = url.substring(url.indexOf("?")).toCharArray();

        String obj = "";

        for (int i = 0; i < charArray.length; i++) {
            param = param + charArray[i];
            if (charArray[i] == '&' || i == charArray.length - 1) {
                paramsList.add(param);
                param = "";
            }
        }

        for (String s : paramsList) {
            if (s.contains("obj")) obj = s;
        }

        for (int i = 0; i < paramsList.size(); i++) {
            String tmp = paramsList.get(i);
            try {
                tmp = tmp.substring(0, tmp.indexOf("="));
            } catch (StringIndexOutOfBoundsException e) {
            }
            tmp = tmp.replace("&", "").replace("?", "");
            paramsList.remove(i);
            paramsList.add(i, tmp);
        }

        for (String s : paramsList) System.out.print(s + " ");

        if (!obj.equals("")) {
            String tmp = obj.replace("&", "").replace("?", "");
            tmp = tmp.substring(tmp.indexOf("=") + 1);

            try {
                alert(Double.parseDouble(tmp));
            } catch (NumberFormatException e) {
                alert(tmp);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("\ndouble " + value);
    }

    public static void alert(String value) {
        System.out.println("\nString " + value);
    }
}

