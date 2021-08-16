package day05_ifelseif_nestedif;

import java.util.Scanner;

public class Nestedif02HW {

	public static void main(String[] args) {
		/* Homework
         * Type java code by using if-else statement, 
         * if the password is “JavaLearner”, output will be “The password is true”.
			Otherwise, output will be “The password is false”.
			Type java code by using if-else statement.
			A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
			Ask user for quantity and unit price then judge and print total cost for user.
			If the quantity is less than 1000 output will be “No discount.”
         */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("please enter the password");
		String psw = scan.next();
		
		
		if ( psw.endsWith("JavaLearner") ) {
			System.out.println("The password is True");
		} else {
			System.out.println("The password is False");
		}
			
			
	
		
		
		
		System.out.println("Please enter the quantitiy");
		int q = scan.nextInt();
		
		System.out.println("Please enter the unit price");
		double p = scan.nextDouble();
		
		if ( q < 1000) {
			
			System.out.println("No discount");
		} else {
			
			System.out.println("The total cost is " + ((q*p)*.9));
			
		}
			
		
		scan.close();
		
	
	}

}
