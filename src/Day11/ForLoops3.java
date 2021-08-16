package Day11;

import java.util.Scanner;

public class ForLoops3 {

	public static void main(String[] args) {
		
		
		for ( int i =1; i<4 ; i++) { // if this is True then 
			for (int j = 5 ; j<7 ; j++){// go to this loop , it keeps trying until it gets false 
				
										// once it gets false then goes to first loop and tries other value 
				System.out.println(i + "-" + j);
			}

			
		}
		
		/*
		 * 
		 * Ask user to enter the number of rows and the number columns then
		 	draw rectangle by using *	
		 	Example: row = 3, column=4
		 	         * * * *
		 	         * * * *
		 	         * * * *
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number of raws ");
		int row = scan.nextInt();
		
		
		System.out.println("Enter a num of columns");
		int column= scan.nextInt();
	
		for(int i = 1; i<=row; i++) {
			
			for(int j = 1 ;  j<=column; j++) {
				System.out.print(" * ");
				
			}
			System.out.println( " * ");
		}

	}

}
