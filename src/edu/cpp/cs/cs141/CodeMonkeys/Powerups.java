/**
 * 
 */
package edu.cpp.cs.cs141.CodeMonkeys;

/**
 * @author Code Monkeys
 * 		   John Vincent Canalita
 * 		   Roland Lee
 * 		   Nicholas Pham
 * 		   Joshua Viray
 *
 */
public class Powerups {

	Player spy = new Player();

	Gun playerGun = new Gun();

	private int whatPowerUp;

	/**
	 * pass in the playerPosition which holds the value of the array if that
	 * value is 5, 6, 7 the power up should be assigned
	 * 
	 * @param arrayValue
	 * @return
	 */
	public int powerUpSelection(int playerPostition) {
		String arrayValue = spy.checkSpace(position);
		if (arrayValue == "[A]") {
			maxAmmo();
			whatPowerUp = 1;
		} else if (arrayValue == "[S]") {
			scanner();
			whatPowerUp = 2;
		} else if (arrayValue == "[I]") {
			invincibility();
			whatPowerUp = 3;
		} else {
			// if there is no power up on the space, nothing happens
			// return null?
		}

	}

	/**
	 * method to max out the ammo if the initial bullet hasnt been used
	 * 
	 * @return
	 */
	public int maxAmmo() {
		int currentAmmo = playerGun.getAmmo();
		if (currentAmmo == 0) {
			currentAmmo = currentAmmo + 1;
		}
		return currentAmmo;
	}

	/**
	 * Gain invincibility for 5 turns
	 * 
	 * @return
	 */
	public void invincibility() {
		for (int i = 0; i < 5; i++) {
			// max out the hp so the player doesnt die
			spy.setHealth(100);
		}
		spy.setHealth(1);
	}
	
	/**
	 * would display the room where the brief case is 
	 */
	public void scanner(){
	}
	
	//enemy should just avoid the power up

}
