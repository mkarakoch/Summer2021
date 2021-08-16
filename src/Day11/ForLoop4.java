package Day11;

import java.util.Scanner;

public class ForLoop4 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a lengths or the perpendicular side of an isoscles right triangle 
		 * then create the triangle by using * 
		 * Ex side lenght =3 
		 * 
		 */

		
		Scanner scan = new Scanner (System.in );
		
		System.out.println("Enter the lenght of the perpendiculat side ");
		int side = scan.nextInt();
		
		for (int i =1 ; i<side+1; i++) {
			for (int j = 1; j<i+1; j++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
		}
		
		
	
	
	
	
	
	
	
	
	
	
	}

}
