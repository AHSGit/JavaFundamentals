package com.revision.backend.OOPRefresher;

public class Product {
	
	public String name;
	public int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;		
	}
	
	void display() {
		System.out.println("Product: " + name + "; Price: Rs."+ price);
	} 

}

class ElectronicsProduct extends Product {
	
	public int warrantyMonths;
	
	public ElectronicsProduct(String name, int price, int warrantyMonths) {
		super(name, price);
		this.warrantyMonths = warrantyMonths;
	}
	
	@Override
	void display() {
		System.out.println("Product: " + name + "; Price: Rs."+ price + "; Warranty: " + warrantyMonths + " months");
	}
}
