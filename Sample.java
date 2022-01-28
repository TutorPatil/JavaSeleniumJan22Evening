package com.corejava;

public class Sample {
	
	public static int countryCode = 91;

	public static void main(String[] args) {
		
		final int mobile = 45454; 
		System.out.println("Welcome to java by patil");
		System.out.println("java is really easy and fun to learn");
		System.out.println(countryCode);
		countryCode = 11;
		test();
		System.out.println("ending the main method");
		System.out.println(mobile);
		
		boolean isMarried = true;
		
		double salary = 4545.00;
		
	
	
		// Single line comment
		//int countryCode = 00;
		
		System.out.println(countryCode);
		
		
		
	}
	
	
	public static void test()
	{
		int mobile = 7878;
		System.out.println("inside the test method");
		System.out.println(mobile);
		System.out.println(countryCode);
	}
	
	

}
