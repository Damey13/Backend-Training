package com.orthofx;

import java.util.Scanner;

public class PyramidStar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		input.close();

	}
}
