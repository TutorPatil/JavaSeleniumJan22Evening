package com.corejava;

public class Loops_Feb4 {

	public static void main(String[] args) {
		findFactorial();
		
	}
	
	public static void printMultiplicationTable()
	{
		int x = 1;		
		while( x <= 5)
		{
			int y = 1;
			while ( y <= 10)
			{
				System.out.println(x+" * "+y+" = "+(x*y)); // 1  * 1 = 1				
				y++;
			}
			System.out.println("===============");
			x++;
		}
	}

	
	
	public static void findFactorial()
	{
		int num = 5;
		int temp = num;
		int fact = 1;
		
		while ( num >1)
		{
			fact = ( fact * num );
			num--;
			
		}
		
		System.out.println(" The factorial of the num "+temp+" is "+fact);
	}

	public static void printEvenNumbersFrom1To100()
	{
		int x = 1;
		while ( x <= 100)
		{
			if( x % 2 == 0)
			{
				System.out.println(x);
			}
		x++;
		}
	}
	
	
	public static void printOddNumbersFrom1To100_1()
	{
		int x = 1;
		while ( x <= 100)
		{
			if( x % 2 == 0)
			{
				System.out.println(x);
			}
			else
			{
				System.out.println();
			}
		x++;
		}
	}
	
	public static void printOddNumbersFrom1To100_2()
	{
		int x = 1;
		while ( x <= 100)
		{
			if( x % 2 != 0)
			{
				System.out.println(x);
			}
			
		x++;
		}
	}
	
}
