package Day11;

import java.util.Scanner;

public class Forloop01 {

	public static void main(String[] args) {
		/*
		 * Type a program to find the sum of the integers from 1 to 100
		 * 
		 */
		
		int sum = 0 ;
		
		for ( int i = 1 ; i<5 ; i++) {
			
			sum = sum + i;
			
		}
		System.out.println("the sum is " + sum);

		
		
		/* 
		 *Ask user to enter starting and ending value 
		 *then find the sum of all integers from the starting to the ending value
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter a starting value");
		int x= scan.nextInt();
		
		System.out.println("Enter a ending value ");
		int y = scan.nextInt();
		if (y<x) {
			System.out.println("Invalid value ");
			
	} else {
		int sum1 = 0;
		
		for (int i = x; i<=y ; i++)
		{
			sum1=sum1+i;
			
		}
		
		System.out.println(" the sum is " + sum1);
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
