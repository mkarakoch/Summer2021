package selfexercises;

import java.util.Scanner;

public class AbsolutenumIfElse {

	public static void main(String[] args) {
	/*
	 	Type java code by using if-else statement,
	 	
        Write a program to print absolute value of a number entered by user.
       
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		
		int a = scan.nextInt();
		int b = Math.abs(a);
		
		if (a>0) {
			
			System.out.println("absolute number is" + a);
		} else {
			
			System.out.println("absolute number is " + b);
		}
			
			
		
		
		
		scan.close();
		
		
		
		
		

	}

}
