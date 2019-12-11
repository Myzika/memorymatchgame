package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.Colors;
import me.myzika.cis284.matchgame.util.ConsoleUtils;
import me.myzika.cis284.matchgame.util.Difficulty;

/**
 * Prints out all graphics necessary
 */ 
class Printer {
    /**
     * Prints out the opening title screen
     */ 
    void title() {
        System.out.println(" __  __                                    _____                      \n|  \\/  |                                  / ____|                     \n| \\  / | ___ _ __ ___   ___  _ __ _   _  | |  __  __ _ _ __ ___   ___ \n| |\\/| |/ _ \\ \'_ ` _ \\ / _ \\| \'__| | | | | | |_ |/ _` | \'_ ` _ \\ / _ \\\n| |  | |  __/ | | | | | (_) | |  | |_| | | |__| | (_| | | | | | |  __/\n|_|  |_|\\___|_| |_| |_|\\___/|_|   \\__, |  \\_____|\\__,_|_| |_| |_|\\___|\n                                   __/ |                              \n                                  |___/                               \n");
    }

    private int dimension(Difficulty difficulty) {
        if (difficulty == Difficulty.EASY) {
            return 4;
        } else if (difficulty == Difficulty.MEDIUM) {
            return 6;
        } else if (difficulty == Difficulty.HARD) {
            return 8;
        } else {
            System.err.println("This wasn't supposed to happen! Please restart the application.");
            return 0;
        }
    }
    
    /**
     * Prints out a grid with size correlating to difficulty
     * @param topic the topic selected by the player
     */ 
    void grid(Difficulty difficulty, String topic) {
        ConsoleUtils.clearScreen();
        /*
         * Outside loop prints the y-axis coordinates
         * Inside loop prints the brackets as well as the topic word within
         */ 
        for (int i = 0; i < dimension(difficulty); i++) {
            System.out.print(Colors.RESET);
            System.out.print((i + 1));
            for (int j = 0; j < dimension(difficulty); j++) {
                System.out.print("\t" + Colors.BLUE + "[" + topic + "]");
            }
            System.out.println("\n");
        }

        System.out.print(Colors.RESET);
    }

    void grid(Difficulty difficulty, String topic, int x1, int x2, int y1, int y2,  String term1, String term2) {
        ConsoleUtils.clearScreen();
        /*
         * Outside loop prints the y-axis coordinates
         * Inside loop prints the brackets as well as the topic word within
         */
        for (int i = 0; i < dimension(difficulty); i++) {
            System.out.print(Colors.RESET);
            System.out.print((i + 1));
            for (int j = 0; j < dimension(difficulty); j++) {
                if((j == x1 && i == y1) || (j == x2 && i == y2)) {
                    if(topic.equalsIgnoreCase("elements")) {
                        if ((j == x1) && (i == y1))  System.out.print("\t" + Colors.BLUE + "[" + term1 + "\t\t]");
                        else System.out.print("\t" + Colors.BLUE + "[" + term2 + "\t\t]");
                    }
                    else if (topic.equalsIgnoreCase("psychology")) {
                        if ((j == x1) && (i == y1))  System.out.print("\t" + Colors.BLUE + "[" + term1 + "]");
                        else System.out.print("\t" + Colors.BLUE + "[" + term2 + "]");
                    }
                }
                else {
                    System.out.print("\t" + Colors.BLUE + "[" + topic + "]");
                }
            }
            System.out.println("\n");
        }

        System.out.print(Colors.RESET);
    }
}