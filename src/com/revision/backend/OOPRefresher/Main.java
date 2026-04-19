package com.revision.backend.OOPRefresher;

public class Main {
	
	public static void main (String [] args) {
		Product p1 = new Product("Book", 200);
		ElectronicsProduct ep1 = new ElectronicsProduct("Laptop", 35000, 12);
		
		p1.display();
		ep1.display();
	}

}
