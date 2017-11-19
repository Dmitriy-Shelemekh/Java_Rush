package com.javarush.task.task15.task1522;

import java.util.Scanner;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {

    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (s.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (s.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
