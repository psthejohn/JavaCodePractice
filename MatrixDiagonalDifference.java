package com.practice.office.matrix;

import java.util.Scanner;

/*
 * 	Authored by PUSHPINDER SINGH 
 * 	psthejohn@gmail.com
 */
public class MatrixDiagonalDifference {

	@SuppressWarnings("resource")
	public void enterMatrix() {

		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rowNumber = input1.nextInt();

		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter number of columns");
		int colNumber = input2.nextInt();

		int matrix[][] = new int[rowNumber][colNumber];

		for (int i = 0; i < rowNumber; i++) {
			System.out.println("");
			for (int j = 0; j < colNumber; j++) {
				Scanner value = new Scanner(System.in);
				System.out.println("Enter element (" + i + "," + j + ") : ");
				matrix[i][j] = value.nextInt();
			}
		}

		System.out.println("\n" + "---------------------------- Matrix is -------------------------" + "\n");

		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print(" " +matrix[i][j] + "  ");
			}
			System.out.println("");
		}

		int sumLeftDiagonalElements = 0;
		int sumRightDiagonalElements = 0;

		if (rowNumber == colNumber) {
			for (int i = 0; i < rowNumber; i++) {
				for (int j = 0; j < colNumber; j++) {
					if (i == j) {
						sumLeftDiagonalElements += matrix[i][j];
						// System.out.println("Left Elements selected" + matrix[i][j]);
					}
				}
			}
			// System.out.println("Sum of Left Elements --- " + sumLeftElements);
			for (int i = 0; i < rowNumber; i++) {
				int temp = 0;
				for (int j = colNumber - i; j > 0; j--) {
					if (j > temp) {
						temp = j - 1;
					}
				}
				sumRightDiagonalElements += matrix[i][temp];

			}
			System.out.print("\n" + "-> Difference is :: ");
			if (sumRightDiagonalElements > sumLeftDiagonalElements) {
				System.out.println(sumRightDiagonalElements - sumLeftDiagonalElements);
			} else if (sumRightDiagonalElements < sumLeftDiagonalElements) {
				System.out.println(sumLeftDiagonalElements - sumRightDiagonalElements);
			} else if (sumLeftDiagonalElements == sumRightDiagonalElements) {
				System.out.println("0, Since Both Numbers");
			}

		} else {
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
