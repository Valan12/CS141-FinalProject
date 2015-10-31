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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GameEngine Ultron = new GameEngine();
		Player spy = new Player();
		UI narrator = new UI();
		
		Ultron.setGrid();
		Ultron.setBriefCaseLocation();
		Ultron.spawnPlayer();
		//int direction = narrator.moveSelection();
		//spy.playerPosition(direction);
		Ultron.mockMove(spy.getVCoord(), spy.getHCoord(), Ultron.getGameGrid());
		

	}
}
