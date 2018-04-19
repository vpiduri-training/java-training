package com.tommy.training;

import java.util.Scanner;

import com.tommy.training.tic_tac_toe.TicTacToe;
//
public class BoardGameApp {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Greetings and Salutations. Enjoy the games!");
		boolean userInputCheck = true;
		while (userInputCheck) {
			System.out.println("Player, choose your game! This program offers Tic-tac-toe. If you want to terminate, type Exit.");
			String gameSelection = input.nextLine();
			String gameSelectionLower = gameSelection.toLowerCase();
			BoardGame newGame = null;
			if (gameSelectionLower.equals("exit")) {
				userInputCheck = !userInputCheck;
				break;
			} else if (gameSelectionLower.equals("tic-tac-toe")) {
				newGame = new TicTacToe();
			} else {
				System.out.println("Invalid response received, Check spelling ");
				continue;
			}
			newGame.startGame();
		}

		input.close();
	}

}
