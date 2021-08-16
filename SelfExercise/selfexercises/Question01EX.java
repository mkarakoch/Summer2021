package selfexercises;

import java.util.Scanner;

public class Question01EX {

	public static void main(String[] args) {
		
		/*
	 	Ask user to enter year
		Type java code by using if-else if() statement.
		Write a program to check if a year is leap year or not.
		if the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
    *
    *
    */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a year ");
		
		int y = scan.nextInt();
		
		
		if ( y % 100 == 0 && y % 400 == 0) {
			
			System.out.println(y + " is a leap year ");
			
		} else if ( y %100 == 0  && y % 4 == 0 ) {
			
			System.out.println(y + " is a leap year ");
		}else {
			System.out.println(y + " is not a leap year ");
			
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
