package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		
		// asking for bill amt
		System.out.println("What was your total bill?");
		String totalBill = userInput.nextLine();
		// Need to convert String to Double
		double billDouble = Double.parseDouble(totalBill);
		
		// asking for amount paid with
		System.out.println("What is the tender amount you are paying?");
		String userPMT = userInput.nextLine();
		// Need to convert String to Double
		double pmtDouble = Double.parseDouble(userPMT);
		
		// need to declare change to be used in calc
		double change = pmtDouble - billDouble;
		
		// subtract amout paid with from bill amt.
		System.out.println("Your change is " + change);
		
	}

}
