package com.orthofx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListNamesSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Enter the  10 names ");
		for (int i = 0; i < 10; i++) {
			String word = input.nextLine();
			names.add(word);
		}
		Collections.sort(names);
		System.out.println("The sorted array is: " + names);
		input.close();
	}

}
