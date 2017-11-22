package com.javarush.task.task31.task3110;

import java.nio.file.Paths;

/**
 * Created by Dmitry Shelemekh on 22.11.2017.
 */
public class Archiver {
    public static void main(String[] args) throws Exception {
        ConsoleHelper.writeMessage("Введите полный путь к архиву: ");
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(ConsoleHelper.readString()));
        ConsoleHelper.writeMessage("Введите путь к архивируемому файлу: ");
        zipFileManager.createZip(Paths.get(ConsoleHelper.readString()));
    }
}
