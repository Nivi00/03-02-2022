package com.mavenproject;

import java.util.Scanner;

public class Example3 
{

	public static void main(String[] args) 
	{
		
		//Write a java program to to display the given character by using switch-case statement.
		
		String character;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any character: ");
		character = scanner.next();
		
		switch(character)
		{
			
			//lower case alphabets
			case "a":
			case "b":
			case "c":
			case "d":
			case "e":
			case "f":
			case "g":
			case "h":
			case "i":
			case "j":
			case "k":
			case "l":
			case "m":
			case "n":
			case "o":
			case "p":
			case "q":
			case "r":
			case "s":
			case "t":
			case "u":
			case "v":
			case "w":
			case "x":
			case "y":
			case "z":
			
			//upper case alphabets
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
			case "F":
			case "G":
			case "H":
			case "I":
			case "J":
			case "K":
			case "L":
			case "M":
			case "N":
			case "O":
			case "P":
			case "Q":
			case "R":
			case "S":
			case "T":
			case "U":
			case "V":
			case "W":
			case "X":
			case "Y":
			case "Z":
				System.out.println("It is an alphabet");
				break;
			
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				System.out.println("It is a Digit");
				break;
			
			case "!":
			case "@":
			case "#":
			case "$":
			case "%":
			case "^":
			case "&":
			case "*":
			case "(":
			case ")":
			case "_":
			case "-":
			case "+":
			case "=":
			case "/":
			case "|":
			case "?":
			case "~":
			case "'":
			case ">":
			case "<":
			case "":
				System.out.println("It is a special character");
				break;

			default:
				System.out.println("kindly enter valid character.");
			
		}
		
		scanner.close();
		

	}

}
