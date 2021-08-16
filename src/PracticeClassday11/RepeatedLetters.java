package PracticeClassday11;

import java.util.Scanner;

public class RepeatedLetters {

	public static void main(String[] args) {
		/*
		 Ask user for a string and print a new string made of 3 copies s
of the last 2 letter The strings length will be at least 2.
ORNEK:
  INPUT      : Mustafa
  OUTPUT     : fafafa
		 */
		

		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Please enter your name ");
		
		String name=scan.next();
		String str=name.substring(name.length()-2);
		System.out.println(str);
		
		for (int i = 1 ; i<4 ; i++);
		
		System.out.print(str);
		
		

	}

}
