package com.revision.backend.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

	public static void add(double a, double b) {
		System.out.println("\nResult = " + (a+b));
	}

	public static void sub(double a, double b) {
		double diff;
		if (a > b)
			diff = a - b;
		else
			diff = b - a;
		System.out.println("\nResult = " + diff);
	}

	public static void prod(double a, double b) {
		System.out.println("\nResult = " + (a*b));
	}

	public static void div(double a, double b) {
		System.out.println("\nResult = " + (a/b));
	}

	public static void mod(double a, double b) {
		System.out.println("\nResult = " + (a%b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		double num1, num2;
		
		do {
			try {
			System.out.println("\n<----- Calculator Menu ----->");
			System.out.println("1. ADD");
			System.out.println("2. SUBTRACT");
			System.out.println("3. MULTIPLY");
			System.out.println("4. DIVIDE");
			System.out.println("5. MODULUS");
			System.out.println("6. EXIT");
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			
				if (choice >= 1 && choice <= 5) {
					System.out.print("\nEnter first number: ");
					num1 = sc.nextDouble();
					System.out.print("\nEnter second number: ");
					num2 = sc.nextDouble();
					switch (choice) {
					
					case 1:
						add(num1, num2);
						break;
					
					case 2:
						sub(num1, num2);
						break;
					
					case 3:
						prod(num1, num2);
						break;
					
					case 4:
						if (num2 != 0) {
							div(num1, num2);
						} else
							System.err.println("\nERROR: Cannot divide by zero! Please try again.");
						
						break;

					case 5:
						mod(num1, num2);
						break;
					}
				}

				else if (choice != 6){
					System.err.println("ERROR: Please enter a valid choice!");
				}
			} catch (InputMismatchException e) {
				System.err.println("ERROR: Invalid input! Please enter numeric values only.");
				sc.nextLine();
			}

		} while (choice != 6);
		System.out.println("\nCalulator closed!");
		sc.close();
	}
}
