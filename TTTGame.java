package com.collabera.corejava.project.game;

public class TTTGame {

    public static void playGame() {

        boolean playing = true;

        while (playing) {

            System.out.println("Welcome to a game of Tic Tac Toe!");
            System.out.println("Please enter a number from 0-2.");
            printBoard();

        }

    }

    public static void printBoard() {

        for (int i = 3; i < 3; i++) {
            System.out.println();
            for (int j = 3; j < 3; j++) {
                System.out.println("k");
            }
        }
        System.out.println();

    }

}