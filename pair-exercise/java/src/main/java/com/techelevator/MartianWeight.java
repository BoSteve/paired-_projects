package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): c
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		// asking for earth weight, parsing to an int
		
		System.out.println("Enter a series of Earth weights (space-separated): ");
		String ew = userInput.nextLine();
		
		String [] inputArray = ew.split(" ");
		
		
		
		

		
		for (int i =0;i < inputArray.length; i++) {
		//	System.out.println(inputArray[i]);
			int earthWeight = Integer.parseInt(inputArray[i]);
			double wM = earthWeight * 0.378;
			
			System.out.println(earthWeight + " lbs. on Earth, is " + wM + " lbs. on Mars.");
		}
	}

}
