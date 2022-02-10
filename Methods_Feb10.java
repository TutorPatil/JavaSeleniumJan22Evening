package com.corejava;

public class Methods_Feb10 {

	public static void main(String[] args) {
		//addNumbers(10,20);
		//addNumbers(100,200);
		//joinNameAndEmpId("Smith", 420);
		//findFactoreal(4);
		//checkPrime(47);
		
		int sum = addNumbers(10,20);
		System.out.println(sum);
		
		
		

	}
	
	public static int addNumbers(int x, int y)
	{
	
		int sum = ( x + y );
		System.out.println(sum);
		return sum;
		
		
	}
	

	public static void joinNameAndEmpId(String name, int empId)
	{
		String s = "Welcome "+name+" your Employe Number is "+empId;
		System.out.println(s);
		
	}
	
	public static void findFactoreal(int num)
	{
			
			int temp = num;
			int fact = 1;

			while (num > 1) {
				fact = (fact * num);
				num--;

			}

			System.out.println(" The factoreal of the num " + temp + " is " + fact);
		
	}
	
	
	
	public static void checkPrime(int num)
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
			System.out.println(" The number is prime");
		}
		else
		{
			System.out.println(" The number is  not prime");
		}
		
		
	}
	
	
	
	
}
