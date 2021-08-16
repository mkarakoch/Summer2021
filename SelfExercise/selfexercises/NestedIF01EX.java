package selfexercises;

import java.util.Scanner;

public class NestedIF01EX {

	public static void main(String[] args) {
		/*
	 	Ask user to enter his/her age and gender(M ==> Male, F==>Female)
	 	If the age is negative, and gender is different from 'M' and 'F' give error message
	 	If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
	 	If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
	 */

		
		
		 Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		
	System.out.println("Enter your gender (M , F)");
		
		
		char gender = scan.next().toUpperCase().charAt(0);
	
		if ( age<0) {
			System.out.println("Please enter a valid Age");
			
		}else if ( ! (gender == 'M' || gender == 'F')){
			System.out.println("Please enter a valid response");
			
		}else if ( age>65 ) {
			if ( gender == 'M') {
				System.out.println("Retired");
			}else if (age >65)
				if (gender == 'F')
				System.out.println("Retired");
				
			
		}else {
			System.out.println("Hadi len calismaya");
			
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
