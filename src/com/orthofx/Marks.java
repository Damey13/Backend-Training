package com.orthofx;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = input.nextInt();
		if (marks >= 90) {
			System.out.println("Amazing");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("Good");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("All right");
		} else {
			System.out.println("Okay");
		}
		input.close();

	}
}