package day06ternary_switch;

import java.util.Scanner;

public class ternary04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer.
		 if the number has 3 digits, output will be ' This number has 3 digits."
		 Otherwise, output will be " This number has no 3 digits."
		 */
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter an integer...");
		int a = scanner.nextInt();
		int b = Math.abs(a);
		
		
		String result =	a>99 && a<1000 ? a + " has 3 digits" : a + " has no 3 digits ";
		System.out.println(result);
			
				
	}

}
