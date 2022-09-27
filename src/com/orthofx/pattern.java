package com.orthofx;

import java.util.Scanner;
import java.util.Stack;

public class pattern {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();

		Stack<Integer> numstack = new Stack<>();
		Stack<String> namestack = new Stack<>();
		int i = 0;
		namestack.push("");
		try {

			while (i < s.length()) {
				char ch = s.charAt(i);
				if (ch >= '0' && ch <= '9') {
					int start = i;
					while (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')
						i++;
					numstack.push(Integer.parseInt(s.substring(start, i + 1)));
				} else if (ch == '[') {
					namestack.push("");
				} else if (ch == ']') {
					String str = namestack.pop();
					StringBuilder sb = new StringBuilder();
					int times = numstack.pop();
					for (int j = 0; j < times; j += 1) {
						sb.append(str);
					}
					namestack.push(namestack.pop() + sb.toString());
				} else {
					namestack.push(namestack.pop() + ch);
				}
				i += 1;
			}

			System.out.println(namestack.pop());
		} catch (Exception e) {
			System.out.println("Invalid format");
		}
		input.close();

	}
}