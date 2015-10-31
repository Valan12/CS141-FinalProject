/**
 * 
 */
package edu.cpp.cs.cs141.CodeMonkeys;

import java.util.Random;

/**
 * @author Code Monkeys John Vincent Canalita Roland Lee Nicholas Pham Joshua
 *         Viray
 */
public class Grid {

	private Random random = new Random();

	/**
	 * 
	 * @param vision
	 *            passed in from player and enemy object.
	 */
	public void playerVision(int vision) {

	}

	/**
	 * This method essentially "sets" the game. It will randomly place the power
	 * up and enemies. Note, enemies will not spawn inside the designated safe
	 * zone.
	 * 
	 * @param room
	 */
	public String[][] initiateGameStage(String[][] room) {
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room.length; j++) {
				room[i][j] = "[_]";
			}
		}
		for (int i = 1; i < 8; i += 3) {
			for (int j = 1; j < 8; j += 3) {
				room[i][j] = "[R]";
			}
		}
		int a;
		int b;
		for (int i = 0; i < 7; i++) {
			do {
				a = random.nextInt(9);
				b = random.nextInt(9);
				if (room[a][b] != "[R]" && (b > 2 || a < 6)) {
					room[a][b] = "[E]";
				}
			} while (room[a][b] != "[E]");
		}
		for (int i = 0; i <= 2; i++) {
			a = random.nextInt(9);
			b = random.nextInt(9);
			if (room[a][b] != "[R]" && room[a][b] != "[E]" && i == 0) {
				room[a][b] = "[I]";
			}
			if (room[a][b] != "[R]" && room[a][b] != "[E]" && i == 1) {
				room[a][b] = "[A]";
			}
			if (room[a][b] != "[R]" && room[a][b] != "[E]" && i == 2) {
				room[a][b] = "[S]";
			}
		}
		return room;
	}

	/**
	 * A method that will create an another 2D 9x9 array that will be used for
	 * the location of the briefcase
	 */
	public String[][] briefCaseLocation(String[][] location) {
		for (int i = 0; i < location.length; i++) {
			for (int j = 0; j < location.length; j++) {
				location[i][j] = "[_]";
			}
		}
		int k = 0;
		int c = random.nextInt(9) + 1;
		for (int i = 1; i < 8; i += 3) {
			for (int j = 1; j < 8; j += 3) {
				 k ++;
				if (c == k){
						location[i][j] = "[B]";
					} else {
						location[i][j] = "[0]";
					}
				}
			}
		return location;
	}

	public String[][] spawnPlayer(String[][] room){
		room[8][0] = "[P]";
		return room;
	}
}

// create random generator for where the briefcase spawns
// if its 0 spawn in room 1
// etc

// create random number generator for where the items will spawn
// exclude the room location, player, and power up

// create random number generator for where the enemies will spawn
// exclude the rooms, player location, and player safe zone
