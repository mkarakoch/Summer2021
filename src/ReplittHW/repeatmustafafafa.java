package ReplittHW;

import java.util.Scanner;

public class repeatmustafafafa {

	public static void main(String[] args) {
/*
		 Ask user for a string and print a new string made of 3 copies of the last 2 letters

		 The strings length will be at least 2.
		*/
	
		Scanner scan = new Scanner (System.in );
		System.out.println("Please Enter a string");
		String str = scan.next();
		
		
		int len = str.length();
		for (int i=0 ; i<3; i++) {
			System.out.print(str.substring(str.length()-2)); // Mustafa
			//str.substring -- bu bir kelimeyi bolmek icin 
		}

	}

}
