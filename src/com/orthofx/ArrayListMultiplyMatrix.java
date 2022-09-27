package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMultiplyMatrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> Arr1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Arr2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Arr3 = new ArrayList<ArrayList<Integer>>();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows of 1st matrix");
		int r1 = input.nextInt();
		System.out.println("Enter the number of columns of 1st matrix");
		int c1 = input.nextInt();
		System.out.println("Enter the number of rows of 2nd matrix");
		int r2 = input.nextInt();
		System.out.println("Enter the number of columns of 2nd matrix");
		int c2 = input.nextInt();

		if (r1 == c2 && c1 == r2) {
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
			System.out.println("The resulting matrix is : ");
			for (int i = 0; i < r1; i++) {
				ArrayList<Integer> row = new ArrayList<Integer>(c2);
				for (int j = 0; j < c2; j++) {
					int itemAdd = 0;
					for (int k = 0; k < r2; k++) {
						itemAdd = itemAdd + Arr1.get(i).get(k) * Arr2.get(k).get(j);
					}
					row.add(itemAdd);
				}
				Arr3.add(row);
			}

			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					System.out.printf("%4d", Arr3.get(i).get(j));
				}
				System.out.println();

			}

		} else {
			System.out.println("Cannot Proceed");

		}
		input.close();

	}
}
