package com.tommy.training.battleship;

import com.tommy.training.BoardGame;
import com.tommy.training.BoardGameApp;

public class BattleshipGame implements BoardGame {
	private boolean whichPlayerTurn = true;
	private boolean gameOver = false;
	private boolean UserInputValidation = true;
	
	@Override
	public void startGame() {
		char[][] gridValuesPlayerOne = new char[][] { { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }, };

		char[][] gridValuesPlayerTwo = new char[][] { { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }, };

		printInstructions();
		Boats[] PlayerOne = new Boats[5];
		Boats[] PlayerTwo = new Boats[5];
		
		printBoardState(whichPlayerTurn, gridValuesPlayerOne, gridValuesPlayerTwo);
		for (int i = 0; i < 200; i++) {
			takeUserInput(gridValuesPlayerOne, gridValuesPlayerTwo);
			if (gameOver) {
				break;
			}
		}
		if (!gameOver) {
			System.out.println("Cat's Game! Restart the program to play again.");
		}

	}
	
	@Override
	public void printInstructions() {
		// Develop Syso statement for inherited printInstructions for game Battleship.
		System.out.println();
	}

	public void printBoardState(boolean whichPlayerTurn, char[][] gridValuesPlayerOne, char[][] gridValuesPlayerTwo) {
		if (whichPlayerTurn) {
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[0][0] + "    | |    " + gridValuesPlayerOne[0][1]
					+ "    | |    " + gridValuesPlayerOne[0][2] + "    | |    " + gridValuesPlayerOne[0][3]
					+ "    | |    " + gridValuesPlayerOne[0][4] + "    | |    " + gridValuesPlayerOne[0][5]
					+ "    | |    " + gridValuesPlayerOne[0][6] + "    | |    " + gridValuesPlayerOne[0][7]
					+ "    | |    " + gridValuesPlayerOne[0][8] + "    | |    " + gridValuesPlayerOne[0][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[1][0] + "    | |    " + gridValuesPlayerOne[1][1]
					+ "    | |    " + gridValuesPlayerOne[1][2] + "    | |    " + gridValuesPlayerOne[1][3]
					+ "    | |    " + gridValuesPlayerOne[1][4] + "    | |    " + gridValuesPlayerOne[1][5]
					+ "    | |    " + gridValuesPlayerOne[1][6] + "    | |    " + gridValuesPlayerOne[1][7]
					+ "    | |    " + gridValuesPlayerOne[1][8] + "    | |    " + gridValuesPlayerOne[1][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[2][0] + "    | |    " + gridValuesPlayerOne[2][1]
					+ "    | |    " + gridValuesPlayerOne[2][2] + "    | |    " + gridValuesPlayerOne[2][3]
					+ "    | |    " + gridValuesPlayerOne[2][4] + "    | |    " + gridValuesPlayerOne[2][5]
					+ "    | |    " + gridValuesPlayerOne[2][6] + "    | |    " + gridValuesPlayerOne[2][7]
					+ "    | |    " + gridValuesPlayerOne[2][8] + "    | |    " + gridValuesPlayerOne[2][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[3][0] + "    | |    " + gridValuesPlayerOne[3][1]
					+ "    | |    " + gridValuesPlayerOne[3][2] + "    | |    " + gridValuesPlayerOne[3][3]
					+ "    | |    " + gridValuesPlayerOne[3][4] + "    | |    " + gridValuesPlayerOne[3][5]
					+ "    | |    " + gridValuesPlayerOne[3][6] + "    | |    " + gridValuesPlayerOne[3][7]
					+ "    | |    " + gridValuesPlayerOne[3][8] + "    | |    " + gridValuesPlayerOne[3][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[4][0] + "    | |    " + gridValuesPlayerOne[4][1]
					+ "    | |    " + gridValuesPlayerOne[4][2] + "    | |    " + gridValuesPlayerOne[4][3]
					+ "    | |    " + gridValuesPlayerOne[4][4] + "    | |    " + gridValuesPlayerOne[4][5]
					+ "    | |    " + gridValuesPlayerOne[4][6] + "    | |    " + gridValuesPlayerOne[4][7]
					+ "    | |    " + gridValuesPlayerOne[4][8] + "    | |    " + gridValuesPlayerOne[4][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[5][0] + "    | |    " + gridValuesPlayerOne[5][1]
					+ "    | |    " + gridValuesPlayerOne[5][2] + "    | |    " + gridValuesPlayerOne[5][3]
					+ "    | |    " + gridValuesPlayerOne[5][4] + "    | |    " + gridValuesPlayerOne[5][5]
					+ "    | |    " + gridValuesPlayerOne[5][6] + "    | |    " + gridValuesPlayerOne[5][7]
					+ "    | |    " + gridValuesPlayerOne[5][8] + "    | |    " + gridValuesPlayerOne[5][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[6][0] + "    | |    " + gridValuesPlayerOne[6][1]
					+ "    | |    " + gridValuesPlayerOne[6][2] + "    | |    " + gridValuesPlayerOne[6][3]
					+ "    | |    " + gridValuesPlayerOne[6][4] + "    | |    " + gridValuesPlayerOne[6][5]
					+ "    | |    " + gridValuesPlayerOne[6][6] + "    | |    " + gridValuesPlayerOne[6][7]
					+ "    | |    " + gridValuesPlayerOne[6][8] + "    | |    " + gridValuesPlayerOne[6][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[7][0] + "    | |    " + gridValuesPlayerOne[7][1]
					+ "    | |    " + gridValuesPlayerOne[7][2] + "    | |    " + gridValuesPlayerOne[7][3]
					+ "    | |    " + gridValuesPlayerOne[7][4] + "    | |    " + gridValuesPlayerOne[7][5]
					+ "    | |    " + gridValuesPlayerOne[7][6] + "    | |    " + gridValuesPlayerOne[7][7]
					+ "    | |    " + gridValuesPlayerOne[7][8] + "    | |    " + gridValuesPlayerOne[7][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[8][0] + "    | |    " + gridValuesPlayerOne[8][1]
					+ "    | |    " + gridValuesPlayerOne[8][2] + "    | |    " + gridValuesPlayerOne[8][3]
					+ "    | |    " + gridValuesPlayerOne[8][4] + "    | |    " + gridValuesPlayerOne[8][5]
					+ "    | |    " + gridValuesPlayerOne[8][6] + "    | |    " + gridValuesPlayerOne[8][7]
					+ "    | |    " + gridValuesPlayerOne[8][8] + "    | |    " + gridValuesPlayerOne[8][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerOne[9][0] + "    | |    " + gridValuesPlayerOne[9][1]
					+ "    | |    " + gridValuesPlayerOne[9][2] + "    | |    " + gridValuesPlayerOne[9][3]
					+ "    | |    " + gridValuesPlayerOne[9][4] + "    | |    " + gridValuesPlayerOne[9][5]
					+ "    | |    " + gridValuesPlayerOne[9][6] + "    | |    " + gridValuesPlayerOne[9][7]
					+ "    | |    " + gridValuesPlayerOne[9][8] + "    | |    " + gridValuesPlayerOne[9][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
		} else {
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[0][0] + "    | |    " + gridValuesPlayerTwo[0][1]
					+ "    | |    " + gridValuesPlayerTwo[0][2] + "    | |    " + gridValuesPlayerTwo[0][3]
					+ "    | |    " + gridValuesPlayerTwo[0][4] + "    | |    " + gridValuesPlayerTwo[0][5]
					+ "    | |    " + gridValuesPlayerTwo[0][6] + "    | |    " + gridValuesPlayerTwo[0][7]
					+ "    | |    " + gridValuesPlayerTwo[0][8] + "    | |    " + gridValuesPlayerOne[0][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[1][0] + "    | |    " + gridValuesPlayerTwo[1][1]
					+ "    | |    " + gridValuesPlayerTwo[1][2] + "    | |    " + gridValuesPlayerTwo[1][3]
					+ "    | |    " + gridValuesPlayerTwo[1][4] + "    | |    " + gridValuesPlayerTwo[1][5]
					+ "    | |    " + gridValuesPlayerTwo[1][6] + "    | |    " + gridValuesPlayerTwo[1][7]
					+ "    | |    " + gridValuesPlayerTwo[1][8] + "    | |    " + gridValuesPlayerTwo[1][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[2][0] + "    | |    " + gridValuesPlayerTwo[2][1]
					+ "    | |    " + gridValuesPlayerTwo[2][2] + "    | |    " + gridValuesPlayerTwo[2][3]
					+ "    | |    " + gridValuesPlayerTwo[2][4] + "    | |    " + gridValuesPlayerTwo[2][5]
					+ "    | |    " + gridValuesPlayerTwo[2][6] + "    | |    " + gridValuesPlayerTwo[2][7]
					+ "    | |    " + gridValuesPlayerTwo[2][8] + "    | |    " + gridValuesPlayerTwo[2][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[3][0] + "    | |    " + gridValuesPlayerTwo[3][1]
					+ "    | |    " + gridValuesPlayerTwo[3][2] + "    | |    " + gridValuesPlayerTwo[3][3]
					+ "    | |    " + gridValuesPlayerTwo[3][4] + "    | |    " + gridValuesPlayerTwo[3][5]
					+ "    | |    " + gridValuesPlayerTwo[3][6] + "    | |    " + gridValuesPlayerTwo[3][7]
					+ "    | |    " + gridValuesPlayerTwo[3][8] + "    | |    " + gridValuesPlayerTwo[3][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[4][0] + "    | |    " + gridValuesPlayerTwo[4][1]
					+ "    | |    " + gridValuesPlayerTwo[4][2] + "    | |    " + gridValuesPlayerTwo[4][3]
					+ "    | |    " + gridValuesPlayerTwo[4][4] + "    | |    " + gridValuesPlayerTwo[4][5]
					+ "    | |    " + gridValuesPlayerTwo[4][6] + "    | |    " + gridValuesPlayerTwo[4][7]
					+ "    | |    " + gridValuesPlayerTwo[4][8] + "    | |    " + gridValuesPlayerTwo[4][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[5][0] + "    | |    " + gridValuesPlayerTwo[5][1]
					+ "    | |    " + gridValuesPlayerTwo[5][2] + "    | |    " + gridValuesPlayerTwo[5][3]
					+ "    | |    " + gridValuesPlayerTwo[5][4] + "    | |    " + gridValuesPlayerTwo[5][5]
					+ "    | |    " + gridValuesPlayerTwo[5][6] + "    | |    " + gridValuesPlayerTwo[5][7]
					+ "    | |    " + gridValuesPlayerTwo[5][8] + "    | |    " + gridValuesPlayerTwo[5][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[6][0] + "    | |    " + gridValuesPlayerTwo[6][1]
					+ "    | |    " + gridValuesPlayerTwo[6][2] + "    | |    " + gridValuesPlayerTwo[6][3]
					+ "    | |    " + gridValuesPlayerTwo[6][4] + "    | |    " + gridValuesPlayerTwo[6][5]
					+ "    | |    " + gridValuesPlayerTwo[6][6] + "    | |    " + gridValuesPlayerTwo[6][7]
					+ "    | |    " + gridValuesPlayerTwo[6][8] + "    | |    " + gridValuesPlayerTwo[6][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[7][0] + "    | |    " + gridValuesPlayerTwo[7][1]
					+ "    | |    " + gridValuesPlayerTwo[7][2] + "    | |    " + gridValuesPlayerTwo[7][3]
					+ "    | |    " + gridValuesPlayerTwo[7][4] + "    | |    " + gridValuesPlayerTwo[7][5]
					+ "    | |    " + gridValuesPlayerTwo[7][6] + "    | |    " + gridValuesPlayerTwo[7][7]
					+ "    | |    " + gridValuesPlayerTwo[7][8] + "    | |    " + gridValuesPlayerTwo[7][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[8][0] + "    | |    " + gridValuesPlayerTwo[8][1]
					+ "    | |    " + gridValuesPlayerTwo[8][2] + "    | |    " + gridValuesPlayerTwo[8][3]
					+ "    | |    " + gridValuesPlayerTwo[8][4] + "    | |    " + gridValuesPlayerTwo[8][5]
					+ "    | |    " + gridValuesPlayerTwo[8][6] + "    | |    " + gridValuesPlayerTwo[8][7]
					+ "    | |    " + gridValuesPlayerTwo[8][8] + "    | |    " + gridValuesPlayerTwo[8][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
			System.out.println("|    " + gridValuesPlayerTwo[9][0] + "    | |    " + gridValuesPlayerTwo[9][1]
					+ "    | |    " + gridValuesPlayerTwo[9][2] + "    | |    " + gridValuesPlayerTwo[9][3]
					+ "    | |    " + gridValuesPlayerTwo[9][4] + "    | |    " + gridValuesPlayerTwo[9][5]
					+ "    | |    " + gridValuesPlayerTwo[9][6] + "    | |    " + gridValuesPlayerTwo[9][7]
					+ "    | |    " + gridValuesPlayerTwo[9][8] + "    | |    " + gridValuesPlayerTwo[9][9] + "    |");
			System.out.println(
					" - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -   - - - - -");
		}

	}
	public void initializeBoard(int[][] location) {
		boolean UserInputValidation = true;
		int rowIndex = -1;
		int columnIndex = -1;
		String inputCoords = BoardGameApp.input.nextLine();		
		String[] inputCoordsSplit = inputCoords.split(",");
		while(UserInputValidation) {
			
		}
	}

	private void takeUserInput(char[][] gridValuesPlayerOne, char[][] gridValuesPlayerTwo) {
		if(whichPlayerTurn) {
			System.out.println();
		} else {
			System.out.println();
		}
		
		int rowIndex = -1;
		int columnIndex = -1;
		String inputCoords = BoardGameApp.input.nextLine();		
		String[] inputCoordsSplit = inputCoords.split(",");
		while(UserInputValidation) {
			
		}

	}

}
