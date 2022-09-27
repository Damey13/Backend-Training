package com.orthofx;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudents {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("Enter the number of Students");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Enter the name and mark of Students");
		for (int i = 0; i < n; i++) {
			String name = input.next();
			int marks = input.nextInt();
			map.put(name, marks);
		}
		System.out.println("Enter the name of the Student to print the marks");
		String searchstudent = input.next();

		if (map.containsKey(searchstudent)) {
			int result = map.get(searchstudent);
			System.out.println(result);

		}
		input.close();

	}

}
