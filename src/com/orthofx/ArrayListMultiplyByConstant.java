package com.orthofx;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMultiplyByConstant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows of 1st matrix");
		int r1 = input.nextInt();
		System.out.println("Enter the number of columns of 1st matrix");
		int c1 = input.nextInt();
		ArrayList<ArrayList<Integer>> Arr1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> Arr2 = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the elements of the 1st matrix");

		for (int i = 0; i < r1; i++) {
			Arr1.add(new ArrayList<Integer>());
			for (int j = 0; j < c1; j++) {
				Arr1.get(i).add(input.nextInt());
			}
		}
		System.out.println("Enter the number to be multiplied");
		int n = input.nextInt();

		System.out.println("The resulting matrix is :");
		for (int i = 0; i < r1; i++) {
			Arr2.add(new ArrayList<Integer>());
			for (int j = 0; j < c1; j++) {
				Arr2.get(i).add(Arr1.get(i).get(j) * n);
			}
		}
		System.out.println(Arr2);
		input.close();

	}

}
