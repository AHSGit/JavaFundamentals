package com.revision.backend.day01.CarModel;

public class Car {
	
	private String brand;
	private int speed;
	
	public Car() {
		this.brand = "Unknown";
		this.speed = 0;
	}
	
	public Car(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void accelerate(int increment) {
		speed += increment;
		System.out.println(brand + "\n>>> Speed increased by " + increment + " km/h\nNew speeed: " + speed + " km/h\n");
	}
	
	public void brake(int decrement) {
		speed -= decrement;
		speed = speed<0 ? 0 : speed;
		System.out.println(brand + "\n>>> Speed decreased by " + decrement + " km/h\nNew speeed: " + speed + " km/h\n");
	}
	
	public static void main(String[] args) {
		
		Car c0 = new Car();
		Car c1 = new Car("Ford", 50);
		Car c2 = new Car("Toyota", 80);
		
		c1.accelerate(20);
		c2.accelerate(15);
		
		c1.brake(18);
		c2.brake(12);
		
		c0.accelerate(0);
		c0.brake(5);
	}

}
