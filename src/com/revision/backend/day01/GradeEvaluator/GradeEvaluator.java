package com.revision.backend.day01.GradeEvaluator;

import java.util.Scanner;

public class GradeEvaluator {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students to evaluate: "); // User inputs how many students to grade
		int count = sc.nextInt();
		sc.nextLine(); // clear buffer
		
		Student[] students = new Student[count]; // creating an array of student objects with size specified by user
		
		for(int i = 0; i < count; i++) {
			System.out.println("\nEnter details for Student " + (i+1) + ":"); // looping 'count' no of times 
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Roll No: ");
			int rollNo = sc.nextInt();
			
			System.out.print("Marks: ");
			int marks = sc.nextInt();
			sc.nextLine(); // clear buffer
			
			students[i] = new Student(name, rollNo, marks); // storing the details of the ith student in the array
		}
		
		System.out.println("\n--- Grade Report ---");
		for(int i = 0; i < students.length; i++) {		// looping through the array of student objects to display their info
			students[i].displayInfo();
			System.out.println("--------------------");
		}
		
		Student.showTotalStudents();	// calling static method to show total students evaluated
		sc.close();
	}
	
}
