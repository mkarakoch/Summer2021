package selfexercises;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// get a number from a user, then tell IF the number is even or odd
		//then check if the number is negative or positive
		
	/*	System.out.println("Enter a number ");
		
		int num=scan.nextInt();
		
		if ( num % 2 == 0) {
			System.out.println("the number is even");
			
		}
		
		if ( num % 2 !=0) {
		
		System.out.println("the number is odd");
		
		}
	
		if ( num > 0) {
			System.out.println("and positive");
			
		}else {
			System.out.println("and negative");
		}
		
		*/
		
		// get the length and the height of a rectangle from user, 
		//if they equal to each other 
		
		
		
		System.out.println("enter the side1 of the shape");
		
		double side1 = scan.nextDouble();
		
		System.out.println("enter the side2 of the shape");
		
		double side2 = scan.nextDouble();
		
		
		if ( side1<0|| side2<0 ) {
			
			System.out.println("Matematik mi bilmiyon AMK, - kenar mi olur ");
		}
				
		if (side1 != side2 )
		{
			System.out.println("it's rectangle, eger bilmiyorsan ogreteyim gardas");
			
		}else {
			System.out.println("it's square");
			
		}
		
		
		
	}

}
