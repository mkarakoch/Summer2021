package selfexercises;

import java.util.Scanner;

public class Questions02EX {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a 4 digit integer, then print the sum of the first
		and the last digits of the number on the console.
		For example; if user enters 1234 you will add 1 and 4, then print on the console 5
	*/

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the 4 digit number");
		
		int num = scan.nextInt();

		if ( num >999 && num<10000) {
			
			int fdigit = num/1000;
			int ldigit = num%10;
			
			System.out.println("The sum is " + (fdigit+ldigit));
			scan.close();
			
		}
		
	}

}
