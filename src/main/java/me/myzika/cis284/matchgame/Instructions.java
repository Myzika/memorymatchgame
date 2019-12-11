package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.Colors;
import me.myzika.cis284.matchgame.util.ConsoleUtils;

import java.util.Scanner;

class Instructions {

    void printHow() {
        System.out.println("Instructions for the game:");
        System.out.print("This is, essentially, a test of your memory. ");
        System.out.print("The objective of this game is to match different pairs of words or phrases. ");
        System.out.println("When you successfully match a pair, you will receive a short informational excerpt or description on said word or phrase. ");
        System.out.print("However, you are also being timed. ");
        System.out.print("You have a maximum time limit of 15 minutes per game. ");
        System.out.print("The shorter your time the better! ");
        System.out.print("In order to select the pairs, you will enter in the coordinates of the location of your choosing. The coordinates must be written in x, y format. Your grids will be labelled to make the selection process simpler for you. ");
        System.out.println("Good luck!");

        System.out.println(Colors.GREEN_BOLD + "Please type anything in order to confirm that you have read the instructions." + Colors.RESET);

        Scanner in = new Scanner(System.in);
        in.next();

        ConsoleUtils.clearScreen();
    }

    void howEnter() {
        System.out.println(Colors.PURPLE_BOLD_BRIGHT);
        System.out.println("The way you need to enter your coordinates will be exactly like this: 2 8. The first number is the x value and the second is the y value. Do not put a comma between the numbers. After you press enter, you can enter your next set of coordinates.");
        System.out.println(Colors.RESET);
    }
}