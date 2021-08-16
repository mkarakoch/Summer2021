package selfexercises;

import java.util.Scanner;

public class practice001 {

	public static void main(String[] args) {
		/*
		 1- Ask credit card num from customer 
		 2- make sure its 16 dig
		 3- if its not 16 dig tell user that its wrong digit 
		 4-show last 4 digit. make * for rest of number 
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Please enter your credit card num");
		long cc = scan.nextLong();
		
		String str = " "+cc;
		
		if ( str.length()!=16) {
			System.out.println("Please enter a 16 digit");
		
		}else {
			String ccst = "************" + str.substring(str.length()-4);
			System.out.println(ccst);
			
			
			
		}
			
	}

}
