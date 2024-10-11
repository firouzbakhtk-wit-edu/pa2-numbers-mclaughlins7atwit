package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to PA2 part a assignment
 * When ran it gets the input of 5 numbers and outputs the sum and average of the positive, negative, and all numbers
 * @author Sean McLaughlin
 */
public class PA2a {
	/**
	 * Starts the program, asks for user input
	 * @param args command-line arguments ignored
	 */
	
	public static void main(String[] args) {
		int positiveSum =0;
		int negativeSum=0;
		int positiveCount =0;
		int negativeCount =0;
		int totalSum =0;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		//For loop
		for (int a = 0; a < 5; a++) {
			int userInput = input.nextInt();
			totalSum += userInput;
			//if statements
			if (userInput > 0) {
				positiveSum += userInput;
				positiveCount++;
			} else {
				negativeSum += userInput;
				negativeCount++;
			}
		}
		double positiveAverage =0.0;
		if (positiveCount > 0) {
			positiveAverage = (double) positiveSum / positiveCount;
		}
		double negativeAverage =0.0;
		if (negativeCount > 0) {
			negativeAverage = (double) negativeSum / negativeCount;
		}
		double totalAverage = (double) totalSum / 5;
			
		if (positiveCount == 1) {
			System.out.printf("The sum of the %d positive number: %d\n", positiveCount, positiveSum);
		} else {
			System.out.printf("The sum of the %d positive numbers: %d\n", positiveCount, positiveSum);
	
		}
		if (negativeCount == 1) {
			System.out.printf("The sum of the %d non-positive number: %d\n", negativeCount, negativeSum);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %d\n", negativeCount, negativeSum);
		}
		
		System.out.printf("The sum of the 5 numbers: %d\n", totalSum);
		
		if (positiveCount == 1) {
			System.out.printf("The average of the %d positive number: %.2f\n", positiveCount, positiveAverage);
		} else {
			System.out.printf("The average of the %d positive numbers: %.2f\n", positiveCount, positiveAverage);
		}
		if (negativeCount == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f\n", negativeCount, negativeAverage);
		} else {
			System.out.printf("The average of the %d non-positive numbers: %.2f\n", negativeCount, negativeAverage);
		}
		System.out.printf("The average of the 5 numbers: %.2f\n", totalAverage);
		input.close();
	}
		
		
}


