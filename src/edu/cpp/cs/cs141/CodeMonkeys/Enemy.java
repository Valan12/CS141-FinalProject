/**
 * 
 */
package edu.cpp.cs.cs141.CodeMonkeys;
import java.util.Random;
/**
 * @author Code Monkeys
 * 		   John Vincent Canalita
 * 		   Roland Lee
 * 		   Nicholas Pham
 * 		   Joshua Viray
 *
 */
public class Enemy extends ActiveEntities {

	/**
	 * 
	 */
	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return player's health is 0 because he died.
	 */
	public int stab(){
		return 0;
	}
	
	/**
	 * If player is next to enemy, returns true then stab.
	 * If false, move.
	 * @return
	 */
	public boolean check(){
		return false;
	}
	
	/**
	 * 
	 * @param direction uses randomizer 0 to 3 to determine movement.
	 */
	public void move(int direction) {
		
	}

}
