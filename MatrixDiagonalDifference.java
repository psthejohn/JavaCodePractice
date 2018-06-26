import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 	Authored by PUSHPINDER SINGH 
 * 	psthejohn@gmail.com
 */

public class MatrixDiagonalDifference {

	@SuppressWarnings("resource")
	public void enterMatrix() {

		// Inputs number of rows of a Matrix from user
		int a = 0, b = 0;
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		boolean check1 = false;
		boolean check2 = false;

		// Inputs number of rows of a Matrix from user
		while (!check1) {
			try {
				System.out.println("Enter number of rows");
				a = input1.nextInt();
				check1 = true;
			} catch (InputMismatchException e) {
				// input1.next();
				System.out.println("> i Doubt if  '" + input1.next().toUpperCase() + "' is a number, Let's try again ");
			}
		}

		// Inputs number of columns of a Matrix from user
		while (!check2) {
			try {
				System.out.println("Enter number of columns");
				b = input2.nextInt();
				check2 = true;
			} catch (InputMismatchException e) {
				// input2.next();
				System.out.println("> i Doubt if  '" + input2.next().toUpperCase() + "' is a number, Let's try again ");
			}
		}
		int rowNumber = a;
		int colNumber = b;
		int matrix[][] = new int[rowNumber][colNumber];

		System.out.println("\n" + " You have created a " + rowNumber + "x" + colNumber + " Matrix" + "\n");
		System.out.println("Now Let's Input Values");

		// Inputing elements of Matrix
		for (int i = 0; i < rowNumber; i++) {
			System.out.println("");
			for (int j = 0; j < colNumber; j++) {
				Scanner value = new Scanner(System.in);
				System.out.println("Enter element (" + i + "," + j + ") : ");
				matrix[i][j] = value.nextInt();
			}
		}

		System.out.println("\n" + "---------------------------- Matrix is -------------------------" + "\n");
		// Displaying Matrix
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print(" " + matrix[i][j] + "  ");
			}
			System.out.println("");
		}

		int sumLeftDiagonalElements = 0;
		int sumRightDiagonalElements = 0;

		// Checks if a Square Matrix, Hence Proceeds to Calculate Difference of sum of
		// Diagonal Elements of a Matrix
		if (rowNumber == colNumber) {
			// Selects Left Diagonal elements in this format --> \ of a Matrix
			for (int i = 0; i < rowNumber; i++) {
				for (int j = 0; j < colNumber; j++) {
					// Adds Left Diagonal side of Matrix Elements
					if (i == j) {
						sumLeftDiagonalElements += matrix[i][j];
						// System.out.println("Left Elements selected" + matrix[i][j]);
					}
				}
			}
			// System.out.println("Sum of Left Elements --- " + sumLeftElements);

			// Selects Right Diagonal elements in this format --> / of a Matrix
			for (int i = 0; i < rowNumber; i++) {
				int temp = 0;
				for (int j = colNumber - i; j > 0; j--) {
					if (j > temp) {
						temp = j - 1;
					}
				}
				// Adds Right Diagonal side of Matrix Elements
				sumRightDiagonalElements += matrix[i][temp];

			}
			System.out.print("\n" + "-> Difference is :: ");
			// Checks to never print a negative value
			if (sumRightDiagonalElements > sumLeftDiagonalElements) {
				System.out.println(sumRightDiagonalElements - sumLeftDiagonalElements);
			} else if (sumRightDiagonalElements < sumLeftDiagonalElements) {
				System.out.println(sumLeftDiagonalElements - sumRightDiagonalElements);
			} else if (sumLeftDiagonalElements == sumRightDiagonalElements) {
				System.out.println(
						sumLeftDiagonalElements - sumRightDiagonalElements + ", Both Diagonal have Equal values");
			}

		}
		// If not a Square Matrix, then can't calculate differece of sum of Diagonal
		// Elements of a Matrix
		else {
			System.out.println("\n" + "Can Not Calculate Difference/Determinant for Rows not Equal to Columns"
					+ "  !! Only Valid for Square Matrices !!");
		}
	}

	public static void main(String args[]) {
		System.out.println("----------------------- Taking Inputs as Matrix ---------------------");
		MatrixDiagonalDifference im = new MatrixDiagonalDifference();
		im.enterMatrix();
	}
}
