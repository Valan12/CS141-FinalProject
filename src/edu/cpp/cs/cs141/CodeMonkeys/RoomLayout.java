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
 */
public class RoomLayout {
	
	Random random = new Random(); 

	/**
	 * 
	 * @param vision
	 *            passed in from player and enemy object.
	 */
	public void playerVision(int vision) {

	}

	public void initiateGameStage() {
		String[][] room = new String[9][9];
		for (int i = 0; i < room.length; i++) {
			for (int x = 0; x < room.length; x++) {
				room[i][x] = "[ X ]";
			}
		}

		for (int i = 1; i<8; i+=3){
			for (int x = 1; x<8; x+=3){
				room[i][x] = "[ R ]";
			}
		}
		int a;
		int b;		
		for (int i =0; i<7; i++){	

		do{
		a = random.nextInt(9);
		b = random.nextInt(9);
		if (room[a][b] != "[ R ]"){
			room[a][b] = "[ E ]";
		}
			
		}
		while(room[a][b] == "[ R ]");}
//		for (int i = 0; i < room.length; i++) {
//			System.out.print("\n");
//			for (int x = 0; x < room.length; x++) {
//				System.out.print(room[i][x]);
//
//			}
//		  }	
		
		for (int i =0; i<= 2; i++){
			a = random.nextInt(9);
			b = random.nextInt(9);

				if (room[a][b] != "[ R ]" && room[a][b] != "[ E ]" && i==0){
					room[a][b] = "[ I ]";
				}
				if (room[a][b] != "[ R ]" && room[a][b] != "[ E ]" && i==1){
					room[a][b] = "[ A ]";
				}
				if (room[a][b] != "[ R ]" && room[a][b] != "[ E ]" && i==2){
					room[a][b] = "[ S ]";
				}
				}
	for (int i = 0; i < room.length; i++) {
	System.out.print("\n");
	for (int x = 0; x < room.length; x++) {
		System.out.print(room[i][x]);

	}
  }
		}
	
	}

	// create random generator for where the briefcase spawns
	// if its 0 spawn in room 1
	// etc

	// create random number generator for where the items will spawn
	// exclude the room location, player, and power up

	// create random number generator for where the enemies will spawn
	// exclude the rooms, player location, and player safe zone
