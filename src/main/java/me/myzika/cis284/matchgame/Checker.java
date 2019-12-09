package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.Colors;
import me.myzika.cis284.matchgame.util.Difficulty;

import java.util.Scanner;

class Checker {

    private static final String invalidInput = "This input is not valid. Please try again.";

    /**
     * Asks for the user to select a difficulty level
     *
     * @return difficulty selected difficulty level
     */
    public Difficulty prompt() {
        System.out.println("There are three different difficulties which you can select.");
        System.out.println("The first difficulty level is " + Colors.GREEN_BOLD_BRIGHT + "easy" + Colors.RESET + " which will let you play on a 4 x 4 grid where the selected pair will display for 6 seconds.");
        System.out.println("The second difficulty level is " + Colors.YELLOW_BOLD_BRIGHT + "medium" + Colors.RESET + " which will let you play on a 6 x 6 grid where the selected pair will display for 4 seconds.");
        System.out.println("The third difficulty level is " + Colors.RED_BOLD_BRIGHT + "hard" + Colors.RESET + " which will let you play on a 8 x 8 grid where the selected pair will display for 2 seconds.");
        System.out.println("Please select a difficulty level by stating either the number or the colored name of the difficulty you would like.");
        System.out.println(Colors.RESET);

        Scanner in = new Scanner(System.in);

        while (true) {
            String userInput = in.next();
            if (userInput.equalsIgnoreCase("easy") || userInput.equalsIgnoreCase("1")) {
                return Difficulty.EASY;
            } else if (userInput.equalsIgnoreCase("medium") || userInput.equalsIgnoreCase("2")) {
                return Difficulty.MEDIUM;
            } else if (userInput.equalsIgnoreCase("hard") || userInput.equalsIgnoreCase("3")) {
                return Difficulty.HARD;
            } else System.out.println(invalidInput);
        }
    }

    public String topic() {
        System.out.println();
        System.out.println("Next, you need to select what topic your game will be about. Even if you have already done a topic before, you can do it again as the list of words used in your game are randomly selected from a larger list.");
        System.out.println(Colors.RED_BOLD + "The topics which you can choose from are: ");
        System.out.println(Colors.YELLOW_BOLD + "1. Abnormal Psychology");
        System.out.println(Colors.GREEN_BOLD + "2. Periodic Table of Elements");
        System.out.println(Colors.RESET + "You can select your topic by typing the last word of the topic you want or by entering in the number of the topic of your choosing.");

        Scanner in = new Scanner(System.in);

        while (true) {
            String userInput = in.nextLine();
            if (userInput.equalsIgnoreCase("psychology") || userInput.equalsIgnoreCase("1")) {
                return "psychology";
            } else if (userInput.equalsIgnoreCase("elements") || userInput.equalsIgnoreCase("2")) {
                return "elements";
            } else System.out.println(invalidInput);
        }
    }
}