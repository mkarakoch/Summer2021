package Day13;

import java.util.Scanner;

public class DoWhileLoop04 {

	public static void main(String[] args) {
		/*
		 * 
		 * Ask user to enter password.
			 If the password has more than 6 characters print "Password is valid..."
			 Otherwise, print "Make the password longer than 6 characters" and ask 
			 user to enter a new password
		 */
			Scanner scan = new Scanner (System.in);
			
			String psw=" ";
			
			
			do {
				System.out.println("Enter your password");
				
				 psw = scan.nextLine();
				 
				 if (psw.length()<=6 ) {
					 System.out.println("Please enter your passw more than 6 characters");
				 }
				
			}while(psw.length()<=6);
			System.out.println("Valid Password");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
