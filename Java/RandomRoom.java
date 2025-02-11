/**
 * Module 18: Turn-Based Board Game
 * Guided Activity 1: Generate Board
 * Program 1. Random obstacles with a room with border
 */
package m18.ga1;

import java.util.Scanner;

/**
 * Create the representation of a room in a game as a matrix.
 * Read the length and width of the rooms as two integers.
 * We will have "width" rows and "length columns in the matrix.
 * Around the room there is a wall marked with '#'.
 * In the room there is one exit marked with 'E' randomly placed.
 * Also in the room there is a player marked with o.
 * Empty spaces are marked with '.'
 * Read a number of obstacles (walls '#') and place that number in the matrix.
 * Check that your number is not too big compared with the length and width
 * (i.e less or equal with .2*( (length-2) * (width-2) ))
 * Print the obtained matrix
 * 
 * @author Soroush Abdollahi
 *
 */
public class RandomRoom {

	/**
	 * Implement the program.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Random Room by Soroush Abdollahi");
		// Read the length (no of columns) and the width (no of rows) of the room
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
				room[i][j] = '.';
			}
		}
		
		// Place the exit
		int exitRow = (int)(Math.random()*width);
		int exitCol = (int)(Math.random()*length);
		room[exitRow][exitCol]='E';
		// Place the player
		int playerRow;
		int playerCol;
		do {
			playerRow = 1+(int)(Math.random()*(width-2));
			playerCol = 1+(int)(Math.random()*(length-2));
		} while (room[playerRow][playerCol]!='.');
		room[playerRow][playerCol] = 'o';
		
		// Add the walls
		for (int i=0; i<width; i++) {
			if (room[i][0]=='.') room[i][0] = '#';
			if (room[i][length-1]=='.')room[i][length-1] = '#';
		}
		for (int j=1; j<length-1; j++) {
			if (room[0][j]=='.') room[0][j] = '#';
			if (room[width-1][j]=='.')room[width-1][j] = '#';
		}
		
		
		// Read the number of obstacles
		int numberObstacles;
		do {
			System.out.print("Enter the number of obstacles:");
			numberObstacles = scanner.nextInt();
			error = (numberObstacles<0 || numberObstacles > 0.3*(width-2)*(length-2));
			if (error) System.out.println("ERROR: Invalid number of obstacles.");
		}while (error);
		
		scanner.close();
		// Place the inside obstacles
		for (int o=1; o<=numberObstacles;o++) {
			int obstacleRow;
			int obstacleCol;
			do {
				obstacleRow = 1+(int)(Math.random()*(width-2));
				obstacleCol = 1+(int)(Math.random()*(length-2));
			} while (room[obstacleRow][obstacleCol]!='.');
			room[obstacleRow][obstacleCol] = '#';
		}
		
		// Print the room
		for (int i=0; i<width; i++) {
			for (int j=0; j<length; j++) {
				System.out.print(room[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
