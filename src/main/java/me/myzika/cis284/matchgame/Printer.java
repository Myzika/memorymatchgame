package me.myzika.cis284.matchgame;


import me.myzika.cis284.matchgame.util.Colors;
import me.myzika.cis284.matchgame.util.ConsoleUtils;
import me.myzika.cis284.matchgame.util.Difficulty;

/**
 * Prints out all graphics necessary
 */ 
class Printer {

    private int dimen;
    
    /**
     * Prints out the opening title screen
     */ 
    void title() {
        System.out.println(" __  __                                    _____                      \n|  \\/  |                                  / ____|                     \n| \\  / | ___ _ __ ___   ___  _ __ _   _  | |  __  __ _ _ __ ___   ___ \n| |\\/| |/ _ \\ \'_ ` _ \\ / _ \\| \'__| | | | | | |_ |/ _` | \'_ ` _ \\ / _ \\\n| |  | |  __/ | | | | | (_) | |  | |_| | | |__| | (_| | | | | | |  __/\n|_|  |_|\\___|_| |_| |_|\\___/|_|   \\__, |  \\_____|\\__,_|_| |_| |_|\\___|\n                                   __/ |                              \n                                  |___/                               \n");
    }
    
    /**
     * Prints out a grid with size correlating to difficulty
     * @param difficulty the difficulty selected by the player
     */ 
    void grid(Difficulty difficulty, String topic) {
        if (difficulty == Difficulty.EASY) {
            dimen = 2;
        } else if (difficulty == Difficulty.MEDIUM) {
            dimen = 6;
        } else if (difficulty == Difficulty.HARD) {
            dimen = 8;
        } else System.out.println("This wasn't supposed to happen! Please restart the application.");
        
        ConsoleUtils.clearScreen();
        

        /*
         * Outside loop prints the y-axis coordinates
         * Inside loop prints the brackets as well as the topic word within
         */ 
        for (int i = 0; i < dimen; i++) {
            System.out.print(Colors.RESET);
            System.out.print((i + 1));
            for (int j = 0; j < dimen; j++) {
                System.out.print("\t" + Colors.BLUE + "[" + topic + "]");
            }
            System.out.println("\n");
        }
    }
}