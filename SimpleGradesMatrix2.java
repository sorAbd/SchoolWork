/**
 * Module 16: Bidimentional Arrays
 * Guided Activity 2: Read, process and print a matrix from a file
 * Program 1: Simple Grades Matrix 2
 */
package m16ga2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read from a file the number of students (<=100) the number of assignment (<=10)
 * the maximum grade per assignment(<=100),
 * and for each student the integer grades for each assignment
 * Check the data is correct and store it in variables.
 * Print a table with headers (assignment no and student no) with the information
 * Compute the sum of all assignments by row and average by row
 * NEW: Compute the minimum and the maximum grade to an assignment for each student
 * NEW: Compute the average, minimum, and maximum grade by a student for each of the assignments
 * NEW: Compute the average, minimum, and maximum grade and the computed information
 * Print a table with headers both with the original grade
 * and the computed information
 * 
 * @author Soroush Abdollahi
 *
 */
public class SimpleGradesMatrix2 {

	/**
	 * Read from a file the number of students (<=100) the number of assignment (<=10)
	 * the maximum grade per assignment(<=100),
	 * and for each student the integer grades for each assignment
	 * Check the data is correct and store it in variables.
	 * Compute the sum of all assignments by row and average by row
	 * NEW: Compute the minimum and the maximum grade to an assignment for each student
	 * NEW: Compute the average, minimum, and maximum grade by a student for each of the assignments
	 * NEW: Compute the average, minimum, and maximum grade and the computed information
	 * Print a table with headers both with the original grades 
	 * and the computed information
	 * 
	 * @param args = not used
	 */
	public static void main(String[] args) {
		System.out.println("Simple Grades Matrix 2 by Soroush Abdollahi");
		// Prepare the file
		Scanner scanner;
		try {
			scanner = new Scanner(new File("C:\\Users\\Soroush Abdollahi\\eclipse-workspace\\M16_20_Multidimentional_Arrays\\src\\m16\\ga1\\grades.txt"));
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error: File not found");
			return;
		}
		
		// Read and check the number of students (<=100)
		int numberOfStudents = scanner.nextInt();
		if (numberOfStudents<1 || numberOfStudents>100){
			System.out.println("ERROR: Invalid number of students (must be between 1 and 100)");
			return;
		}
		
		// Read and check the number of assignment (<=10)
		int numberOfAssignments = scanner.nextInt();
		if (numberOfAssignments<1 || numberOfAssignments>10){
			System.out.println("ERROR: Invalid number of assignments (must be between 1 and 10)");
			return;
		}
		// Read and check the maximum grade per assignment(<=100)
		int maxAssignmentGrade = scanner.nextInt();
		if (maxAssignmentGrade<1 || maxAssignmentGrade>10){
			System.out.println("ERROR: Invalid maximum grade per assignment (must be between 1 and 10)");
			return;
		}
		// Declare the grades matrix
		int[][] grade = new int[numberOfStudents][numberOfAssignments];
		
		// Read for each student the integer grade for each assignment
		for (int s=0; s<numberOfStudents; s++) {
			for (int a=0; a<numberOfAssignments; a++) {
				grade[s][a] = scanner.nextInt();
				if (grade[s][a] <0 ||grade[s][a] >maxAssignmentGrade ) {
					System.out.println("ERROR: Invalid grade");
				}
			}
		}
		
		// Compute the sum and average of grade (by row) for each student
		System.out.printf("\n\n COMPUTED SUM AND AVERAGE TABLE: \n\n");
		int[] sum = new int[numberOfStudents];
		double[] average = new double[numberOfStudents];
		for (int s=0; s<numberOfStudents; s++) {
			sum[s]=0;
			for (int a=0; a<numberOfAssignments; a++) {
				sum[s] +=grade[s][a];
			}
			average[s]= 1.0*sum[s]/numberOfAssignments;
			
		}
		
		// Compute the minimum and the maximum grade to an assignment for each student
		int[] minStudent = new int[numberOfStudents];
		int[] maxStudent = new int[numberOfStudents];
		for(int s=0; s<numberOfStudents; s++) {
			minStudent[s]=grade[s][0];
			maxStudent[s]=grade[s][0];
			for (int a =1; a<numberOfAssignments;a++) {
				if(grade[s][a]<minStudent[s])minStudent[s]= grade[s][a];
				else if(grade[s][a] > maxStudent[s]) maxStudent[s] =grade[s][a];
			}
		}
		// Compute the average, minimum, and maximum grade by a student for each of the assignments
		int[] sumAssignment = new int[numberOfAssignments];
		double[] averageAssignment = new double[numberOfAssignments];
		int[] minAssignment = new int[numberOfAssignments];
		int[] maxAssignment = new int[numberOfAssignments];
		for(int a=0; a<numberOfAssignments; a++) {
			sumAssignment[a] = grade[0][a];
			minAssignment[a] = grade[0][a];
			maxAssignment[a] = grade[0][a];
			for (int s=1; s<numberOfStudents; s++) {
				sumAssignment[a] += grade[s][a];
				if(grade[s][a] < minAssignment[a]) minAssignment[a]=grade[s][a];
				else if (grade[s][a]>maxAssignment[a]) maxAssignment[a]=grade[s][a];
			}
			averageAssignment[a] =1.0 *sumAssignment[a] / numberOfStudents;
		}
		// Compute the average, minimum, and maximum grade and the computed information
		int sumGlobal = 0;
		double averageGlobal;
		int minGlobal = grade[0][0];
		int maxGlobal = grade[0][0];
		for (int s=0; s<numberOfStudents; s++) {
			for(int a=0; a<numberOfAssignments; a++) {
				sumGlobal+=grade[s][a];
				if (grade[s][a]<minGlobal) minGlobal = grade[s][a];
				else if (grade[s][a]>maxGlobal) maxGlobal = grade[s][a];
			}
		}
		averageGlobal = 1.0*sumGlobal / (numberOfStudents * numberOfAssignments);
		
		// Print a table with headers containing also the computed sum and average in console
		System.out.printf("+-----+");
		for (int a=1; a<=numberOfAssignments; a++) {
			System.out.printf("-----+", a);
		}
		System.out.printf("------+---------+-----+-----+");
		System.out.println();
		
		System.out.printf("| STU |");
		for (int a=1; a<=numberOfAssignments; a++) {
			System.out.printf(" %3d |",a);	
		}
		System.out.printf("  SUM | AVERAGE | MIN | MAX |");
		System.out.println();
		
		System.out.printf("+-----+");
		for (int a=1; a<=numberOfAssignments; a++) {
			System.out.printf("-----+", a);
		}
		System.out.printf("------+---------+-----+-----+");
		System.out.println();
		for (int s=0; s<numberOfStudents; s++) {
			System.out.printf("| %3d |", (s+1));
			for (int a=0; a<numberOfAssignments;a++) {
				System.out.printf(" %3d |", grade[s][a]);
			}
			System.out.printf(" %4d |  %6.2f | %3d | %3d |", sum[s],average[s], minStudent[s], maxStudent[s]);
			System.out.println();
		}
		System.out.printf("+-----+");
		for (int a=1; a<=numberOfAssignments; a++) {
			System.out.printf("-----+", a);
		}
		System.out.printf("------+---------+-----+-----+");
		System.out.println();
		
		System.out.printf("| MIN |");
		for (int a=0; a<numberOfAssignments;a++) {
			System.out.printf(" %3d |", minAssignment[a]);
		}
		System.out.print("      |         |     |     |");
		System.out.println();
		
		System.out.printf("| MAX |");
		for (int a=0; a<numberOfAssignments;a++) {
			System.out.printf(" %3d |", maxAssignment[a]);
		}
		System.out.print("      |         |     |     |");
		System.out.println();
		
		System.out.printf("| AVG |");
		for (int a=0; a<numberOfAssignments;a++) {
			System.out.printf("%5.2f|", averageAssignment[a]);
		}
		System.out.print("      |         |     |     |");
		System.out.println();
		
		System.out.printf("+-----+");
		for (int a=1; a<=numberOfAssignments; a++) {
			System.out.printf("-----+", a);
		}
		System.out.printf("------+---------+-----+-----+");
		System.out.println();
		
		System.out.println("Global computations:");
		System.out.println("Minimum grade: "+minGlobal);
		System.out.println("Maximum grade: "+maxGlobal);
		System.out.println("Sum of all grades: "+sumGlobal);
		System.out.println("Average of all grades: "+averageGlobal);
		scanner.close();
	}

}
