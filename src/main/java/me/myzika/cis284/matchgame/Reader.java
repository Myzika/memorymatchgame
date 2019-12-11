package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.Difficulty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Reader {
    private List<String> elements = new ArrayList<>();
    List<String> gameList = new ArrayList<>();
    private int wordCount = 0;
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    void read(String name) {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory, name);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                elements.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.shuffle(elements);
    }

    void search(Difficulty difficulty) {

        if (difficulty == Difficulty.EASY) wordCount = 8;
        else if (difficulty == Difficulty.MEDIUM) wordCount = 16;
        else if (difficulty == Difficulty.HARD) wordCount = 32;

        for (int i = 0; i < wordCount; i++) {
            gameList.add(elements.get(i));
            gameList.add(elements.get(i));
        }

        Collections.shuffle(gameList);
    }

    void interact() {
        Scanner input = new Scanner(System.in);
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
    }
}