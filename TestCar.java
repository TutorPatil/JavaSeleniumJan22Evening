package com.java.classesandobjects;

public class TestCar {

	public static void main(String[] args) {
		
		int x ;
		x = 10;
		
		Car c;
		
		 c = new Car();
		
		c.colour = "white";
		c.engineCapacity = 1000;
		c.fuelType = "Petrol";
		c.isAutomatic = true;
		c.noOfGears = 4;
		c.seatingCapacity = 5;
		
		c.drive();
		
		System.out.println(Car.noOfWheels);
		
		// c.noOfWheels = 5; // Final variable cant be modified
		
		Car.fillAirInTyres();
		
		System.out.println("=============");
		
		Car c1 = new Car();
		
		c1.colour = "Black";
		c1.engineCapacity = 1200;
		c1.fuelType = "Diesel";
		c1.isAutomatic = false;
		c1.noOfGears = 5;
		c1.seatingCapacity = 8;
		
		c1.drive();
		

		System.out.println(c1.noOfWheels);
		
		c1.fillAirInTyres();
		
		
		
		
		

	}

}
