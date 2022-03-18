package com.corejava.exceptions;

import java.io.File;
import java.io.IOException;

public class March_18_ExceptionHandling {
	
	String s = "selenium";

	public static void main(String[] args) throws IOException {
		
		//method1();
		
		File f = new File("D:\\temp.txt");
		
		f.createNewFile();

	}
	
	public static void method1()
	{
		int x = 10;
		//System.out.println(" inside method 1 and x value is "+x);
		method2();
	}
	
	

	public static void method2()
	{
		int y = 20;
		//System.out.println(" inside method 2 and y value is "+y);
		method1();
	}
	
	public static void test()
	{

		int x = 10;		
		int y = 0;		
		int z = x/y;		
		
		System.out.println("The value of z is "+z);
		
		int[] x1 = {1,2,3,4};
		
		//System.out.println(x1[10]);
		
		String s = "Selenium";
		
		s = null;
		
		
		System.out.println(s.length());
		
	}

}
