package day03increment_decrement_operations;

import java.util.Scanner;

public class OrderOfOperations01 {

	public static void main(String[] args) {
		/*
		  order of operations 
		  
		  1- ()
		  2- Exponents 
		  3- Do multipications and divisions from left to right 
		  4- do addition and substraction from left to right
		  
		 */

		
//		Scanner scan = new Scanner (System.in);
//		System.out.println(" Enter your number  ");
//		int num = scan.nextInt();
//		
//		int lastDigit = num %10;
//		
//		System.out.println(lastDigit);
//		
//		System.out.println(" The last digit of the number is " + lastDigit);
		
		
		// Get a 3 - Digit integer from user and return the sum of its digit 
//		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" Please enter a three digit number ");
		
		int number = scan.nextInt();
		
		int lastDigit = 0;
		int midDigit = 0;
		int firstDigit = 0;
		int middle = 0;
		
		lastDigit = number%10;
		firstDigit = number/100; // 2.56 java will take 2, wont take decimals 
		middle = number/10;
		midDigit = middle%10;
		
		System.out.println(firstDigit + midDigit + lastDigit );

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
