/**
 * Module 19: Implementing a Turn-Based Game
 * Guided Activity 1: Player versus Monster
 * Program 1: Avoid Monster
 */
package m19.ga1;

import java.util.Scanner;

/**
 * Requirements: Generate a room as described in module 18.
 * Add a random monster on the table
 * At each turn: the player moves through the room by entering
 * a character turn by turn: a (left), s (down), d (right), w (up).
 * After that the computer selects a direction and moves randomly
 * if empty or stay unmoved if empty.
 * If teh user hits a wall, a monster or is hit by a monster dies.
 * if the user moved to Exit, wins.
 * 
 * @author Soroush Abdollahi
 *
 */
public class AvoidMonster {

	/**
	 * Implements described program requirements
	 * @param args - not used
	 */
	public static void main(String[] args) {
		System.out.println("Avoid Monster by Soroush Abdollahi"); 
		// Cells in the room
		final char EMPTY_CELL ='.';
		final char EXIT_CELL = 'E';
		final char PLAYER_CHAR ='o';
		final char WALL_CELL = '#';
		final char MONSTER_CHAR='*';
		final char WINNER_CHAR = 'W';
		final char LOSER_CHAR = '@';
		//Read the length (no of columns) and the width (no of rows) of the room
		Scanner scanner = new Scanner(System.in);
		int length;
		boolean error;
		do {
			System.out.print("The length of the room is:");
			length = scanner.nextInt();
			error = (length<4 || length>30);
			if (error) System.out.println("ERROR: Invalid length. Must be between 4 and 30.");
		} while (error);
		
		int width;
		do {
			System.out.print("The width of the room is:");
			width = scanner.nextInt();
			if (error) System.out.println("ERROR: Invalid width. Must be between 4 and 30.");
		} while (error);
		
		
		// Declare and initialize the room as empty
		char[][] room = new char[width][length];
		for (int i=0; i<width; i++) {
			for (int j=0; j<length; j++) {
				room[i][j] = EMPTY_CELL;
			}
		}
		
		// Place the exit
		int exitRow = (int)(Math.random()*width);
		int exitCol = (int)(Math.random()*length);
		room[exitRow][exitCol]=EXIT_CELL;
		// Place the player
		int playerRow;
		int playerCol;
		do {
			playerRow = 1+(int)(Math.random()*(width-2));
			playerCol = 1+(int)(Math.random()*(length-2));
		} while (room[playerRow][playerCol]!=EMPTY_CELL);
		room[playerRow][playerCol] = PLAYER_CHAR;
		
		// Add the walls
		for (int i=0; i<width; i++) {
			if (room[i][0]==EMPTY_CELL) room[i][0] = WALL_CELL;
			if (room[i][length-1]==EMPTY_CELL)room[i][length-1] = WALL_CELL;
		}
		for (int j=1; j<length-1; j++) {
			if (room[0][j]==EMPTY_CELL) room[0][j] = WALL_CELL;
			if (room[width-1][j]==EMPTY_CELL)room[width-1][j] = WALL_CELL;
		}
		
		
		// Read the number of obstacles
		int numberObstacles;
		do {
			System.out.print("Enter the number of obstacles:");
			numberObstacles = scanner.nextInt();
			error = (numberObstacles<0 || numberObstacles > 0.3*(width-2)*(length-2));
			if (error) System.out.println("ERROR: Invalid number of obstacles.");
		}while (error);
		
		// Place the inside obstacles
		for (int o=1; o<=numberObstacles;o++) {
			int obstacleRow;
			int obstacleCol;
			do {
				obstacleRow = 1+(int)(Math.random()*(width-2));
				obstacleCol = 1+(int)(Math.random()*(length-2));
			} while (room[obstacleRow][obstacleCol]!=EMPTY_CELL);
			room[obstacleRow][obstacleCol] = WALL_CELL;
		}
		
		// Place the monster
		int monsterRow;
		int monsterCol;
		do {
			monsterRow = 1+(int)(Math.random()*(width-2));
			monsterCol = 1+(int)(Math.random()*(length-2));
		}while (room[monsterRow][monsterCol] != EMPTY_CELL);
		room[monsterRow][monsterCol] = MONSTER_CHAR;
		// Repeat a turn by turn move
		boolean winner = false;
		boolean loser = false;
		do {
			// Print the room
			for (int i=0; i<width; i++) {
				for (int j=0; j<length; j++) {
					System.out.print(room[i][j] +" ");
				}
				System.out.println();
			}
			
			// Ask the user to move
			System.out.print("Your move a (left), s (down), d (right), w (up):");
			char move=scanner.next().charAt(0);
			int row = playerRow;
			int col = playerCol;
			switch (move) {
			case 'a':
				col--;
				break;
			case 'd':
				col++;
				break;
			case 's':
				row++;
				break;
			case 'w':
				row--;
				break;
			default:
				System.out.println("ERROR: Invalid move, use a, s, d, w.");
			}
			switch (room[row][col]) {
			case EXIT_CELL:
				winner=true;
				room[playerRow][playerCol]=EMPTY_CELL;
				room[row][col]=WINNER_CHAR;
				playerRow = row;
				playerCol = col;
				break;
			case EMPTY_CELL:
				room[playerRow][playerCol]=EMPTY_CELL;
				playerRow = row;
				playerCol = col;
				room[playerRow][playerCol]=PLAYER_CHAR;
				break;
			case PLAYER_CHAR:
				break;
			default:
				loser = true;
				room[playerRow][playerCol]=EMPTY_CELL;
				playerRow = row;
				playerCol = col;
				room[playerRow][playerCol]=LOSER_CHAR;
				break;
			}
			if (winner||loser) break;
			// Move the monster
			row = monsterRow +(int)(Math.random()*3)-1;
			col = monsterCol +(int)(Math.random()*3)-1;
			switch (room[row][col]) {
			case PLAYER_CHAR:
				loser=true;
				room[monsterRow][monsterCol]=EMPTY_CELL;
				monsterRow = row;
				monsterCol = col;
				room[monsterRow][monsterCol]=LOSER_CHAR;
				break;
			case EMPTY_CELL:
				room[monsterRow][monsterCol]=EMPTY_CELL;
				monsterRow = row;
				monsterCol = col;
				room[monsterRow][monsterCol]=MONSTER_CHAR;
				break;
			default:
				break;
			}
			
			if (loser) break;
			// Check the status
			}while (true);
		// Print the message win or lost and the final version of the room
			
			// Print the room
			for (int i=0; i<width; i++) {
				for (int j=0; j<length; j++) {
					System.out.print(room[i][j] +" ");
				}
				System.out.println();
			}
			if (winner) System.out.println("YOU WON!");
			else if (loser) System.out.println("YOU LOST");
			
			scanner.close();
	}

}
