package selfexercises;

import java.util.Scanner;

public class Nested02Ex {

	public static void main(String[] args) {
		
		/*
	 	Ask user to enter an integer
	 	If the integer is less than zero check if it is less than -9. If it is less than -9 print "Too small" otherwise print "Small"
	 	If the integer is gretaer than zero check if it is greater than 9. If it is gretaer than 9 print "Too big" otherwise print "Big"
	 */
		
		Scanner scan = new Scanner ( System.in);
		int index = scan.nextInt();
		
		if (index <0 ) {
			if (index <-9) {
				System.out.println("too small");
				
			}else {
				System.out.println("small");
				}
			}else if ( index > 0) {
				if (index>9) {
					System.out.println("too big");
				}else {
					System.out.println("big");
					
				}
			
			}else {
				System.out.println("Please enter a number greated than or less than 0");
			}
				 
		scan.close();
		
	}

}
