package com.mavenproject;

import java.util.Scanner;

//Write a java program to calculate product of two numbers
public class Example2
{

	public static void main(String[] args)
	{
		
		//declared variables
		int num1, num2, product;
		
		//create Scanner class object
		Scanner scanner = new Scanner(System.in);
		
		//read values from keyboard
		
		System.out.println("Enter First Value:");
		num1 = scanner.nextInt();
		
		System.out.println("Enter Second Value:");
		num2 = scanner.nextInt();
		
		//write logic or operation
		product = num1*num2;
		
		//print output on the screen
		System.out.println("Product: "+product);
		
		//close Scanner class object
		scanner.close();
		
		System.out.println();

	}

}
