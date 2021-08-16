package ReplittHW;

import java.util.Scanner;

public class CreditCardandNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name=scan.next();
		System.out.println("Please enter yoour last name");
		String lname= scan.next();
		System.out.println("Please enter your 16 digit credit card number");
		long cc = scan.nextLong();
		
		String ccn = ""+cc;
		
		
	
		if ( ccn.length()!=16) {
			System.out.println("Invalid credit card number");
		}else {
			String ccndig = "************" + ccn.substring(ccn.length()-4);
		
		}

	}

}
