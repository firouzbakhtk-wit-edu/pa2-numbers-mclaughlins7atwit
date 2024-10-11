package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to PA2 part B assignment
 * 
 * @author Sean McLaughlin
 */

public class PA2b {
	/**
	 * Starts the program, asks for user input
	 * @param args command-line arguments ignored
	 */
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		int exponent = 2;
		
		double[] array = new double[3];
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		for(int i =0; i < array.length; i++) {
			double number = input.nextDouble();
			array[i] = number;
		}
		
		a = array[0];
		b = array[1];
		c = array[2];
		
		
		double discriminant = Math.pow(b, exponent) - (4*a*c);
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary\n");
		} else if (discriminant ==0) {
			double root = -b/ (2*a);
			System.out.printf("Root: %.2f\n", root);
		} else {
			double quadraticFormulaPositive = (-b + Math.sqrt(discriminant)) / (2*a);
			double quadraticFormulaNegative = (-b - Math.sqrt(discriminant)) / (2*a);
			
			System.out.printf("Roots: %.2f, %.2f\n", quadraticFormulaPositive, quadraticFormulaNegative);
		}
		
		input.close();
	}

}
