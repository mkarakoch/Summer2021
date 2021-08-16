package day04_concat_if_else;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("the number is even");
			
		}
		
		if (num % 2 != 0 ) {
			System.out.println("the number is odd");
			
			
	}
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		
		// get a number from user, then check if the number is negative or positive 
		
		if (num2 > 0 ) {
			
			System.out.println("the number is +");
			
		}
		
		
		
	if (num2 < 0 ) {
			
			System.out.println("the number is -");
			
	}
	
		
	// get the length and the height of a rectangle from user, 
	//if they equal to each other 
	
	System.out.println("enter a side of the rectangle");
	double side1 = scan.nextDouble();
	
	System.out.println("enter a side2 of the rectangle");
	double side2 = scan.nextDouble();
	
if ( side1<0 || side2<0 ) {
		
		System.out.println("Error");
	}
	
	if (side1==side2) {   
		System.out.println("square");
		
	
	}
	
	if (side1 != side2) {
		System.out.println("Rectangle");
	
	}
		
	
	
	
	
	
		}
		
	}
	
	
	
