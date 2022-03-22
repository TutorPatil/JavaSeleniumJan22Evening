package com.corejava.exceptions;

import java.io.File;
import java.io.IOException;

public class March22_ExceptionHandling {

	public static void main(String[] args) throws InvalidAgeException 
	{
		
		Student s = new Student();
		s.name = "Ramu";
		s.age = 4;
		s.checkAge();
		
		
		/*
		 * try { exceptionHandlingEx4(); }catch(Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println("==============");
		 */
	}
	
	
	
	public static void exceptionHandlingEx4() throws Exception
	{
		
		int x = 10;		
		int y = 10;
		int z = 0;
		int[] arr = {1,2,3,4};
		
		
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");
			 System.out.println(arr[5]);			 
			 System.out.println(" getting the value arr[5]");
	}
	
	
	
	public static void exceptionHandlingEx3() throws ArithmeticException , ArrayIndexOutOfBoundsException
	{
		
		int x = 10;		
		int y = 10;
		int z = 0;
		int[] arr = {1,2,3,4};
		
		
			System.out.println("Inside the try block.");
			 z = x/y;		
			 System.out.println(" getting the value of z");
			 System.out.println(" Still in the try block...");
			 System.out.println(arr[5]);			 
			 System.out.println(" getting the value arr[5]");
	}
	
	
	
	//checkedExceptionEx1();
	
	public static void checkedExceptionEx1() throws IOException
	{
		
		File f = new File("D:\\temp.txt");
		f.createNewFile();
	}

	
	
	/*
	 * 
	 * 
	 * 	try {
			exceptionHandlingEx1();
		}catch(Exception ae)
		{
			ae.printStackTrace();
		}

		System.out.println("=============");

	 */
	public static void exceptionHandlingEx1() throws Exception
	{
		int x = 10;		
		int y = 0;
		int z = 0;	
	
	System.out.println("Inside the try block.");
	z = x/y;		
	System.out.println(" getting the value of z");
		
		
	}
	
	
	
}
