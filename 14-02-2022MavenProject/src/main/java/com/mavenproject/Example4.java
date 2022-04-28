package com.mavenproject;

import java.util.Scanner;

public class Example4 
{

	public static void main(String[] args) 
	{
		/**
		 * Write a java program to validate the given number is positive or negative, if the number
		 * is positive then verify the number is even or odd. Using nested if-else statement
		 */
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		
		number = scanner.nextInt();
		
		if(number > 0)
		{
			
			//nested if-else statement
			if(number%2 == 0)
			{
				System.out.println("The number is an Even");
			}
			else
			{
				System.out.println("The number is an Odd");
			}
		}
		else
		{
			System.out.println("The number is negative");
		}
		
		scanner.close();

	}

}
