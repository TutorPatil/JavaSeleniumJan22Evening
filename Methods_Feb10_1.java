package com.corejava;

public class Methods_Feb10_1 {

	public static void main(String[] args) {
		//addNumbers(10,20);
		//addNumbers(100,200);
		//joinNameAndEmpId("Smith", 420);
		
		//checkPrime(47);
		
		//int sum = addNumbers(10,20);
		//System.out.println(sum);
		
		//int num = 5;
		//int fact = findFactoreal(num);
		//System.out.println(" The factorial of the number "+num + " is "+fact);
		
		//System.out.println(checkPrime(49));
		
		
		for ( int x = 1; x<=100; x++)
		{
			boolean result = checkPrime(x);
			if( result )
			{
				System.out.print(x+", ");
			}
		}
		
		

	}
	
	public static int addNumbers(int x, int y)
	{
	
		int sum = ( x + y );
		System.out.println(sum);
		return sum;	
		
		
	}
	

	public static String joinNameAndEmpId(String name, int empId)
	{
		String s = "Welcome "+name+" your Employe Number is "+empId;
		//String s = name+"  "+empId;
		
		System.out.println(s);
		return s;
		
	}
	
	public static int findFactoreal(int num)
	{
			
			int temp = num;
			int fact = 1;

			while (num > 1) {
				fact = (fact * num);
				num--;

			}

			//System.out.println(" The factoreal of the num " + temp + " is " + fact);
			return fact;
			 
		
	}
	
	
	
	public static boolean checkPrime(int num)
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
		
		return isPrime;
		
	}
	
	
	
	
}
