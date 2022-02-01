package com.corejava;

public class ConditionalStatements_Feb1 {

	public static void main(String[] args) {
		ifElseIfExample1();

	}
	
	public static void ifExample1()
	{
		// Declaring x and y
		int x = 10;
		int y = 50;
			
		if( x > y )
		{
			System.out.println(" Inside the true block");
			System.out.println(" x is greater than y ");
			
		}
		System.out.println("after the if block...");
		
	}
	
	//Nested if
	public static void ifExample2()
	{
		int x = 100;
		int y = 20;
		int z = 50;
		
		if( x > y)
		{
			// If there is only one statement in true or flase block then { is optional
			if( x > z)			
				System.out.println(" x is biggest");
		}	
		
	}
	
	public static void ifExample3()
	{
		
		if( 10 > 5)
		{
			System.out.println(" 10 is greater");
		}
		
		int x = 10;
		int y = 5;
		
	boolean result = (x > y);
	
	//if(result == true)
	if(result)
	{
		System.out.println(" x is greater than y");
	}
	
	if(true)
	{
		System.out.println("True block..");
	}
	
	}
	
	public static void ifElseExample1()
	{
		int x = 10;
		int y  = 5;
		
		if(x > y)
		{
			System.out.println(" x is bigger than y");
		}
		else
		{
			System.out.println(" y is bigger than x");
		}
		
	}

	public static void ifElseExample2()
	{
		int age = 26;
		String nationality = "Indian";
		
		if((age > 18) && (nationality.equals("Indian")))			
		
		//if( (age >= 18)  && (nationality.equals("Indian")))
		{
			System.out.println(" You are eligible for voting....");
		}
		else
		{
			System.out.println(" You are not eligible...");
		}
		System.out.println("after the if else...");
	}

	public static void ifElseIfExample1()
	{
		int month =11;
		
		if(month == 1)
		{
			System.out.println(" you are born in Jan and very lucky");
		}
		else if(month ==2 )
		{
			System.out.println(" you are born in Feb you will be very rich..");
		}
		else if(month == 3)
		{
			System.out.println(" you are born in March you will be very happy ...");
		}
		else
		{
			System.out.println(" Please enter the correct value for month...");
		}
		System.out.println(" after the complete if and else...");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
