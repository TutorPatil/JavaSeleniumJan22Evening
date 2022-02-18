package com.corejava;

public class VarArgsCmdLine_Feb {

	public static void main(String[] args) {
		
		
		System.out.println(args.length);
		
		for( String m : args)
		{
			System.out.println(m);
		}
		
		if( args[0].equals("Firefox"))
		{
			System.out.println(" Running the test cases using Firefox...");
		}
		
		
		if( args[0].equals("Chrome"))
		{
			System.out.println(" Running the test cases using Chrome...");
		}
		
		
	}
	
	public static void create2DArrayInOneLine()
	{
		int[] m =  {10,20,30};
		
		int[][] x = {{30,40,50},{60,70}}; // 2 - 3 elements , 2 - 2 elements
		
		int[][] y = {{10,20,30},{40,50,60},{70,80,90}};  // 3 X 3 Array			
		
	}
	
	/*
	System.out.println(addNumbers(10,20));
	System.out.println(addNumbers(10,20,30));
	System.out.println(addNumbers(10));
	System.out.println(addNumbers(10,20,30,40));
	*/
	
	public static int addNumbers(int...x)
	{
		int sum = 0;
		
		for( int i = 0; i<x.length; i++)
		{
			sum = (sum + x[i]);
		}
		
		return sum;
		
	}
	
	//joinEmpDetails("Ramu","kulkarni","bangalore","Karnataka","india");
	public static void joinEmpDetails(String...x)
	{
		String s = "";
		/*
		for( int i = 0; i<x.length;i++)
		{
			s = s + x[i];
		}
		*/
		for(String m :x)
		{
			s = s+m+" ";
			
		}
		
		System.out.println(s);
			
		
		
	}
	
	
	
	
	
	
	

}
