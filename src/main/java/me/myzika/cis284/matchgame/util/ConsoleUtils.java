package me.myzika.cis284.matchgame.util;

public class ConsoleUtils {
    public static void clearScreen() {
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }
}