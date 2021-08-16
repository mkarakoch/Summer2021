package selfexercises;

import java.util.Scanner;

public class Questioins2EX {

	public static void main(String[] args) {
		
		/*
		  
		Type java code by using nested if() statement.
		Ask user to enter a password 
		
		If the initial of the password is uppercase then check if it is ‘A’ or not. 
		If it is ‘A’ the output will be “Valid Password” 
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password  -   ali ==> Invalid  -  Mark ==> Invalid
		
		If the initial of the password is lowercase then check if it is ‘z’ or not. 
		If it is ‘z’ the output will be “Valid Password” 
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password  -   Zoe ==> Invalid  -  john ==> Invalid
*/
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Enter your password");
		
		String psw = scan.next();
		char initial =psw.charAt(0);
		
		if ( initial > 'A') {
			System.out.println("Valid Password");
			
	
			
			
		}

	}

}
