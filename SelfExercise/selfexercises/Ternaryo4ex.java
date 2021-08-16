package selfexercises;

import java.util.Scanner;

public class Ternaryo4ex {

	public static void main(String[] args) {
		
		
		/*
		 Ask user to enter an integer.
		 if the number has 3 digits, output will be ' This number has 3 digits."
		 Otherwise, output will be " This number has no 3 digits."
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer...");
		
		int a = scan.nextInt();
		int b = Math.abs(a);
		
		String result = a>99 && a<1000 ? a + "has 3 digits" : a +  "has does not have 3 digits";
		
		System.out.println(result);
		
		
	}

}
