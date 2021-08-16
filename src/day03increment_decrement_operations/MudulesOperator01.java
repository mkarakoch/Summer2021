package day03increment_decrement_operations;

import java.util.Scanner;

public class MudulesOperator01 {

	public static void main(String[] args) {
		
		
		/*
		 Modulus Operator (%) is used to find remainder when you divide a number.  - Kalani bulmak icin kullanilan moduldur.
		 
		 20 / 5 = 4
		 20 % 5 = 0 	 
		 */
		
		System.out.println(21%5);
		
		
		// Get a number from user and print the last digit of that number on the console 
		
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Please enter a number...");
//			int num = scanner.nextInt();
//			int lastDigit = num % 10;	// son kalan ondaligi bulmak icin 10 kullanilir. girilen numarayi 10 a boler ve kalani asagiya yazar.
//			System.out.println("The Last Digit of the Number is : " + lastDigit);
		// Get a 3-Digit intiger from user and return the sum of it's digit
		
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a 3-Digit number...");
			int number = scan.nextInt();
			int lastDigit = 0;
			int midDigit = 0;
			int firstDigit = 0;
			int middle = 0;
			
			lastDigit = number % 10 ;
			firstDigit = number / 100;
			middle = number/10;
			midDigit = middle%10;
			
			System.out.println(firstDigit + midDigit + lastDigit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
