package com.corejava;

public class PatternPrinting_Feb9 {

	public static void main(String[] args) {
		printPattern7();

	}
	
 /*
	
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * *
	 
	*/
	
	public static void printPattern1()
	{
		
		for(int i=1; i<=5; i++)
		{
			for ( int j=1; j <=5 ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}
	
	/*
	 
	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
	
	*/
	
	public static void printPattern2()
	{
		
		for(int i=1; i<=5; i++)
		{
			for ( int j=1; j <=i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}
/*
	
	1 
	1 1 
	1 1 1 
	1 1 1 1 
	1 1 1 1 1
	
	 */
	
	public static void printPattern3()
	{
		
		for(int i=1; i<=5; i++)
		{
			for ( int j=1; j <=i ; j++)
			{
				System.out.print("1 ");
			}
			System.out.println();

		}
		
	}
	
	/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	*/ 
	
	
	
	
	public static void printPattern4()
	{
		
		for(int i=1; i<=5; i++)
		{
			for ( int j=1; j <=i ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
		
	}
	
	/*
	 * * * * * 
	 * * * * 
	 * * * 
	 * * 
	 * 
	 */
	
	public static void printPattern5()
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}

	

	/*
	
	* * * * * 
	  * * * * 
	    * * * 
	      * * 
	        * 
	  */  
	
	public static void printPattern6()
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<i;k++)
			{
				System.out.print("  ");
			}
			
			for(int j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}
	
/*
	
	* * * * * 
	 * * * * 
	  * * * 
	   * * 
	    * 
	  */  
	
	public static void printPattern7()
	{
		
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
	}

}
