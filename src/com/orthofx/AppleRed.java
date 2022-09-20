package com.orthofx;

import java.util.Scanner;

public class AppleRed {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the fruit");
		String fruit=input.nextLine();
		switch(fruit) {
		case "apple":
			System.out.println("Red");
			break;
		case "banana":
			System.out.println("Yellow");
			break;	
		default:
			System.out.println("Green");

		}
	}

}
