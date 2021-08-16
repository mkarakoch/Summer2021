package day10loops;

import java.util.Scanner;

public class Forloop03 {

	public static void main(String[] args) {
		/*
		 * Ask user enter a String 
		  Check if the string is Palindrome or not 
		  anna<==>anna 
		  123321<==>
		  
		  
		 */

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a string");
		String s = scanner.nextLine();
		
		String reversed = "";
		
		//Reverse String s
		
		
		for (int i = s.length()-1; i>=0; i--) {
			reversed = reversed+ s.charAt(i);
			
		}
		
		if (s.equals(reversed)) {
			
			System.out.println(s+ " is Palindrome");
			
		}else {
			System.out.println(s+ " is not palindrome");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
