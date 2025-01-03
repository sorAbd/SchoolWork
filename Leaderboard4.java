/**
 * Module 06: Conditional statement: if
 * Activity 3: Sorting of 3 variables
 * Program 2: Leaderboard 4
 */
package m06a3p2;

/**
 * Read from the command line the user name (single word) and number of points (double) for 4 gamers
 * Print the leader board starting with the user having the most points
 * @author Soroush Abdollahi
 *
 */
public class Leaderboard4 {

	/**
	 * Read from the command line the user name (single word) and number of points (double) for 4 gamers
	 * Print the leader board starting with the user having the most points
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Leaderboard 4 by Soroush Abdollahi");
		//Read the users and points from the commadn line
		String user1 = args[0];
		double points1 = Double.parseDouble(args[1]);
		String user2 = args[2];
		double points2 = Double.parseDouble(args[3]);
		String user3 = args[4];
		double points3 = Double.parseDouble(args[5]);
		String user4 = args[6];
		double points4 = Double.parseDouble(args[7]);
		//Put the users in order: user1 has the most points, next user2 and last user3
		if (points1 < points2) {
			//exchange user1 with user2
			String tempUser = user1;
			user1 = user2;
			user2 = tempUser;
			double tempPoints = points1;
			points1 = points2;
			points2 = tempPoints;
			//we know order u1, u2 is good
		}
		
		if  (points3 < points4) {
			String tempUser = user4;
			user4 = user3;
			user3 = tempUser;
			double tempPoints = points4;
			points4 = points3;
			points3 = tempPoints;
				if  (points2 < points3) {
				tempUser = user3;
				user3 = user2;
				user2 = tempUser;
				tempPoints = points3;
				points3 = points2;
				points2 = tempPoints;
				//we know order u1, u3 is good and u2, u3 is good
					if  (points1 < points2) {
						tempUser = user1;
						user1 = user2;
						user2 = tempUser;
						tempPoints = points1;
						points1 = points2;
						points2 = tempPoints;
					}
			}
		}
		
		//print the leaderboard
		System.out.println("LEADER BOARD");
		System.out.println("User: "+user1+"		- Points: "+points1);
		System.out.println("User: "+user2+"		- Points: "+points2);
		System.out.println("User: "+user3+"		- Points: "+points3);
		System.out.println("User: "+user4+"		- Points: "+points4);
		if (points1 == points2 ) {
			System.out.println("We have a tie for first place");
		} else {
			System.out.println("The winner is: " + user1);
		}
		
	}//end main

}
