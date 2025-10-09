package com.revision.backend.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNoChecker {
	
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		if(num == 2) return true;
		if(num % 2 == 0) return false;
		
		int sqrt = (int) Math.sqrt(num);
		for(int i = 3; i <= sqrt; i+=2) {
			if(num % i == 0) return false;
		}		
		return true;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			try {
				System.out.print("Enter number to check for prime: ");
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Please enter a valid number!\n");
				sc.nextLine(); //clear invalid input
			}
		}
		
		if(num <= 1) System.err.println("Only integers greater than 1 can be prime numbers!");
		else System.out.println(num + (isPrime(num) ? " is prime!" : " is not prime."));		
		
		sc.close();
	}

}
