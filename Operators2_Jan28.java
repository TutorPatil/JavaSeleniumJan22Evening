package com.corejava;

public class Operators2_Jan28 {

	public static void main(String[] args) {	
		stringConcatinationOperator();
	}	
	
	// Arithmetic operators
	public static void aritmeticOperators()
	{
		int x = 10;
		int y = 20;
		
		System.out.println("x+y = " + (x+y) );
		
		System.out.println("y-x = "+(y   -    x));
		
		System.out.println("x*y="+(x * y));
		
		System.out.println("y/x = "+ (y /x));
		
		System.out.println("x%2 = " + (x % 2));	
		
		
		System.out.println(100+200);
		
		
	}
	
	// Relational operators
	public static void relationalOperators()
	{
		int x = 10;
		int y = 20;
		
		boolean b = ( x > y);
		
		System.out.println(b);
		
		System.out.println((x < y) +"  " + ( x > y) );
		
		System.out.println(x >= y);
		
		System.out.println(x <= y);
		
		
		
		
	}
		
	// Equality Operators
	public static void equalityOperators()
	{
		int x = 10;
		int y = 20;
		
		System.out.println((x == y));
		
		System.out.println( ( x != y ));
		
		
	}

	// Assignment operators..
	public static void assignmentOperators()
	{
		// simple assignment
		int x = 10;
		
		// chained assignment
		int a,b,c,d;
		a=b=c=d=100;
		
		// Compound assignment
		System.out.println(x += 20);  // x = x + 20 = 30
		
		System.out.println(x -= 10); // x = x - 10
		
		System.out.println(x *= 10);
		
		System.out.println(x /= 10);
		
		System.out.println(x %= 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void stringConcatinationOperator()
	{
		String s = "java";
		String s1 = "Selenium";
		
		
		System.out.println(s+s1);
		
		System.out.println(s+"     "+s1);
		
		System.out.println(s+"------"+s1);
		
		
		
	}
}
