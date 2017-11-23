package com.javarush.task.task14.task1408;

/**
 * Created by Sukora Stas.
 */
public class RussianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
