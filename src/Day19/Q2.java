package Day19;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		  Ask user to enter a character and print the ASCII value of the character
		  
		 */
		
				Scanner scan = new Scanner ( System.in);
				System.out.println("Please enter a value ");
				char ch = scan.next().charAt(0);
				
				int a = ch;
				
				System.out.println("ASCII value is " + a );
		

	}

}
