package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.Difficulty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Reader {
    List elements = new ArrayList();

    void read(String name) {
        File file = new File(name);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                elements.add(s);
//                sc.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.shuffle(elements);
    }
//    Difficulty difficulty, int x, int y
    void search() {
        List gameList = new ArrayList();
        for (int i = 0; i < 8; i++) {gameList.add(elements.get(i));}
        System.out.println(gameList);
    }
}