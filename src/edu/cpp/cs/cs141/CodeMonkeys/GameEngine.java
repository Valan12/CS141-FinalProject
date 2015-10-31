/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment 
 *
 * Program Description:
 *
 */
package edu.cpp.cs.cs141.CodeMonkeys;

import java.util.Random;

/**
 * @author Code Monkeys John Vincent Canalita Roland Lee Nicholas Pham Joshua
 *         Viray
 */
public class GameEngine {

	// Fields go here should there be any
	/**
	 * Field that SETS the GAME FLOOR.
	 */
	private String[][] gameGrid = new String[9][9];

	/**
	 * Field that SETS the BRIEFCASE LOCATION
	 */
	private String[][] location = new String[9][9];

	// create the objects
	private Grid roomLayout = new Grid();
	private UI narrator = new UI();
	private Player spy = new Player();

	/**
	 * Method that sets the grid
	 */
	public void setGrid() {
		gameGrid = roomLayout.initiateGameStage(gameGrid);
		narrator.printRoom(gameGrid);
	}

	/**
	 * Method that sets the briefcase location.
	 */
	public void setBriefCaseLocation() {
		roomLayout.briefCaseLocation(location);
		narrator.printRoom(location);
	}

	/**
	 * Method that will spawn the player
	 */
	public void spawnPlayer() {
		roomLayout.spawnPlayer(gameGrid);
		narrator.printRoom(gameGrid);
	}

	public String[][] getGameGrid() {
		return gameGrid;
	}

	public String[][] mockMove(int a, int b, String[][] gameGrid) {

		// Prints out where player is
		// Ask them where to go
		// Runs to where the player should be, then run isValid
		// If valid, print out new location, if not, ask them to rechoose.

		gameGrid[a][b] = "[_]";
		// narrator.printRoom(gameGrid);
		int direction = narrator.moveSelection();
		spy.playerPosition(direction);
		a = spy.getVCoord();
		b = spy.getHCoord();
		if (this.isValidMovement(gameGrid) == true) {
			gameGrid[a][b] = "[P]";
			narrator.printRoom(getGameGrid());
			return gameGrid;
		} else {
			narrator.invalidMovement();
			return gameGrid;
		}
	}

	// create a catch for when its out of bounds and create a method to check
	// for rooms
	public boolean isValidMovement(String[][] gameGrid) {
		int a, b;
		b = spy.getHCoord();
		a = spy.getVCoord();
		if (gameGrid[a][b] != "[R]" && a > -1 && a < 9 && b > -1 && b < 9) {
			return true;
		} else {
			return false;
		}
	}

	// game loop: do while loop and has conditions for ___
	// print the room layout
	// call the UI and ask the player what to do (player turn)
	// then the enemies 'take' their turn (enemy turn)
	public void gameOn() {

	}

	// method for the player turn
	// does all the math for moving and positioning
	public void playerTurn() {

	}

	// method for the enemy turn
	// does all the math AND takes into consideration invalid movement
	public void enemyTurn() {

	}

	/**
	 * Method that will be used to randomize the position of the enemies and the
	 * powerups.
	 * 
	 * @return Returns a number from 0 to 8 which will represent the coordinates
	 *         of the game map.
	 */
	public int randomizer() {
		Random random = new Random();
		int number = random.nextInt(9);
		return number;
	}
	
	public int  movementRandomizer(){
	Random random = new Random();
	int number = random.nextInt(4);
	return number;
	}

}
