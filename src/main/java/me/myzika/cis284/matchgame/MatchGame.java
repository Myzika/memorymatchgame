package me.myzika.cis284.matchgame;

class MatchGame {

    public static void main(String args[]) {

        Instructions instructions = new Instructions();
        Checker checker = new Checker();
        Printer printer = new Printer();

        printer.title();
        instructions.printHow();
        printer.grid(checker.prompt(), checker.topic());



    }
}