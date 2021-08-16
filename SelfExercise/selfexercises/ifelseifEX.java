package selfexercises;

import java.util.Scanner;

public class ifelseifEX {

	public static void main(String[] args) {
		
		/*1 Get a number from user,
		 if the number is less than zero, print "Negative"
		 if the number is greater than zero, print "Positive"
		 if the number equals to zero, print "Neutr"
		 */
		
		/*Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Enter a number");
		
		int num = scan.nextInt();
		
		if ( num<0 ) {
			
			System.out.println(num + " is Negative");
		}else if (num>0) {
			System.out.println(num + " is positive");
			
		}else {
			System.out.println(num + " is Neutr");
			
		}
		System.out.println("===========================================");
		*/
		
		
		/*
		  
		   1. Get the day name from user, 
		   2. then tell to the user if it is week day or weekend day
		   
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the day...");
		
		String day = scan.next().toLowerCase();
		
		if ( day.equals("saturday") || day.equals("sunday")) {
			
			System.out.println("weekend");
		}  else if (day.equals("monday") || day.equals("tuesday")||day.equals("wednesday") || day.equals("thursday")||day.equals("friday")) {
			System.out.println("weekday");
			
		} else {
			
			System.out.println("Enter a day name ");
			
			} 
	
	   
		
		
		
		
		
		
	}

}
