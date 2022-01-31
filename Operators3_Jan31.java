package com.corejava;

public class Operators3_Jan31 {
	
	/*
	List of operators 
	aritmeticOperators
	relationalOperators
	equalityOperators
	assignmentOperators
	stringConcatinationOperator
	conditionalOperator
	infinity
	NaN ( Not a Number )
	Logical Operators
	Increment and Decrement Operators
	*/

	public static void main(String[] args) {
		
		char c = 'a';		
		char d = 'b';		
		double d1 = 10.50;		
		System.out.println(c+d);		
		System.out.println(c+d1);
		
		
	}
	
	public static void conditionalOperator()
	{
		int a = 50;
		int b = 20;
				
		int c = ( a > b) ? 100 : 200;
		
		System.out.println(c);
		
		
		
	}

	
	public static void infinityOperator()
	{
		/*  Arithmetic exception when deviding whole number by zero
		int x = 10;		
		int y = 0;	
		int z = x / y;		
		System.out.println(z);
		*/
		
		int x = 100;
		
		double d = 0.0;
		
		int y = -100;
		
		System.out.println(x/d);
		System.out.println(y/d);
		
		

		
	}

	public static void nanOperator()
	{
		System.out.println(0/0.0);
		System.out.println(0.0/0);
		System.out.println(-0/0.0);
		
		
	}


	public static void logicalOperators()
	{
		int a = 10;
		int b = 20;
		
		int c = 100;
		int d = 200;
		
		String s = "selenium";
		
		// && -- AND operator
		
		boolean result = ( a < b ) && ( c < d); // t && t == TRUE
		System.out.println(result);
		System.out.println(( a > b ) && ( c < d)); // f && t == FALSE
		System.out.println(( a < b ) && ( c > d)); // t && f == FALSE 
		System.out.println(( a > b ) && ( c > d)); // f && f == FALSE
		
		
		System.out.println(( a < b ) && ( s.contains("se") )); // f && f == FALSE
		
		
		System.out.println( (true) && (true));
		
		
		System.out.println( (false) && (false));
		
		
		System.out.println("================================");
		
		/*
		  int a = 10;
		  int b = 20;		
		  int c = 100;
		   int d = 200;
		 */
	 
		System.out.println(( a < b ) ||  ( c > d)); //  t || f == TRUE
		System.out.println(( a > b ) || ( c < d)); // f || t == TRUE  
		System.out.println(( a < b ) || ( c > d)); // t || f == TRUE 
		System.out.println(( a > b ) || ( c > d)); // f || f == FALSE
		
		
		System.out.println("==========================");
		
		System.out.println(!( a < b ));   // ! true == FALSE  ! false == TRUE
		
		System.out.println(!false);
		
		
	}

	public static void incrementAndDecrementOperators()
	{
		int x = 10;
		
		//int y = ++x;
		
		//int y = x++;
		
		//int y = --x;
		
		int y = x--;
		
		
		
		System.out.println("x   " + x);
		System.out.println("y   " + y);
		
		
		
		
	}

}
