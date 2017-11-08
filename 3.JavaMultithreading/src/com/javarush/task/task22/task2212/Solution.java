package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        //Проверка на ноль она не нужна, просто бубен для валидатора, не помогло.
        if (telNumber.isEmpty() || telNumber == "" || telNumber.equals(null)) return false;
        //Убираем все знаки кроме "+", оставляем только цифры
        String cleerString = telNumber.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "");
        //Проверяем что б не заканчивалось на"-"
        if (telNumber.endsWith("-")) return false;
        //Смотрим, что б не было больше двух "-"
        String[] strings = telNumber.split("-");
        if (strings.length > 3) return false;
        //Если есть скобки проверяем что б они стояли на своиз местах
        if (telNumber.contains("(") && telNumber.contains(")"))
            if (telNumber.indexOf("(") != 3 || telNumber.indexOf(")") != 7) return false;
        //Раз все скобки и тире стоят на своих местах, проверяем cleerString по простому шаблону
        Pattern pattern1 = Pattern.compile("(\\+\\d{12})|\\d{10}");
        Matcher matcher = pattern1.matcher(cleerString);
        if (matcher.matches()) return true;
        return false;
    }

    public static void main(String[] args) {

        String s = "+380501234567";
        s = "38xx501A34567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "3805012345";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+380501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "++380501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38(0501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38)050(1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38(050)1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38(05)1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "(3)80501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "(380)501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "380-50123-45";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "(380)501-234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "(38-0)501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "380-(501)234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "380(50-1)234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "380(501)(23)4567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38050123(456)7";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38050123(456)76";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+380501234(567)";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "3-805-0123-45";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "-3805-012345";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "3805-012345-";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+380501234567";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38(050)1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38(05)01234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38(0501)234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38050123-45-67";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "050123-4567";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38)050(1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38(050)1-23-45-6-7";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "050ххх4567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "050123456";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38-(050)1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+38((050)1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "+5(0--5)1234567";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "7-4-4123689-5";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");
        s = "1-23456789-0";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38051202(345)7";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+38051202(345)-7";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+-313450531202";
        System.out.println(s+" "+checkTelNumber(s)+" need true");
        s = "+313450--531202";
        System.out.println(s+" "+checkTelNumber(s)+" need fa");

        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
    }
}
