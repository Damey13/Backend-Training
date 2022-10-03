package com.orthofx;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListMatrixAdd {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> Arr1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Arr2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Arr3 = new ArrayList<ArrayList<Integer>>();
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of rows of 1st matrix");
			int r1 = input.nextInt();
			System.out.println("Enter the number of columns of 1st matrix");
			int c1 = input.nextInt();
			System.out.println("Enter the number of rows of 2nd matrix");
			int r2 = input.nextInt();
			System.out.println("Enter the number of columns of 2nd matrix");
			int c2 = input.nextInt();

			if (r1 == r2 && c1 == c2) {
				System.out.println("Enter the elements of the 1st matrix");

				for (int i = 0; i < r1; i++) {
					Arr1.add(new ArrayList<Integer>());
					for (int j = 0; j < c1; j++) {
						Arr1.get(i).add(input.nextInt());
					}
				}
				System.out.println("Enter the elements of the 2nd matrix");

				for (int i = 0; i < r2; i++) {
					Arr2.add(new ArrayList<Integer>());
					for (int j = 0; j < c2; j++) {
						Arr2.get(i).add(input.nextInt());
					}

				}

				System.out.println("The resulting matrix is :");
				for (int i = 0; i < r1; i++) {
					Arr3.add(new ArrayList<Integer>());
					for (int j = 0; j < c1; j++) {
						Arr3.get(i).add(Arr1.get(i).get(j) + Arr2.get(i).get(j));
					}
				}
				System.out.println(Arr3);

			} else {
				System.out.println("Cannot Proceed");

			}
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Enter a number");
		}
	}
}
