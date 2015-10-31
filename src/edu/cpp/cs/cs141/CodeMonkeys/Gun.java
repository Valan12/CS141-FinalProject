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
public class Gun {
	
	private int ammo = 1;
	
	public int getAmmo(){
		return ammo;
	}
	/**
	 * Before player shoots check if player has ammo. If ammo, shoot. 
	 * If there's no ammo, call UI to print no ammo.
	 * @return if true, the shot was a hit. If false, the shot was a miss.
	 */
	public boolean shoot(){
		return false;
	}

}
