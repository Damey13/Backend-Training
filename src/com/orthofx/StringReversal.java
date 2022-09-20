package com.orthofx;
import java.util.Scanner;


public class StringReversal {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String word=input.nextLine();
		int length=word.length();
		String rev="";
		for(int i=1;i<=length;i++) {
			rev=rev + word.charAt(length-i);
	}
System.out.println(rev);
}
}
