package com.tommy.training.tic_tac_toe;

import com.tommy.training.BoardGame;
import com.tommy.training.BoardGameApp;

public class TicTacToe implements BoardGame {
	private boolean isPlayerXTurn = true;
	private boolean gameOver = false;

	@Override
	public void printInstructions() {
		System.out.println("Every turn, the player will type their desired input's direction.");
		System.out.println();
		System.out.println("You will have to seperate the two directions with a hyphen.");
		System.out.println();
		System.out.println("I.E. Top-Left/Middle-Middle/Bottom-Right are all valid input.");
		System.out.println();
		System.out.println("Every input you must separate the vertical (top, middle, bottom)");
		System.out.println();
		System.out.println("with the horizontal (left, middle, right). Do not worry about capitalization!");
	}

	public void printBoardState(String[][] values) {

		System.out.println(" - - - - -   - - - - -   - - - - -");
		System.out.println(
				"|    " + values[0][0] + "    | |    " + values[0][1] + "    | |    " + values[0][2] + "    |");
		System.out.println(" - - - - -   - - - - -   - - - - -");
		System.out.println(" - - - - -   - - - - -   - - - - -");
		System.out.println(
				"|    " + values[1][0] + "    | |    " + values[1][1] + "    | |    " + values[1][2] + "    |");
		System.out.println(" - - - - -   - - - - -   - - - - -");
		System.out.println(" - - - - -   - - - - -   - - - - -");
		System.out.println(
				"|    " + values[2][0] + "    | |    " + values[2][1] + "    | |    " + values[2][2] + "    |");
		System.out.println(" - - - - -   - - - - -   - - - - -");

	}

	private void takeUserInput(String[][] values) {
		if (isPlayerXTurn) {
			System.out.println("X, it is your turn, Pick your co-ords.");
		} else {
			System.out.println("O, it is your turn, Pick your co-ords.");
		}
		int rowIndex = -1;
		int columnIndex = -1;
		boolean userInputIsNotValid = true;
		while (userInputIsNotValid) {
			String inputDirection = BoardGameApp.input.nextLine();
			inputDirection = inputDirection.toLowerCase();
			String[] inputDirectionSplit = inputDirection.split("-");
			if (inputDirectionSplit[0].equals("top")) {
				rowIndex = 0;
			} else if (inputDirectionSplit[0].equals("middle")) {
				rowIndex = 1;
			} else if (inputDirectionSplit[0].equals("bottom")) {
				rowIndex = 2;
			} else {
				System.out.println("Invalid response received.");
				continue;
			}
			if (inputDirectionSplit[1].equals("left")) {
				columnIndex = 0;
			} else if (inputDirectionSplit[1].equals("middle")) {
				columnIndex = 1;
			} else if (inputDirectionSplit[1].equals("right")) {
				columnIndex = 2;
			} else {
				System.out.println("Invalid response received.");
				continue;
			}
			if (!values[rowIndex][columnIndex].equals("X") && !values[rowIndex][columnIndex].equals("O")) {
				if (isPlayerXTurn) {
					values[rowIndex][columnIndex] = "X";
					userInputIsNotValid = false;
				} else {
					values[rowIndex][columnIndex] = "O";
					userInputIsNotValid = false;
				}
			} else {
				System.out.println("Invalid Move! Pick a new spot.");
				continue;
			}

		}
		printBoardState(values);
		checkWinConditions(values, rowIndex, columnIndex);
		isPlayerXTurn = !isPlayerXTurn;

	}

	private boolean checkRow(String[][] values, int rowIndex) {
		String playerToken = values[rowIndex][0];
		if (!playerToken.equals("X") && !playerToken.equals("O")) {
			return false;
		}
		for (int i = 1; i < values[rowIndex].length; i++) {
			if (!playerToken.equals(values[rowIndex][i])) {
				return false;
			}
		}
		return true;
	}

	private boolean checkColumn(String[][] values, int columnIndex) {
		String playerToken = values[0][columnIndex];
		if (!playerToken.equals("X") && !playerToken.equals("O")) {
			return false;
		}
		for (int i = 1; i < values.length; i++) {
			if (!playerToken.equals(values[i][columnIndex])) {
				return false;
			}
		}
		return true;
	}

	private boolean checkDiagonals(String[][] values, int rowIndex, int columnIndex) {
		boolean isNotOnADiagonal = (rowIndex == 0 && columnIndex == 1)
				|| (rowIndex == 1 && (columnIndex == 0 || columnIndex == 2)) || (rowIndex == 2 && columnIndex == 1);
		if (isNotOnADiagonal) {
			return false;
		}
		if (checkDiagonal(values, rowIndex, columnIndex) || checkDiagonalTwo(values, rowIndex, columnIndex)) {
			return true;
		}
		return false;
	}

	private boolean checkDiagonal(String[][] values, int rowIndex, int columnIndex) {
		String playerToken = values[0][0];
		if (!playerToken.equals("X") && !playerToken.equals("O")) {
			return false;
		}
		for (int i = 1; i < values.length; i++) {
			if (!playerToken.equals(values[i][i])) {
				return false;
			}
		}
		return true;

	}

	private boolean checkDiagonalTwo(String[][] values, int rowIndex, int columnIndex) {
		String playerToken = values[0][2];
		if (!playerToken.equals("X") && !playerToken.equals("O")) {
			return false;
		}
		int j = 1;
		for (int i = 1; i < values.length; i++) {
			if (!playerToken.equals(values[i][j])) {
				return false;
			}
			j--;
		}
		return true;

	}

	private void checkWinConditions(String[][] values, int rowIndex, int columnIndex) {
		if (checkRow(values, rowIndex) || checkColumn(values, columnIndex)
				|| checkDiagonals(values, rowIndex, columnIndex)) {
			gameOver = true;
			if (isPlayerXTurn) {
				System.out.println("Player X has won! Good job!");
				
			} else {
				System.out.println("Player O has won! Good job!");
			}

		}
	}

	@Override
	public void startGame() {
		String[][] values = new String[][] { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-" } };
		printInstructions();
		printBoardState(values);
		for (int i = 0; i < 100; i++) {
			takeUserInput(values);
			if (gameOver) {
				break;
			}
		}
		if (!gameOver) {
			System.out.println("Cat's Game! Restart the program to play again.");
		}
		
	}

}