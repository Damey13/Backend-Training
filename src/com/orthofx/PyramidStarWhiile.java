package com.orthofx;

import java.util.Scanner;

public class PyramidStarWhiile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int i = 0, j = 0;
		while (i < num) {
			j = num - i;
			while (j > 1) {
				System.out.print(" ");
				j--;
			}
			j = 0;
			while (j <= i) {
				System.out.print("* ");
				j++;
			}

			System.out.println();
			i = i + 1;
		}
	}
}
