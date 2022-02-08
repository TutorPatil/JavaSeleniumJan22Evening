package com.corejava;

public class Loops_FOrLoop_Feb8 {

	public static void main(String[] args) {
		printPrimeFrom1To100();
	}
	
	public static void forLoopExample1()
	{
		
		for(int x=1; x<=10; x++)
		{
			System.out.println(" The value of x is "+x);
			
			if( x == 5)
			{
				break;
			}
		}
		
		int y ;
		
		for(y=1; y<10;y++)
		{
			System.out.println("The value of y is "+y);
		}
		
		
	}
	
	public static void forLoopExample2()
	{
		
		for(int x=10; x>=1; x--)
		{
			System.out.println(" The value of x is "+x);
		}
	}
	
	
	public static void forLoopExample3()
	{
		
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=10; y++)
			{
				System.out.println(" The value of x is "+x);
				System.out.println(" The value of y is "+y);
			}
			
			
		}
		
	}
	
	public static void forLoopExample4()
	{
		
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=10; y++)
			{
				System.out.println(" The value of x is "+x);
				System.out.println(" The value of y is "+y);
				
				if(y==5)
				{
					break;
				}
			}
			
			if ( x == 3)
			{
				break;
			}
			
			
		}
		
	}
	
	
	public static void printMultiplicatioTableUsingForLoop()
	{
		
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=10; y++)
			{
				System.out.println(x +" x "+ y +" = " + (x*y));
			}
			System.out.println("=================");
			
			
		}
		
	}
	
	public static void findFactorialUsingForLoop()
	{
		int num;
		int fact = 1;
		
		for(num =5 ; num > 1; num-- )
		{
			fact = ( fact * num);
		}
		
		System.out.println(" The factorial is "+fact);
		
		
	}
	
	public static void printEvenNumbersFrom1To100()
	{
		for(int x=1; x<=100; x++)
		{
			if( x % 2 == 0)
			{
				System.out.println(x);
			}
		}
		
	}
	
	public static void printOddNumbersFrom1To100()
	{
		for(int x=1; x<=100; x++)
		{
			if( x % 2 != 0)
			{
				System.out.print(x+" , ");
			}
		}
		
	}
	
	public static void checkPrime()
	{
		int num = 49;
		boolean isPrime = true;
		
		for( int x = 2; x<num ; x++ ) 
		{
			if( num % x == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(" The number is prime");
		}
		else
		{
			System.out.println(" The number is  not prime");
		}
		
		
	}
	
	public static void printPrimeFrom1To100()
	{
		for( int num = 1; num <=100; num ++)
		{		
				boolean isPrime = true;		
				for( int x = 2; x<num ; x++ ) 
					{
						if( num % x == 0)
						{
							isPrime = false;
							break;
						}
					}
				
				if(isPrime)
				{
					System.out.print(num + " ");
				}
				
				
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
