package com.revision.backend.day01.miniproject;

public class Student {
	
	private String name;
	private int rollNo, marks;
	private static int totalStudents;
	
	public Student(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		totalStudents++;
	}
	
	public char calculateGrade() {
		if(marks >= 90) return 'A';
		else if(marks >= 75) return 'B';
		else if(marks >= 60) return 'C';
		else return 'F';
	}
	
	public void displayInfo() {
		System.out.println("Name	: " + name);
		System.out.println("Roll No	: " + rollNo);
		System.out.println("Marks	: " + marks);
		System.out.println("Grade	: " + calculateGrade());
	}
	
	static void showTotalStudents() {
		System.out.println("Total students evaluated: " + totalStudents);
	}

}
