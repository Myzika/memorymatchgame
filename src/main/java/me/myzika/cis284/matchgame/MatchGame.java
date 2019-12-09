package me.myzika.cis284.matchgame;

import me.myzika.cis284.matchgame.util.ConsoleUtils;
import org.apache.commons.lang3.time.StopWatch;

import static me.myzika.cis284.matchgame.util.ConsoleUtils.timer;

class MatchGame {

    public static void main(String args[]) {

//        Instructions instructions = new Instructions();
//        Checker checker = new Checker();
//        Printer printer = new Printer();
//
//        printer.title();
//        instructions.printHow();
//        printer.grid(checker.prompt(), checker.topic());

//timer();

        Reader reader = new Reader();
        reader.read("/Users/briannawong/matchgame/src/main/java/me/myzika/cis284/matchgame/content/psychterms.txt");
        reader.search();

    }
}