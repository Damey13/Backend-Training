package com.orthofx;

import java.util.Scanner;

public class MatrixMultiplyByConstant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows of 1st matrix");
		int r1 = input.nextInt();
		System.out.println("Enter the number of columns of 1st matrix");
		int c1 = input.nextInt();
		int[][] arr1 = new int[r1][c1];
		System.out.println("Enter the elements of the matrix");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the number to be multiplied");
		int n = input.nextInt();

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = arr1[i][j] * n;

			}
		}
		System.out.println("Output matrix is");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}

}
