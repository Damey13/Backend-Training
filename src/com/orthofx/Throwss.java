// Java program to demonstrate working of throws
package com.orthofx;

public class Throwss {

	// This method throws an exception
	// to be handled
	// by caller or caller
	// of caller and so on.
	static void fun() 
	{
		System.out.println("Inside fun(). ");
//		throw new IllegalAccessException("demo");
	}

	// This is a caller function
	public static void main(String args[]) throws IllegalAccessException
	{
//		try {
			fun();
//		}
//		catch (IllegalAccessException e) {
//			System.out.println("caught in main.");
//		}
	}
}
