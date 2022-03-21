package com.corejava.exceptions;

public class March21_ExceptionHandling {

	public static void main(String[] args) {
		
		
		exceptionHandlingEx5();

}
	
	public static void exceptionHandlingEx1()
	{
		int x = 10;		
		int y = 0;
		int z = 0;
		
		try {
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");				 
			 
		}catch(ArithmeticException ae)
		{
			System.out.println("Inside the catch block for Arithematic exception");
			ae.printStackTrace();
		}
		System.out.println("The value of z is "+z);		
		System.out.println("out side of try catch block...");
		
		
	}
	
	public static void exceptionHandlingEx2()
	{
		int x = 10;		
		int y = 0;
		int z = 0;
		
		try {
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");				 
			 
		}catch(Exception ae)
		{
			System.out.println("Inside the catch block for Arithematic exception");
			ae.printStackTrace();
		}
		System.out.println("The value of z is "+z);		
		System.out.println("out side of try catch block...");
		
		
	}
	
	public static void exceptionHandlingEx3()
	{
		int x = 10;		
		int y = 0;
		int z = 0;
		int[] arr = {1,2,3,4};
		
		try {
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");
			 System.out.println(arr[5]);			 
			 System.out.println(" getting the value arr[5]");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside the catch block for Array Index Exception");
			ai.printStackTrace();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside the catch block for Arithematic exception");
			ae.printStackTrace();
		}
		catch(Exception ai)
		{
			System.out.println("Inside the catch block for Array Index Exception");
			ai.printStackTrace();
		}
		
		System.out.println("The value of z is "+z);		
		System.out.println("out side of try catch block...");
		
		
	}
	
	public static void exceptionHandlingEx4()
	{
		int x = 10;		
		int y = 10;
		int z = 0;
		int[] arr = {1,2,3,4};
		
		try {
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");
			 System.out.println(arr[5]);			 
			 System.out.println(" getting the value arr[5]");
		}
		catch(Exception ai)
		{
			System.out.println("Inside the catch block for Array Index Exception");
			ai.printStackTrace();
		}
		
		
		System.out.println("The value of z is "+z);		
		System.out.println("out side of try catch block...");
		
		
	}
	
	
	public static void exceptionHandlingEx5()
	{
		int x = 10;		
		int y = 0;
		int z = 0;
		
		try {
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");				 
			 
		}catch(Exception ae)
		{
			System.out.println("Inside the catch block for Arithematic exception");
			ae.printStackTrace();
		}finally
		{
			System.out.println(" Inside the finally block... this will run for sure..");
		}
		
		System.out.println("The value of z is "+z);		
		System.out.println("out side of try catch block...");
		
		
	}
	
	
	public static void exceptionHandlingEx6()
	{
		int x = 10;		
		int y = 0;
		int z = 0;
		
		try {
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");				 
			 
		}finally
		{
			System.out.println(" Inside the finally block... this will run for sure..");
		}
		
		System.out.println("The value of z is "+z);		
		System.out.println("out side of try catch block...");
		
		
	}
	
	
}
