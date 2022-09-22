package com.orthofx;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows of 1st matrix");
		int r1 = input.nextInt();
		System.out.println("Enter the number of columns of 1st matrix");
		int c1 = input.nextInt();
		System.out.println("Enter the number of rows of 2nd matrix");
		int r2 = input.nextInt();
		System.out.println("Enter the number of columns of 2nd matrix");
		int c2 = input.nextInt();
		int[][] arr1 = new int[r1][c1];
		int[][] arr2 = new int[r2][c2];
		int[][] arr3 = new int[r1][c1];
		if (r1 == r2 && c1 == c2) {
			System.out.println("Enter the elements of first matrix");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					arr1[i][j] = input.nextInt();
				}
			}
			System.out.println("Enter the elements of Second matrix");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					arr2[i][j] = input.nextInt();
				}
			}
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					arr3[i][j] = arr1[i][j] + arr2[i][j];
				}

			}
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(arr3[i][j]);
				}
				System.out.println();
			}

		}
		else
				System.out.println("Mismatched rows and column numbers");

	}
}
