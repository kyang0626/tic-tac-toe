package com.collabera.corejava.project.game;

import java.util.Scanner;

public class GameRunner extends TTTGame {
	
	Scanner sc = new Scanner(System.in);
	public static int gameBoard[] = new int[9];
	public static char turn = 'X';
	
	
	public static void main(String[] args) {
		
		playGame();
		System.out.println("testing");
		
	}
	
}