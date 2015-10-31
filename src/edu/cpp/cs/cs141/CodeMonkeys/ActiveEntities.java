/**
 * 
 */
package edu.cpp.cs.cs141.CodeMonkeys;

/**
 * @author Code Monkeys John Vincent Canalita Roland Lee Nicholas Pham Joshua
 *         Viray
 *
 */
public class ActiveEntities {

	// doesnt need to worry about vision
	// give it to the UI for the player to get feedback
	private boolean vision;

	private int health;

	public ActiveEntities() {
		health = 1;
	}

	/**
	 * 
	 * @param direction
	 *            Takes input from UI
	 */
	public void move(int direction) {
		switch (direction) {
		case 1: {
			//Move up
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}

		}

	}

	/**
	 * 
	 * @param health
	 *            passed in from Player.getHealth()
	 * @return
	 */
	public boolean die(int health) {
		return false;
	}

	public int getHealth() {
		return health;
	}

}
