package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.ConsoleUtils;
import me.myzika.cis284.matchgame.util.Difficulty;

import java.util.ArrayList;
import java.util.List;

class MatchGame {

    public static void main(String args[]) {
        int score = 0;


        Instructions instructions = new Instructions();
        Checker checker = new Checker();
        Printer printer = new Printer();

        printer.title();
        instructions.printHow();
        String topic = checker.topic();
        Difficulty difficulty = checker.prompt();
        printer.grid(difficulty, topic);

        Reader reader = new Reader();

        if(topic.equalsIgnoreCase("psychology")) reader.read("src/main/java/me/myzika/cis284/matchgame/content/psychterms.txt");
        else if (topic.equalsIgnoreCase("elements")) reader.read("src/main/java/me/myzika/cis284/matchgame/content/elementsterms.txt");
        else System.err.println("This is an error! Please restart the program.");
        reader.search(difficulty);

        int total;
        boolean repeat = false;
        if (difficulty == Difficulty.EASY) total = 8;
        else if (difficulty == Difficulty.MEDIUM) total = 16;
        else total = 32;

        List<String> strings = new ArrayList<>();
        while (score <= total) {

            reader.interact();
            String term = reader.gameList.get(reader.x1 + reader.y1 - 1);
            String term2 = reader.gameList.get(reader.x2 + reader.y2 - 1);

            for (String item : strings) {
                if (term.equalsIgnoreCase(item)) repeat = true;
                else if (term2.equalsIgnoreCase(item)) repeat = true;
                else repeat = false;
            }

            if (!repeat) {
                printer.grid(difficulty, topic, reader.x1 - 1, reader.x2 - 1, reader.y1 - 1, reader.y2 - 1, term, term2);
                System.out.println(reader.x1 + ", " + reader.y1 + ", " + reader.x2 + ", " + reader.y2);
                System.out.println("Matches: " + score + "/" + total);

                if (term.equalsIgnoreCase(term2)) {
                    strings.add(term);
                    score++;
                }

                ConsoleUtils.wait(2000);

                printer.grid(difficulty, topic);
            } else System.out.println("You've already successfully done this pair!");
        }

    }
}