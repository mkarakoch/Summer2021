package selfexercises;

import java.util.Scanner;

public class IfStatement01Ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt(); // bu komut ekrana yazmasi icin 
		
		
		if( num % 2 == 0) {
			System.out.println("the number is even");
			 
	}
		
		if (num % 2 != 0 ) {
			
			System.out.println("the number is odd");
			
		}
		
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		
		if ( num2>=0 ) {
			
			
			System.out.println("the number is positive");
			
			if ( num2<0) {
					System.out.println("the number is negative");
					
					
			}
			
			
			////////////////////////////////////////////////////////////////
			
			
			System.out.println("Enter a side of the shape");
			double side1 = scan.nextDouble();
			
			
			
			
			System.out.println("Enter a side of the shape");
			double side2 = scan.nextDouble();
			
			if (side1<0 || side2<0) {
				System.out.println("Ne yapiyon AMK, Matematiginiz kim");
				
			}
			
			if (side1==side1) {
						System.out.println("Square");
			
			}
			
			if(side1!=side2) {
				System.out.println("Rectangle");
				
			}
			
			
				
				
				
			}
			
			
			
			
			
		}
		

	}


