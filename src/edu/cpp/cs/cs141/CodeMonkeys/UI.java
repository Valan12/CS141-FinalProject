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

import java.util.Scanner; 

/**
 * @author Code Monkeys John Vincent Canalita Roland Lee Nicholas Pham Joshua
 *         Viray
 */
public class UI {

	private Scanner kb = new Scanner(System.in);
	
	/**
	 * Displays options to move, look, save, quit, and help. But there is a
	 * secret option, to access the debug mode, type 'debug.'
	 */
	public void userSelection() {
		System.out.println("What would you like to do?\n " + "1. Move\n"
				+ "2. Look\n" + "3. Shoot\n" + "4. Get Help\n" + "5. Save\n"
				+ "6. Quit\n");
		// Return an int.
		// Scanner return user selection.
	}

	/**
	 * Display options to move up, down, left, and right.
	 */
	public int moveSelection() {
		System.out.println("Where would you like to move?\n" + "1. Up\n"
				+ "2. Right\n" + "3. Down\n" + "4. Left\n");
		int direction = kb.nextInt();
		return direction;
		// Return an int for user selection. (Scanner)
	}

	/**
	 * Displays when you cannot move in a certain direction.
	 */
	public void invalidMovement() {
		System.out.println("You cannot move in that direction.");

		// Have the user select move again.
		this.moveSelection();
		// Return int for user selection.
	}

	/**
	 * Display dialogue relating to look selection.
	 */
	public void lookSelection() {

	}

	/**
	 * Displays option to save game and name the file.
	 */
	public void saveSelection() {

	}

	/**
	 * Gives option to quit game and asks for confirmation.
	 */
	public void quitSelection() {

	}

	/**
	 * Reveals the entire map to the player.
	 */
	public void debugMode() {

	}

	/**
	 * Prints the available choices and describes the actions for each choice.
	 */
	public void helpSelection() {

	}

	/**
	 * Sets all the initial values of the game including player status, lives,
	 * and legend.
	 */
	public void intitializeGameState() {

	}

	/**
	 * Every turn, updates all the movement
	 */
	public void updateGameState() {

	}

	public void printRoom(String[][] room) {
		for (int i = 0; i < room.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < room.length; j++) {
				System.out.print(room[i][j]);
			}
		}
		System.out.println("\n");
	}

	// --- MISC DIALOGUE ---
	// create a method for the exit to come back once the player has the
	// briefcase
	/**
	 * Displays the beginning of the game.
	 */
	public void gameStartDisplay() {
		System.out.println("Welcome to The Room of Death!\n"
				+ "Please select an option.\n" + "1. New Game\n"
				+ "2. Load Game\n" + "3. About\n" + "4. Controls\n"
				+ "5. Quit Game\n");
		// Implement menu system.
	}

	/**
	 * Prints when an enemy was hit
	 */
	public void hitEnemy() {
		System.out.println("You shoot your gun and hit an enemy!");
		// Bullet value now equal to 0.
	}

	// game engine should recieve info about where the player decides to shoot
	// return hit or miss and call UI
	/**
	 * Prints when player shoots, and nothing was hit.
	 */
	public void missShot() {
		System.out.println("You shoot your gun "
				+ "but hear it embed itself in a wall...");
		// Bullet value now equal to 0.
	}

	/**
	 * Prints when player exhausts all lives.
	 */
	public void gameOver() {
		System.out
				.println("You have lost all of your lives. " + "Game over...");
		// Ask user to start new game or exit.
	}

	/**
	 * Prints if user has briefcase and is at the exit
	 */
	public void gameWin() {
		System.out.println("Congratulations. "
				+ "You have escaped with the briefcase!");
	}

	/**
	 * Prints when player finds briefcase.
	 */
	public void foundBriefcase() {
		System.out.println("You have found the briefcase! "
				+ "Get to the exit!");
		// Top right of room.
	}

	/**
	 * Prints when player comes across an empty room.
	 */
	public void emptyRoom() {
		System.out.println("The room is empty...");
		// Ask user what to do next
	}

	/**
	 * Prints when ammo is picked up.
	 */
	public void ammoPickUp() {
		System.out.println("You have picked up a bullet!");
		// Change bullet value from "0" to "1".
	}

	/**
	 * Prints when you already have a bullet.
	 */
	public void ammoFull() {
		System.out.println("You already have a bullet "
				+ "and cannot pick up another!");
	}

	/**
	 * Prints when player picks up an invincibilty power up.
	 */
	public void invincibilityPickUp() {
		System.out.println("You are now invincible for 5 turns!");
	}

	/**
	 * Prints when a player picks up a scanner power up.
	 */
	public void scannerPickUp() {
		System.out.println("You have picked up a radar! Displaying briefcase "
				+ "location now...");
		// Display the location of the briefcase.

	}

}
