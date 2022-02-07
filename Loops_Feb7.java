package com.corejava;

public class Loops_Feb7 {

	public static void main(String[] args) {
		doWhileLoopEx2();
	}

	public static void checkPrime() {
		int num = 9;
		int x = 2;
		boolean isPrime = false;

		while (x < num) {
			if (num % x == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
			x++;
		}

// if( isPrime == true)
		if (isPrime)

		{
			System.out.println(" The given number is prime...");

		} else {
			System.out.println(" The given number is not prime...");
		}

	}

	public static void checkPrime_1() {
		int num = 47;
		int x = 2;
		boolean isPrime = true;

		while (x < num) {
			if (num % x == 0) {
				isPrime = false;
				break;
			}
			x++;
		}

// if( isPrime == true)
		System.out.println("The given number is prime ---" + isPrime);

	}

	public static void checkPrime_2() {
		int num = 1;
		int counter = 0;
		while (num < 100) {
			int x = 2;
			boolean isPrime = true;

			while (x < num) {
				if (num % x == 0) {
					isPrime = false;
					break;
				}
				x++;
			}
			if (isPrime) {
				System.out.println(num);
				counter++;
			}
			num++;
		}
		System.out.println();
		System.out.println(counter);

	}

	public static void doWhileLoopEx1() {

		int x = 1;

		/*
		while ( x > 10) 
		{ 
			System.out.println(" The value of x is "+x); 
			x++;
		}
		System.out.println(" after the while loop...");
		 
		*/
		
		do {
			System.out.println(" The value of x is "+x); 
			x++;			
		}while(x > 10);	

	}
	
	public static void doWhileLoopEx2() {

		int x = 1;
		
		do {
			System.out.println(" The value of x is "+x);
			x++;
		}while ( x <= 10);

	}
	
}
