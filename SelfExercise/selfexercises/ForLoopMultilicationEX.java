package selfexercises;

import java.util.Scanner;

public class ForLoopMultilicationEX {

	public static void main(String[] args) {
		/*
		  Type code to find the multiplication of the numbers from 1 to 10
	
		 */
		
	
			int x =1;
			
		 for ( int i = 1 ; i <= 5 ; i++) {
		
		 x=x*i;
		 
		 }
		 System.out.println(x);
		 
		 /*
			 * ask user to enter a number to findd its fuctorial 
			 * 5! = 5*4*3*2*1
			 * 
		 */
		 
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter a number");
		 int num = scan.nextInt();
		 
		 int b = 1;
		 
		 for ( int f = num ; f>0; f--) {
		 
		 
		b = b*f;
		
		 }
		 
	System.out.println(b);
		 
		 

		 
		 
		 
		 
		 
		 

	}

}
