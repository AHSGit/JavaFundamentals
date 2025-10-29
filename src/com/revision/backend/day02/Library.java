package com.revision.backend.day02;

public class Library {

	public static void main(String args[]) {

		try {
			Book b1 = new Book("The God of Small Things", "Arundhati Roy", 423, Genre.FICTION);
			b1.displayInfo();

			// Uncomment to trigger IllegalArgumentException
			Book b2 = new Book("The Satanic Verses", "Salman Rushdie", -348, Genre.FICTION);
			b2.displayInfo();
		
		} catch (IllegalArgumentException e) {
			System.err.print(e.getMessage());
			;
		}

	}
}
