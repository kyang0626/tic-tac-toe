package com.collabera.corejava.project.game;

import java.util.Scanner;

public class TicTacToe {

    public static int rows, cols;
    public static Scanner sc = new Scanner(System.in);
    public static char[][] gameBoard = new char[3][3];
    public static char turn = 'X';

    public static void main(String[] args) {

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                gameBoard[a][b] = '_';
            }
        }

        playGame();

    }

    public static void playGame() {
        boolean playing = true;

        while (playing) {
            System.out.println("Welcome to a game of tic-tac-toe!");
            System.out.println("Enter a row number from 0-2. Then, enter a column number from 0-2");

            System.out.println();

            printBoard();
            rows = sc.nextInt();
            cols = sc.nextInt();
            gameBoard[rows][cols] = turn;
            if (GameIsOver(rows, cols)) {
                playing = false;
                System.out.println("The game is over!. Player " + turn + " wins.");
            }

            printBoard();

            if (turn == 'X')
                turn = 'O';

            else
                turn = 'X';
        }

    }

    public static void printBoard() {

        for (int a = 0; a < 3; a++) {
            System.out.println();

            for (int b = 0; b < 3; b++) {
                if (b == 0)
                    System.out.print("| ");
                System.out.print(gameBoard[a][b] + " | ");
            }
        }
        System.out.println();
    }

    public static boolean GameIsOver(int xPosn, int oPosn) {

        if (gameBoard[0][oPosn] == gameBoard[1][oPosn] && gameBoard[0][oPosn] == gameBoard[2][oPosn])
            return true;
        if (gameBoard[xPosn][0] == gameBoard[xPosn][1] && gameBoard[xPosn][0] == gameBoard[xPosn][2])
            return true;
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] & gameBoard[1][1] != '_')
            return true;
        if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][2] && gameBoard[1][1] != '_')
            return true;
        return false;
    }

}
