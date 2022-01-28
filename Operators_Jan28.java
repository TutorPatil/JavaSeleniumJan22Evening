package com.corejava;

public class Operators_Jan28 {
	
	static int y = 100;
	
	boolean b = false;
	
	public static void main(String[] args) {
		
		test();
		test1();
	}

	
	public static void test()
	{
		int x = 10;		
		System.out.println(x);
		System.out.println(y);
		y = 200;
		
//		System.out.println(b);
		
	}
	
	
	public static void test1()
	{
		// final x = 20;
		
		// Declaration
		int  x = 20;
		//Initialization
		x = 30;
		System.out.println(x);
		
		y = 0;
		System.out.println(y);
	}
	
	
}
