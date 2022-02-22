package com.java.classesandobjects;

public class Car {
	
	String colour;
	int noOfGears;
	boolean isAutomatic;
	String fuelType;
	int engineCapacity;
	int seatingCapacity;
	static final int noOfWheels = 4;	
	
	public void drive()
	{
		int x = 10;	
		System.out.println(" The car with the below details is been driven");
		System.out.println(" Colour "+colour);
		System.out.println(" noOfGears "+noOfGears);
		System.out.println(" isAutomatic "+isAutomatic);
		System.out.println(" fuelType "+fuelType);
		System.out.println(" engineCapacity "+engineCapacity);
		System.out.println(" seatingCapacity "+seatingCapacity);
		System.out.println(" accessing a static variable "+noOfWheels);
		
	}
	
	public static void  fillAirInTyres()
	{
		System.out.println(" No of wheels" + noOfWheels);
		System.out.println(" All the wheels needs air to be filled...");
	}
	

}
