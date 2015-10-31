/**
 * 
 */
package edu.cpp.cs.cs141.CodeMonkeys;

/**
 * @author Code Monkeys John Vincent Canalita Roland Lee Nicholas Pham Joshua
 *         Viray
 *
 */
public class Player extends ActiveEntities {

	/**
	 * Holds the horizontal coordinate in the game grid
	 */
	private int vCoord;

	/**
	 * Holds the vertical coordinate in the game grid
	 */
	private int hCoord;

	private int lives = 3;

	private Gun playerGun = new Gun();

	/**
	 * Constructor
	 */
	public Player() {
		hCoord = 0;
		vCoord = 8;
	}

	public int getHCoord() {
		return hCoord;
	}

	public int getVCoord() {
		return vCoord;
	}

	public void setHCoord(int a) {
		a = hCoord;
	}

	public void setVCoord(int a) {
		a = vCoord;
	}

	public boolean shootGun() {
		return playerGun.shoot();
	}

	public boolean checkRoom() {
		return false;
	}

	public int getLives() {
		return lives;
	}

	public void playerPosition(int direction){
		if (direction == 1) {
			--vCoord;
		} else if (direction == 2) {
			++hCoord;
		} else if (direction == 3) {
			++vCoord;
		} else if (direction == 4) {
			--hCoord;
		}
		System.out.println(vCoord);
		System.out.println(hCoord);
	}

	/**
	 * @param playerHealth pass in the health from active entities, the super class to
	 * this subclass
	 * @return
	 */
	public void setHealth(int playerHealth) {
	}

	/**
	 * pass in the array to get the current value of where the player is
	 * 
	 * @return
	 */
	public int checkSpace(int[][] position) {
		return 0;
	}
}
